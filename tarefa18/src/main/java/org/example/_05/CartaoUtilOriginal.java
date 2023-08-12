//https://www.devmedia.com.br/artigo-java-magazine-46-refactoring-da-teoria-a-pratica/10169
package org.example._05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CartaoUtilOriginal {
    public static final int VISA = 1;
    public static final int MASTERCARD = 2;
    public static final int AMEX = 3;
    public static final int DINERS = 4;
    public static final String CARTAO_OK = "Cartão válido";
    public static final String CARTAO_ERRO = "Cartão inválido";

    public boolean validar(int bandeira, String numero, String validade) {
        // ----- VALIDADE -----
        boolean validadeOK = false;
        Date dataValidade = null;
        try {
            dataValidade = new SimpleDateFormat("MM/yyyy").parse(validade);
        }catch (ParseException e) {
            return CARTAO_ERRO;
        }

        Calendar calValidade = new GregorianCalendar();
        calValidade.setTime(dataValidade);

        // apenas mês e ano são utilizados na validação
        Calendar calTemp = new GregorianCalendar();
        Calendar calHoje = (GregorianCalendar) calValidade.clone();
        calHoje.set(Calendar.MONTH, calTemp.get(Calendar.MONTH));
        calHoje.set(Calendar.YEAR, calTemp.get(Calendar.YEAR));

        validadeOK = calHoje.before(calValidade);

        if (!validadeOK) {
            return CARTAO_ERRO;
        } else {
            // ---- PREFIXO E TAMANHO -----
            String formatado = "";

            // remove caracteres não-numéricos
            for (int i = 0; i < numero.length(); i++) {
                char c = numero.charAt(i);
                if (Character.isDigit(c)){
                    formatado += c;
                }
            }

            boolean formatoOK = false;

            switch (bandeira) {
                case VISA: // tamanhos 13 ou 16, prefixo 4.
        formatoOK = formatado.matches("^4(\\d{12}|\\d{15})$");
                    break;
                case MASTERCARD: // tamanho 16, prefixos 51 a 55
        formatoOK = formatado.matches("^5[1-5]\\d{14}$");
                    break;
                case  AMEX: // tamanho 15, prefixos 34 e 37.
        formatoOK = formatado.matches("^3[47]\\d{13}$");
                    break;
                case  DINERS: // tamanho 14, prefixos 300  305, 36 e38.
        formatoOK = formatado.matches("^3[68]\\d{12}|0[0-5]\\d{11}$");
                   break;
                default:
                   formatoOK = false;
                   break;
            }

            if (!formatoOK) {
                return CARTAO_ERRO;
            }else {
                // ----- NÚMERO -----
                // fórmula de LUHN (http://www.merriampark.com/anatomycc.htm)
                int soma = 0;
                int digito = 0;
                int somafim = 0;
                boolean multiplica = false;

                for (int i = formatado.length() - 1; i >= 0; i--) {
                    digito = Integer.parseInt(formatado.substring(i,i+1));
                    if (multiplica) {
                        somafim = digito * 2;
                        if (somafim > 9) {
                            somafim -= 9;
                        }
                    } else {
                        somafim = digito;
                    }
                    soma += somafim;
                       multiplica = !multiplica;
                }

                int resto = soma % 10;
                if (resto == 0) {
                    return CARTAO_OK;
                } else {
                    return CARTAO_ERRO;
                }
            }
        }
    }
}


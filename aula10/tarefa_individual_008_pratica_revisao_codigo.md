### Tarefa 008: Prática de Revisão de Código - 12/05/2023

1. Cliente
Escolhe de tipagem incorreta (todos são String), o que faz com que uma quantidade grande de código adicional tenha que ser adicionado nos validators.  
2. PremioSeguro  
Grande encadeamento de ifs, que pode ser evitado com o padrão Cláusula de Guarda ou simplesmente sem usar else, já que as funções de validação contém "throw new exception".  
Uso de double não é bom o suficiente para representar dinheiro pois pode ocorrer erros de arredondamento, substituir por BigDecimal.
3. Teste  
Considerando a existência de testes implementados em uma estrutura mais convencional de organização (uma pasta acima de todo o código fonte), essa classe se mostra desnecessária.
4. DataUtils  
Dois métodos usam duas datas como parâmetros e um deve ser a data atual, o que significa que essa data pode ser gerada dentro do método.  
5. Estado Civil, Nacionalidade, Sexo  
É boas práticas usar enums para esse tipo de escolha com poucas opções pré-definidas, elimina a necessidade de muito código de validação  
Além disso, o código de validação de sexo considera Masculino ou Feminino como unicas possibilidades de input, desconsiderando o uso de letras, que também é comum - isso reforça a necessidade de enums.
</br>


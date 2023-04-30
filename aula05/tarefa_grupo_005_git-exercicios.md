### Tarefa Grupo 005: Git Exercícios - 28/04/2023.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


 1. Qual o comando para obter a versão instalada do Git?
</br> git -version

 2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
</br>  Lista comandos disponíveis
</br>    b. git help checkout
</br>  Documentação do comando checkout
</br>    c. git help merge
</br>  Documentação do comando merge
</br>    d. git init
</br> Transforma a pasta atual em um repositório git
</br>    e. git add --all
</br>  Adiciona todas as modificações de arquivos (seja modificação, criação ou deleção) ao staging.
</br>    f. git add -u
</br>  Atualiza os arquivos modificados já adicionados ao repositório (seja modificação ou deleção) ao staging.
</br>    g. git config -l
</br> Lista todas as configurações do git na máquina local.
</br>    h. git mv a.txt b.txt
</br>  Renomeia o arquivo a.txt para b.txt
</br>    i. git reset --hard
</br>  Deleta qualquer mudança, seja no staging ou na própria pasta local.
</br>    j. git log -27
</br> Exibe os últimos 27 commits na log.

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
</br> git add e git commit
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
</br> git show
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
</br> git status
6. Qual o comando para efetuar um _commit_?
</br> git commit
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
</br> git checkout -teste.txt
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
</br> Adicionar no arquivo .gitignore o nome da pasta como uma nova linha.
9. O que acontece se o seu repositório local for acidentalmente removido?
</br> O repositório remoto ainda poderá ser acessado
10. Como clonar um repositório remoto?
</br> git clone [url]
11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
</br> git log --oneline
12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
</br> .git/config
13. Qual o comando para criar um repositório local?
</br> git init
14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
</br> .git
15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
</br> git add .
16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
</br> SHA1 é um algoritmo de hashing que cria códigos relacionados aos arquivos criados e modificados e permite o git acompanhar mudanças.
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
</br> --abrev-commit
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
</br> Não, a flag -u apenas atualiza arquivos, não adiciona arquivos untracked.
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
</br> git reset --soft HEAD~1 é um comando que vai dar "soft" reset (sem deleção de arquivos) e remover o commit ao que a branch está apontando (HEAD~1, o último commit). Já o git reset --hard vai deletar todos os arquivos e mudanças diferentes de onde a branch está apontando (HEAD, por padrão). 
20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
</br> git clean -f -x
21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
</br>.gitignore
22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
</br> Adicionar *.class no arquivo .gitignore
23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
</br> Exibe nome e e-mail dos participantes.
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
</br> Exibe a URL do repositório remoto.
26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
</br> git tag
27. Caso um dado repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
</br> git tag -a [requerimento]
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
</br> Cria uma tag do tipo 3.4-gold com a mensagem "minha versão ouro"
29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
</br> Mostra detalhes da tag.
30. O que o comando **git push origin 3.4-gold** teria como efeito?
</br> Envia a tag para o repositório remoto origin.
31. Após executar um commit, qual o efeito de **git commit --amend**?
</br> Adiciona todas as mudanças que estão staged para o commit anterior.
32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
</br>  Remove x.txt (e suas mudanças) do staging. 
33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
</br> Reverte as mudanças
34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
</br> Head remove de staging, checkout reverte o arquivo.
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.



INSTRUÇÕES:

1. No seu repositório pessoal, na sua branch, criar a pasta aula05.
2. Commitar este arquivo respondido nesta pasta.
3. A data limite para concluir esta tarefa é dia 01/05/2023, as 23h59min.











</DIV/>

# REST API 



**REST**, acrônimo de *Representational State Transfer* - em português, Transferência de Estado Representacional, é o nome dado para definições de arquitetura que impõe limites específicos para um serviço de forma que o serviço resultante é eficiente, confiável, escalável e fácilmente distribuído. </br>
A ideia básica da arquitetura REST é que arquivos devem ser transferidos através de interações cliente-servidor padronizadas (e.g HTTP), que independe da línguagem de implementação do servidor. </br>
Seu caso de uso mais comum é a construção de APIs para a Web, sendo que essas são, as vezes, chamadas de APIs RESTful, mesmo que não sigam todos os limites da arquitetura REST.

Esse estilo de arquitetura foi definido por Roy Fielding no capítulo 5 de sua tese de dissertação *Architectural Styles and the Design of Network-based Software Architectures*,
e apresenta as seguintes ***seis características***:

### Interface Uniforme 
Essa característica se refere a interface entre o cliente e o servidor - ela deve ser uniforme para permitir que o desenvolvimento da aplicação e do servidor ocorram de forma independentes, pois mudanças na aplicação e no servidor ainda vão usar a mesma interface para se comunicar.
### Stateless ("sem estado") 
A comunicação entre cliente e servidor não deve armazenar nenhum dado que não pertença as próprias solicitações - a solicitação deve conter toda a informação necessária para efetuar as operações entre servidor e cliente.
### Cache
Armazenar informações em cache é essencial para criar tempos de resposta aceitáveis no servidor.
### Arquitetura cliente-servidor
Arquitetura em que cliente e servidor são necessariamente aplicações separadas e a transferência de recursos entre os dois é feita através de solicitações HTTP. Assim, o estado ou interface do lado do usuário não é uma informação atrelada ao servidor, assim como armazenamento de dados não é uma informação atrelada ao cliente/usuário. </br>
Isso significa que mudanças em como o banco de dados interage com o servidor, por exemplo, não devem afetar como o cliente recebe essa informação (desde que a Interface Uniforme seja aplicada)
### Sistema em camadas
Um sistema em camadas é um sistema que pode, opcionalmente, usar servidores intermediários entre o cliente e o servidor final, mas deve ser implementado de forma que essa diferença seja "invisível", sem diferenças aparentes entre o servidor final e o intermediário para o cliente. Essa limitação permite maior escalabilidade do sistema.

### Código "on demand"
A última característica é, na verdade, opcional em sistemas REST.
Código "on demand" significa que servidores podem, temporariamente, extender a funcionalidade do cliente através de uso de applets ou scripts. Fazer com que features possam ser baixadas opcionalmente e após o deploy do cliente aumenta a extensibilidade do sistema. É importante notar que, nos anos 2000, a maioria das páginas web eram estáticas e não dinâmicas, o que explica essa característica.

### Fontes

[*What is Rest*, Rest API Tutorial](https://www.restapitutorial.com/lessons/whatisrest.html) </br>
[*O que é uma API*, Hostinger](https://www.restapitutorial.com/lessons/whatisrest.html) </br>
[*Representational State Transfer (REST)*, Roy Fielding](https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm)

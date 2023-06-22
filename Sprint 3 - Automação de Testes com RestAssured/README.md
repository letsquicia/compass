# Plano de Testes - API ServeRest 

![API](https://gitlab.com/letsquicia/compass/-/raw/main/images/ServeRest.png)

## Resumo
   Este projeto tem como objetivo testar o cadastro de usuários no Marketplace da API ServeRest, garantindo que os processos de criação, atualização, listagem e exclusão de vendedores, usuários, produtos e carrinhos funcionem corretamente, atendendo a todos os requisitos e critérios estabelecidos nas user stories fornecidas, aqui citadas como US_01, US_02 e US_03. 

<br>

## US_02
### Cenários de teste endpoint */login*
* CTL_001: Inserir a senha inválida para um cadastro válido e tentar autenticar. 
* CTL_002: Inserir o e-mail errado e a senha correta e tentar autenticar.
* CTL_003: Deixar o campo email em branco e tentar realizar o login.
* CTL_004: Deixar o campo de senha em branco e tentar realizar o login. 
* CTL_005: Deixar ambos os campos em branco e tentar autenticar o login. 
* CTL_006: Acessar com um usuário não cadastrado na base de dados.
* CTL_007: Acessar com um usuário cadastrado na base de dados, para validar a autenticação com geração de token Bearer.
* CTL_008: Validar se o tempo de duração do token está em 10min.
* CTL_009: Validar se ao logar como administrador o token é gerado com a permissão de cadastrar produtos. 
* CTL_010: Validar se ao logar como  não administrador o token é gerado com a permissão de cadastrar produtos. 
* CTL_011: Validar se ao logar como administrador o token é gerado com a permissão de excluir produtos. 
* CTL_012: Validar se ao logar como não administrador o token é gerado com a permissão de excluir produtos. 
* CTL_013: Validar se ao logar como administrador o token é gerado com a permissão de alterar o cadastro de produtos. 
* CTL_014: Validar se ao logar como não administrador o token é gerado com a permissão de alterar o cadastro de produtos. 
* CTL_015: Validar se ao logar como administrador o token é gerado com a permissão de adicionar produtos no carrinho.
* CTL_016: Validar se ao logar como não administrador o token é gerado com a permissão de adicionar produtos no carrinho.
* CTL_017: Validar se ao logar como administrador é possível cancelar o carrinho de compras.
* CTL_018: Validar se ao logar como não administrador é possível cancelar o carrinho de compras.
* CTL_019: Validar se ao logar como administrador é possível efetuar a compra. 
* CTL_020: Validar se ao logar como não administrador é possível efetuar a compra. 


## US_01
### Cenários de teste endpoint */usuários* 
* CTU_001:Verificar se a listagem de vendedores está sendo visualizada de forma completa, sem ausência de dados. 
* CTU_002: Buscar por um cadastro via path com um ID inválido.
* CTU_003: Buscar por um cadastro via path com um ID válido. 
* CTU_004: Testar a busca via query por um ID, nome, email, password e administrador válidos.  
* CTU_005: Cadastrar um novo usuário inserindo todos os dados corretamente.
* CTU_006: Cadastrar um novo usuário com o campo ‘nome’ em branco.
* CTU_007: Cadastrar um novo usuário com o campo ‘e-mail’ em branco.
* CTU_008: Cadastrar um novo usuário com o campo ‘password’ em branco.
* CTU_009: Cadastrar um novo usuário com uma senha com menos de 5 caracteres.
* CTu_010: Cadastrar um novo usuário com uma senha com mais de 10 caracteres.
* CTU_011: Cadastrar um novo usuário com o campo ‘administrador’ em branco.
* CTU_012: Cadastrar um novo usuário com mais de um campo em branco.
* CTU_013: Cadastrar um novo usuário com o campo ‘administrador’ com um valor não booleano.
* CTU_014: Cadastrar um novo usuário com um e-mail já registrado.
* CTU_015: Cadastrar um novo usuário com e-mail do provedor ‘gmail’.
* CTU_016: Cadastrar um novo usuário com o e-mail do provedor ‘hotmail’. 
* CTU_017: Cadastrar um novo usuário com o e-mail sem o caractere ‘@’ para verificar se está obedecendo o padrão válido de e-mails.  
* CTU_018: Alterar o nome de um cadastro válido por um campo em branco. 
* CTU_019: Alterar o e-mail de um cadastro válido por um campo em branco.
* CTU_020: Alterar o password de um cadastro válido por um campo em branco.
* CTU_021: Alterar o password de um cadastro válido para uma senha menor que 5 caracteres.
* CTU_022: Alterar o password de um cadastro válido para uma senha maior que 10 caracteres.
* CTU_023: Alterar o campo administrador para um valor não booleano. 
* CTU_024: Alterar o e-mail de um cadastro válido para um e-mail do provedor ‘gmail’.
* CTU_025: Alterar o e-mail de um cadastro válido para um e-mail do provedor ‘hotmail’.
* CTU_026: Alterar o e-mail de um cadastro para um e-mail já existente em outro cadastro. 
* CTU_027: Alterar o e-mail de um cadastro válido, para o mesmo e-mail já utilizado.
* CTU_028: Alterar o e-mail de um cadastro válido, para um e-mail sem o ‘@’ para verificar se está obedecendo o padrão válido de e-mails.  
* CTU_029: Alterar o cadastro de um usuário via path com um ID inválido e verificar se irá ocorrer o cadastro desse usuário. 
* CTU_030: Excluir um cadastro válido com carrinho vazio. 
* CTU_031: Excluir um cadastro válido com produtos no carrinho.
* CTU_032: Excluir via path com ID invalido um cadastro inexistente. 

## US_03
### Cenários de teste endpoint */produtos*
* CTP_001: Testar se um usuário não autenticado pode gerar a listagem de todos os produtos e de um produto via path com o ID.
* CTP_002: Testar se um usuário autenticado como administrador  pode gerar a listagem de todos os produtos e de um produto via path com o ID.
* CTP_003: Testar se um usuário autenticado como não administrador pode gerar a listagem de todos os produtos e de um produto via path com o ID.
* CTP_004: Cadastrar um produto com um usuário não autenticado.
* CTP_005: Cadastrar um produto com um usuário autenticado como administrador. 
* CTP_006: Cadastrar um produto com um usuário autenticado como não administrador. 
* CTP_007: Cadastrar um produto com o nome já utilizado por outro produto.
* CTP_008: Cadastrar um produto com o campo ‘nome’ em branco. 
* CTP_009: Cadastrar um produto com o campo ‘preco’ em branco.
* CTP_010: Cadastrar um produto e no campo ‘preco’ inserir um valor float. 
* CTP_011: Cadastrar um produto e no campo ‘preco’ inserir um valor inteiro. 
* CTP_012: Cadastrar um produto com o campo ‘descrição’ em branco.
* CTP_013: Cadastrar um produto com o campo ‘quantidade’ em branco.
* CTP_014: Cadastrar um produto com o valor 0 no campo ‘quantidade’.
* CTP_015: Cadastrar um produto com uma combinação de campos em branco.
* CTP_016: Alterar um produto válido com um usuário não autenticado. 
* CTP_017: Alterar um produto válido com um usuário autenticado como administrador. 
* CTP_018: Tentar alterar um produto com ID inválido via path e validar o cadastro como novo produto. 
* CTP_019: Validar se o sistema irá aceitar a alteração do novo produto via ID inválido com um nome já existente na base de dados.
* CTP_020: Validar se o sistema irá aceitar a alteração do novo produto via ID inválido com o campo ‘nome’ em branco. 
* CTP_021: Validar se o sistema irá aceitar a alteração do novo produto via ID inválido com o campo ‘preco’ em branco. 
* CTP_022: Validar se o sistema irá aceitar a alteração do novo produto via ID inválido com o campo ‘preco’ com valor float. 
* CTP_023: Validar se o sistema irá aceitar a alteração do novo produto via ID inválido com o campo ‘preco’ com valor inteiro.
* CTP_024: Validar se o sistema irá aceitar a alteração do novo produto via ID inválido com o campo ‘descricao’ em branco.
* CTP_025: Validar se o sistema irá aceitar a alteração do novo produto via ID inválido com o campo ‘quantidade’ em branco.
* CTP_026: Validar se o sistema irá aceitar a alteração do novo produto via ID inválido com uma combinação de campos em branco.
* CTP_027: Excluir um produto com ID via path que não faz parte de nenhum carrinho. 
* CTP_028: Excluir um produto com ID via path que faça parte de um carrinho.
* CTP_029: Excluir um produto com ID inválido via path. 


## Testes candidatos a automação
A partir dos [fluxos prioritários](https://gitlab.com/letsquicia/compass/-/raw/main/images/Fluxos_Priorit%C3%A1rios.png), segue testes candidatos a automação: 

#### US_01: 

* CTU_001:Verificar se a listagem de vendedores está sendo visualizada de forma completa, sem ausência de dados. 
* CTU_005: Cadastrar um novo usuário inserindo todos os dados corretamente.
* CTU_012: Cadastrar um novo usuário com um e-mail já registrado.
* CTU_013: Cadastrar um novo usuário com e-mail do provedor ‘gmail’.
* CTU_014: Cadastrar um novo usuário com o e-mail do provedor ‘hotmail’. 
* CTU_015: Cadastrar um novo usuário com o e-mail sem o caractere ‘@’ para verificar se está obedecendo o padrão válido de e-mails.
* CTU_016: Alterar o nome de um cadastro válido por um campo em branco. 
* CTU_017: Alterar o e-mail de um cadastro válido por um campo em branco.
* CTU_018: Alterar o password de um cadastro válido por um campo em branco.
* CTU_019: Alterar o password de um cadastro válido para uma senha menor que 5 caracteres.
* CTU_020: Alterar o password de um cadastro válido para uma senha maior que 10 caracteres.
* CTU_022: Alterar o e-mail de um cadastro válido para um e-mail do provedor ‘gmail’.
* CTU_023: Alterar o e-mail de um cadastro válido para um e-mail do provedor ‘hotmail’.
* CTU_024: Alterar o e-mail de um cadastro para um e-mail já existente em outro cadastro. 
* CTU_027: Alterar o cadastro de um usuário via path com um ID inválido e verificar se irá ocorrer o cadastro desse usuário. 
* CTU_028: Excluir um cadastro válido com carrinho vazio. 
* CTU_029: Excluir um cadastro válido com produtos no carrinho.

#### US_02: 
* CTL_001: Inserir a senha inválida para um cadastro válido e tentar autenticar. 
* CTL_002: Inserir o e-mail errado e a senha correta e tentar autenticar.
* CTL_007: Acessar com um usuário cadastrado na base de dados, para validar a autenticação com geração de token Bearer.
* CTL_008: Validar se o tempo de duração do token está em 10min.
* CTL_009: Validar se ao logar como administrador o token é gerado com a permissão de cadastrar produtos. 
* CTL_010: Validar se ao logar como  não administrador o token é gerado com a permissão de cadastrar produtos. 
* CTL_011: Validar se ao logar como administrador o token é gerado com a permissão de excluir produtos. 
* CTL_012: Validar se ao logar como não administrador o token é gerado com a permissão de excluir produtos. 
* CTL_013: Validar se ao logar como administrador o token é gerado com a permissão de alterar o cadastro de produtos. 
* CTL_014: Validar se ao logar como não administrador o token é gerado com a permissão de alterar o cadastro de produtos. 
* CTL_015: Validar se ao logar como administrador o token é gerado com a permissão de adicionar produtos no carrinho.
* CTL_016: Validar se ao logar como não administrador o token é gerado com a permissão de adicionar produtos no carrinho.
* CTL_017: Validar se ao logar como administrador é possível cancelar o carrinho de compras.
* CTL_018: Validar se ao logar como não administrador é possível cancelar o carrinho de compras.
* CTL_019: Validar se ao logar como administrador é possível efetuar a compra. 
* CTL_020: Validar se ao logar como não administrador é possível efetuar a compra. 

#### US_03:
* CTP_001: Testar se um usuário não autenticado pode gerar a listagem de todos os produtos e de um produto via path com o ID.
* CTP_002: Testar se um usuário autenticado como administrador  pode gerar a listagem de todos os produtos e de um produto via path com o ID.
* CTP_003: Testar se um usuário autenticado como não administrador pode gerar a listagem de todos os produtos e de um produto via path com o ID.
* CTP_004: Cadastrar um produto com um usuário não autenticado.
* CTP_005: Cadastrar um produto com um usuário autenticado como administrador. 
* CTP_006: Cadastrar um produto com um usuário autenticado como não administrador. 
* CTP_007: Cadastrar um produto com o nome já utilizado por outro produto.
* CTP_007: Cadastrar um produto com o nome já utilizado por outro produto.
* CTP_008: Cadastrar um produto com o campo ‘nome’ em branco. 
* CTP_009: Cadastrar um produto com o campo ‘preco’ em branco.
* CTP_013: Cadastrar um produto com o campo ‘quantidade’ em branco.
* CTP_015: Cadastrar um produto com uma combinação de campos em branco.
* CTP_019: Validar se o sistema irá aceitar a alteração do novo produto via ID inválido com um nome já existente na base de dados.
* CTP_026: Validar se o sistema irá aceitar a alteração do novo produto via ID inválido com uma combinação de campos em branco.


## Local dos testes:
Localmente no endereço: http://localhost:3000

## Recursos necessários:
* Node.js para rodar a API localmente.
* Swagger ou mapa mental da API. 	
* Postman para análise dos cenários. 
* Local para armazenamento do resultado dos testes.
* Banco de dados e infraestrutura para desenvolvimento disponibilizados.

## Critérios usados:
* Os testes devem ser realizados de acordo com a análise de requisitos e critérios estabelecidos nas user stories. 
    * **US_01: [API] Usuários**, sendo eles:
    * Os vendedores (usuários) deverão possuir os campos NOME, E-MAIL, PASSWORD e ADMINISTRADOR;
    * Não deverá ser possível fazer ações e chamadas para usuários inexistentes;
    * Não deve ser possível criar um usuário com e-mail já utilizado;
    * Caso não seja encontrado usuário com o ID informado no PUT, um novo usuário deverá ser criado;
    * Não deve ser possível cadastrar usuário com e-mail já utilizado utilizando PUT;
    * Os testes executados deverão conter evidências;
    * Não deverá ser possível cadastrar usuários com e-mails de provedor gmail e hotmail;
    * Os e-mails devem seguir um padrão válido de e-mail para o cadastro;
    * As senhas devem possuir no mínimo 5 caracteres e no máximo 10 caracteres;
    * A cobertura de testes deve se basear no Swagger e ir além, cobrindo cenários alternativos.
    * **US_02: [API] Login**, sendo eles:
    *  Usuários não cadastrados não deverão conseguir autenticar;
    * Usuários com senha inválida não deverão conseguir autenticar;
    * No caso de não autenticação, deverá ser retornado um status code 401 (Unauthorized);
    * Usuários existentes e com a senha correta deverão ser autenticados;
    * A autenticação deverá gerar um token Bearer;
    * A duração da validade do token deverá ser de 10 minutos;
    * Os testes executados deverão conter evidências;
    * A cobertura de testes deve se basear no Swagger e ir além, cobrindo cenários alternativos.
    * **US_03: [API] Produtos**, sendo eles: 
    * Usuários não autenticados não devem conseguir realizar ações na rota de Produtos;
    * Não deve ser possível realizar o cadastro de produtos com nomes já utilizados;
    * Não deve ser possível excluir produtos que estão dentro de carrinhos (dependência API Carrinhos);
    * Caso não exista produto com o o ID informado na hora do UPDATE, um novo produto deverá ser criado;
    * Produtos criados através do PUT não poderão ter nomes previamente cadastrados;
    * Os testes executados deverão conter evidências;
    * A cobertura de testes deve se basear no Swagger e ir além, cobrindo cenários alternativos.
* Alguns dos testes serão automatizados para agilidade na execução e maior confiabilidade nos resultados.
* Além dos testes cobertos pelo Swagger, foram elaborados casos de teste para cenários alternativos.



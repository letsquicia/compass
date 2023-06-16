# Plano de Testes
## Nome do projeto
  ### Testando o Cadastro de Vendedores no Marketplace do ServeRest para venda de produtos. 
## Resumo
   Este projeto tem como objetivo testar o cadastro de usuários no Marketplace da API ServeRest, garantindo que os processos de criação, atualização, listagem e exclusão de vendedores, usuários, produtos e carrinhos funcionem corretamente, atendendo a todos os requisitos e critérios estabelecidos na user story fornecida. 

## Pessoas envolvidas
  Equipe de testadores: Letícia Clasen & cia

## Cenários de teste
* CT_001: Validação dos campos de todos os vendedores
    * Verificar se a listagem de vendedores está completa e exibindo todas as informações corretas ao requisitar a lista de todos os vendedores.
* CT_002: Cadastro de um novo usuário com dados corretos
    * Testar se a criação de um novo vendedor com os campos obrigatórios preenchidos corretamente (nome, e-mail, password e administrador) é realizada com sucesso.
* CT_003: Cadastro de um novo usuário com dados em branco
    * Validar se na criação de um vendedor com mais de um ou todos campos em branco, retorna uma mensagem informando o problema e não cadastra o vendedor no sistema.
* CT_ 004: Combinação de campos inválidos no cadastro
    * Validar a criação de um cadastro de vendedor com alguns campos preenchidos corretamente e outros não, espera-se que não seja registrado o novo vendedor e retorne status code de erro.
* CT_ 005: Campo administrador com opção inválida
    * Testar se ao inserir um valor não booleano no campo administrador o sistema irá cadastrar o vendedor, espera-se que não cadastre e retorne erro.
* CT_ 006: E-mail já vinculado a outro usuário
    * Verificar se a regra de não ser possível criar um usuário com um e-mail já utilizado por outro vendedor está funcionando corretamente, ou seja, retorna erro caso o e-mail já exista e não realiza o cadastro do novo vendedor.
* CT_007: Alteração de e-mail para e-mail já existente
    * Ao enviar uma requisição de alteração de e-mail em um cadastro que corresponde ao mesmo e-mail de um vendedor já cadastrado, não deve ser feita alteração e deve retornar erro.
* CT_008: Alteração de e-mail para o mesmo e-mail já utilizado
    * Ao realizar a alteração do e-mail do usuário para o e-mail que ele já utiliza, a alteração deve ser concluída com sucesso.
* CT_009: Cadastro de novo vendedor ou cliente com e-mail Gmail ou Hotmail
    * Deve-se testar se ao realizar o cadastro de um novo usuário com e-mail dos servidores Gmail ou Hotmail irá retornar erro e aviso de que o usuário não foi cadastrado.
    * Ao inserir um e-mail que não seja dos provedores citados, o cadastrado deve ser realizado com sucesso.
* CT_010: Padrão válido de e-mails
    * Ao preencher todos os campos corretamente, mas um e-mail fora do padrão esperado (nome@exemplo.com) o sistema não deve cadastrar o usuário e deve retornar erro.
* CT_ 011: Busca por cadastro inexistente
    * Ao realizar a busca por ID de um usuário não cadastrado deve retornar erro.
* CT_012: Atualização de cadastro com ID inexistente 
    * Ao entrar com o ID de um usuário inexistente para tentativa de realizar alguma alteração cadastral, deve retornar um aviso de que o usuário não existia e foi cadastrado. 
* CT_013: Exclusão de usuário inexistente 
    * Deve-se testar se ao tentar realizar a exclusão de um usuário com ID inexistente o sistema irá retornar erro. 
* CT_ 014: Tamanho ideal das senhas
    * Realizar a tentativa de cadastro de um user com a senha entre 5 e 10 caracteres, o registro deve ser realizado com sucesso.
* CT_ 015: Senha com menos de 5 caracteres e mais de 10
    * Ao tentar cadastrar um usuário com uma senha com a quantidade de caracteres inferior a 5 ou maior que 10, não deve ser realizado o registro do usuário e deve retornar erro.
* CT_016: Alteração de senha
    * Validar se ao tentar realizar a alteração da senha de um usuário já cadastrado para uma senha com mais de 10 caracteres e menos de 5, o sistema retorna erro e não realiza a alteração.
* CT_017: Exclusão de usuários com carrinho
    * Testar se ao tentar realizar a exclusão de um usuário com carrinho vinculado é retornada a mensagem de que o usuário possui um carrinho vinculado e status de erro.
* CT_ 018: Validação do token
    * Deve-se testar se o token de usuário é gerado corretamente para vendedores/adm e para usuário comum com suas devidas permissões.

## Testes candidatos a automação
A partir dos [fluxos prioritários](https://gitlab.com/letsquicia/compass/-/raw/main/images/Fluxos_Priorit%C3%A1rios.png), segue testes candidatos a automação: 
* CT_002: Cadastro de um novo usuário com dados corretos;
* CT_003: Cadastro de um novo usuário com dados em branco;
* CT_ 004: Combinação de campos inválidos no cadastro;
* CT_ 005: Campo administrador com opção inválida;
* CT_ 006: E-mail já vinculado a outro usuário;
* CT_009: Cadastro de novo vendedor ou cliente com e-mail Gmail ou Hotmail;
* CT_ 014: Tamanho ideal das senhas;
* CT_ 015: Senha com menos de 5 caracteres e mais de 10;
* CT_ 018: Validação do token

## Local dos testes:
Localmente no endereço: http://localhost:3000

## Recursos necessários:
* Node.js para rodar a API localmente.
* Swagger ou mapa mental da API. 	
* Postman para análise dos cenários. 
* Local para armazenamento do resultado dos testes.
* Banco de dados e infraestrutura para desenvolvimento disponibilizados.

## Critérios usados:
* Os testes devem ser realizados de acordo com a análise de requisitos e critérios estabelecidos na user story, sendo eles:
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
* Alguns dos testes serão automatizados para agilidade na execução e maior confiabilidade nos resultados.
* Além dos testes cobertos pelo Swagger, foram elaborados casos de teste para cenários alternativos.



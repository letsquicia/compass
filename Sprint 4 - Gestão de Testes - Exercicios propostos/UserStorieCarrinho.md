## US 004: [API] Carrinho


>Sendo um vendedor de uma loja com cadastro já realizado, <br>
>Gostaria de poder gerenciar os carrinhos de compra dos meus clientes no Marketplace da ServeRest, <br>
>Para adicionar, atualizar e remover produtos nos carrinhos e calcular o total da compra.

### DoR
* Banco de dados e infraestrutura para desenvolvimento disponibilizados;
* API de cadastro de usuários implementada;
* API de cadastro de produtos implementada;
* API de autenticação implementada;
* Ambiente de testes disponibilizado.

### DoD
* CRUD de carrinhos de compra implementado (CRIAR, ATUALIZAR, LISTAR E DELETAR);
* Análise de testes cobrindo a rota de carrinho;
* Matriz de rastreabilidade atualizada;
* Automação de testes baseado na análise realizada;

### Acceptance Criteria
* Usuários não autenticados não devem conseguir realizar ações na rota de carrinhos;
* Os carrinhos retornados devem ser únicos por usuário;
* Cada usuário deve ter no máximo um carrinho vinculado; 
* O carrinho deve ser vinculado ao token de login; 
* Não deve ser possível excluir carrinhos com produtos;
* Ao adicionar produtos a um carrinho, o sistema deve verificar se o produto existe e está disponível para compra;
* Deve ser possível atualizar a quantidade de produtos em um carrinho;
* Deve ser possível remover produtos de um carrinho;
* Ao adicionar, atualizar ou remover produtos em um carrinho, o sistema deve calcular e atualizar automaticamente o valor total da compra;
* Os testes executados deverão conter evidências;
* A cobertura de testes deve se basear no Swagger e ir além, cobrindo cenários alternativos.

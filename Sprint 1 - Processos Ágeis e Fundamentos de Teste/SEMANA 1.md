ㅤㅤ
 <div align="center">

# SEMANA I
</div>

# índice
- [Dia 1 - Métodos ágeis/ Git e GitLab /README](#Dia_1_-_Métodos_ágeis/_Git_e_GitLab_/README)
- [Dia 2 - Manifesto Ágil/ Scrum](#Dia_2_-_Manifesto_Ágil/_Scrum)
- [Dia 3 - Scrum/ QA dentro de um time ágil](#Dia_3_-_Scrum/_QA_dentro_de_um_time_ágil)
- [Dia 4 - Fundamentos do teste](#Dia_4_-_Fundamentos_do_teste)
- [Dia 5 - Pirâmide de testes](#Dia_5_-_Pirâmide_de_testes)
#
## ㅤㅤㅤㅤㅤDia 1 - Métodos ágeis/ Git e GitLab /README

### **Matriz de Eisenhower**
* Uma ferramenta de produtividade que ajuda na priorização de tarefas e na tomada de decisões.
* Tem como objetivo reunir todas as tarefas que se tem pra fazer e seja possível priorizar visualmente as tarefas mais importantes.
* Nem tudo que é importante é urgente e vice versa. 
* A matriz deve ser dividida conforme imagem abaixo e cada tarefa deve ser alocada na situação que se encontra.
![matriz_eisenhower](https://gitlab.com/letsquicia/compass/-/raw/main/images/matriz.JPG)

### **Kanban**
* O método Kanban é uma abordagem de gestão de projetos e fluxo de trabalho.
* Utiliza cartões visuais chamados "kanbans" para representar as tarefas.
* As tarefas são colocadas em um quadro dividido em colunas que representam as etapas do fluxo de trabalho.
* Cada coluna tem um limite de capacidade para evitar acúmulos.
* Proporciona transparência e visibilidade sobre o status das tarefas.
* Incentiva a colaboração e a responsabilidade compartilhada.
* Permite ajustes e melhorias contínuas no processo.
* Ajuda a controlar e priorizar o trabalho de forma eficiente.
* Reduz o desperdício e aumenta a produtividade.
* É orientada a utilização do site [Miro](https://miro.com/)

![Kanban](https://gitlab.com/letsquicia/compass/-/raw/main/images/kanban.JPG)

### **Git e GitLab**
* Utilizaremos durante o programa de bolsas o Gitlab, sendo assim realizei o estudo da ferramenta e deixarei aqui anotações relevantes. 
* **branches:** são cópias independentes de um repositório de código-fonte. Como se fosse a linha da vida do projeto, sendo possível criar ramificações para realização de modificações no código sem alterar a linha principal. 
* **commits:** são registros individuais de alterações feitas em um repositório, cada commit tem um identificador único "hash" que é gerado com base no conteúdo do commit e é usado para identificá-lo de forma exclusiva.
* **pull/merge request:** é uma solicitação de fusão de código em um repositório,  permitindo que um desenvolvedor proponha a incorporação de alterações de um branch específico em outro branch, geralmente mesclando as alterações em uma branch principal.
* **Issues:** recurso de gerenciamento de problemas ou tarefas incorporado ao GitLab, que permite que equipes colaborem, rastreiem e resolvam problemas em projetos de desenvolvimento de software.
    * Podem ser atribuídas a membros da equipe, permitindo que eles assumam a responsabilidade pela resolução do problema ou conclusão da tarefa. 
    * É possível adicionar marcos (milestones) ou etiquetas (labels) para categorizar e priorizar as issues. 
    * O GitLab permite que as issues sejam vinculadas a branches ou pull requests, proporcionando uma visão geral do trabalho realizado em relação a cada problema.
* **wiki:** ferramenta de colaboração e documentação que permite que as equipes criem e compartilhem informações, tutoriais, documentação e páginas de conhecimento relacionadas a um projeto ou repositório.
* **Fork:** é uma cópia independente de um repositório existente para o próprio gitlab.
* **pipeline:** O pipeline é definido por um arquivo chamado .gitlab-ci.yml e consiste em uma sequência de etapas automatizadas que são executadas em resposta a uma alteração no código do projeto. Essas etapas podem incluir a compilação do código, execução de testes, análise de qualidade, implantação em ambientes de teste ou produção, entre outros processos. Quando ocorre uma alteração no código, o GitLab CI/CD detecta automaticamente essa alteração e inicia a execução do pipeline. Cada estágio é executado em uma ordem definida, e o pipeline pode ser configurado para pausar ou interromper a execução se algum estágio falhar.
* **Jobs:** são unidades individuais de trabalho dentro de um pipeline, cada job representa uma tarefa específica a ser executada, como compilar o código, executar testes, implantar em um ambiente, etc.
* **CI/CD:** CI/CD no GitLab refere-se à integração contínua (CI) e entrega contínua (CD), práticas que automatizam e aceleram o processo de construção, teste e implantação de código. O GitLab oferece recursos integrados de CI/CD que permitem aos desenvolvedores criar pipelines automatizados para realizar essas tarefas de forma eficiente.
* **Artifacts:**  são arquivos gerados durante a execução de um job em um pipeline do GitLab CI/CD. Eles representam os resultados ou produtos da execução do job, como artefatos de compilação, relatórios de testes, documentação gerada, pacotes de distribuição, etc.

### **README**
* Uma maneira de fornecer informações claras e concisas sobre o projeto.
* É utilizada a linguagem de marcação para construção do readme. 
* Os níveis de títulos são determinados com # 
* Badges são marcadores, pode-se gerar Badges no site shields.io gratuitamente. 
* É interessante sempre colocar um arquivo de licença, após entender qual a licença ideal para o projeto. 
* Deve-se explicar de forma concisa o que é o projeto e todas as informações necessárias para total entendimento da aplicação.
* Para inclusão de imagens no readme é recomendado a utilização de outro repositório com as imagens que serão utilizadas e utiliza-se no formato !.[texto alternativo].(link) 
#
## ㅤㅤㅤㅤㅤDia 2 - Manifesto Ágil/ Scrum

### **Manifesto Ágil**
* É um documento que estabelece os valores e princípios fundamentais para o desenvolvimento de software ágil
* É baseado em 4 valores principais:
    1. Indivíduos e interações acima de processos e ferramentas: Valoriza a importância da comunicação e colaboração entre as pessoas envolvidas no projeto. 
    2. Software em funcionamento acima de documentação abrangente: Valoriza a entrega contínua de software funcional e utilizável.
    3. Colaboração com o cliente acima de negociação de contratos: Valoriza a colaboração estreita com o cliente ou usuário final do software. 
    4. Responder a mudanças acima de seguir um plano: Valoriza a capacidade de responder rapidamente a mudanças nos requisitos e no ambiente do projeto.
* O Manifesto Ágil também estabelece 12 princípios que guiam a abordagem ágil para o desenvolvimento de software.
    1.  Satisfação do cliente através da entrega contínua de software com valor agregado.
    2. Aceitar mudanças nos requisitos, mesmo em estágios avançados do desenvolvimento.
    3. Entregar software funcional com frequência, com preferência por períodos curtos.
    4. Colaboração constante entre clientes e desenvolvedores durante todo o projeto.
    5. Construir projetos ao redor de indivíduos motivados, dando a eles o ambiente e o suporte necessário.
    6. Utilizar a comunicação face a face como forma primária de comunicação.
    7. Software funcionando é a medida primária de progresso.
    8. Promover o desenvolvimento sustentável, mantendo um ritmo constante.
    9. Atenção contínua à excelência técnica e ao bom design.
    10. Simplicidade - a arte de maximizar a quantidade de trabalho não realizado.
    11. Equipes auto-organizadas são capazes de desenvolver as melhores arquiteturas, requisitos e designs.
    12. Refletir regularmente sobre o trabalho realizado, buscando melhorias contínuas.

### **Scrum**
* É um framework ágil de gerenciamento de projetos que se concentra na colaboração, transparência e entrega contínua de valor, abaixo alguns dos principais conceitos da  metodologia:
* **Equipe Scrum:** É composta por membros multidisciplinares, autogerenciáveis e colaborativos, que trabalham juntos para entregar o produto.
* **Product Owner:** É o representante dos stakeholders (interessados no projeto) e é responsável por definir e priorizar os requisitos do produto.
* **Scrum Master:** É o responsável por facilitar o uso correto do Scrum, ele garante que os princípios e práticas do Scrum sejam seguidos.
* **Backlog do Produto (Product Backlog):** É uma lista priorizada de requisitos, funcionalidades e melhorias que precisam ser implementadas no produto.
* **Product Owner:** é responsável por gerenciar o Product Backlog, garantindo que ele esteja sempre atualizado e refletindo as necessidades do cliente.
* **Sprints:** São iterações de tempo fixo, geralmente de 1 a 4 semanas, nas quais o trabalho é realizado e entregue. Cada Sprint começa com uma reunião de planejamento, onde a equipe seleciona um conjunto de itens do Product Backlog que serão entregues até o final do Sprint.
* **Sprint Backlog:** É uma lista de tarefas específicas que a equipe planeja realizar durante a Sprint.
* **Daily Scrum (Daily Stand-up):** É uma reunião diária curta (geralmente de 15 minutos) em que a equipe se reúne para sincronizar o trabalho e identificar possíveis obstáculos. Cada membro da equipe responde a três perguntas:
    * O que foi feito desde a última reunião?
    * O que será feito até a próxima reunião?
    * Quais obstáculos estão impedindo o progresso?
* **Incremento:** É o resultado tangível de um Sprint, que inclui as funcionalidades e melhorias implementadas durante o período.
* **Revisão da Sprint (Sprint Review):** É uma reunião realizada no final de cada Sprint, na qual a equipe demonstra o trabalho concluído ao Product Owner e aos stakeholders.
* **Retrospectiva da Sprint (Sprint Retrospective):** É uma reunião realizada após a Revisão da Sprint, onde a equipe reflete sobre o último Sprint, identifica o que funcionou bem e o que pode ser melhorado.
* Seus pilares consistem em Transparência, Inspeção e Adaptação. *(TIA)*
#
## ㅤㅤㅤㅤㅤDia 3 - Scrum/ QA dentro de um time ágil
### **Scrum, papéis e responsabilidades**

**PAPÉIS:**
* **Desenvolvedores:** todos que trabalham para entrega de um objetivo da sprint, devem ser autogerenciáveis, estimar os itens do backlog do produto, realizar as atividades que geram incremento no produto, gerenciar backlog da sprint e criar uma definição de “pronto” que deve ser acordada com o Product Owner. 
* **Product Owner:** recomenda-se que tenha um PO para cada backlog do produto, suas principais responsabilidades serão: 
    * Estabelecer a visão e ser responsável pelo produto
    * Garantir que o backlog seja transparente, visível e compreensível
    * Feedback na revisão da sprint
    * Planejar as releases
    * Decidir quando liberar um incremento em produção
**Scrum Master:** É o líder facilitador, ele deve ser responsável pela eficácia da aplicação do framework, ele deve auxiliar o PO e atender o dono do produto e a organização em si.

**CERIMôNIAS**
* **Planejamento da sprint:** o PO traz um product backlog e os desenvolvedores criam a sprint backlog, assim é criada uma meta que deve ser realizada durante o sprint.
    * DOR (Definition of Ready): É um conjunto de critérios que um item do Product Backlog precisa atender para ser considerado pronto para ser trabalhado pela equipe Scrum. 
    * DOE (Definition of Done): É um conjunto de critérios que um incremento de trabalho precisa atender para ser considerado concluído e pronto para ser entregue. Os critérios de done são estabelecidos em conjunto pela equipe Scrum e podem incluir testes completos, revisão de código, documentação atualizada e aprovação do Product Owner.
* Reunião diária (daily)
* **Revisão da sprint:** objetivo de saber se a meta foi atingida. 
* **Retrospectiva da Sprint:** É a hora de refletir.
    * O que foi bem?
    * O que deve ser melhorado?
    * Ações?

**ARTEFATOS**
* Product backlog: lista de todos os trabalhos que precisam ser realizados dentro de um mesmo projeto. É responsabilidade do PO.
* Sprint backlog: lista de tarefas que os desenvolvedores se comprometem a fazer em um sprint, os itens devem ser extraídos do product backlog pela equipe, baseando-se nas prioridades definidas pelo PO.
* Gráfico Burndown: é um gráfico que pode ser acompanhado diariamente para avaliar o andamento da equipe. 

### **QA dentro de um time ágil**
* No contexto do Scrum, o papel de um QA é desempenhado por um profissional responsável por implementar práticas e processos que asseguram que o produto atenda aos critérios de qualidade estabelecidos.
* O QA integra o time de desenvolvimento, sendo um profissional com maior habilidade em planejar, desenvolver e executar testes.
* É importante que o QA esteja envolvido desde as fases iniciais do projeto e auxiliando na definição de “pronto”.
* O QA é responsável por executar os testes necessários para validar a qualidade do produto. Isso pode incluir testes de unidade, testes de integração, testes de regressão e outros tipos de testes relevantes.
* O QA desempenha um papel fundamental na garantia da qualidade, mas todos os membros da equipe têm a responsabilidade de trabalhar juntos.
#
## ㅤㅤㅤㅤㅤDia 4 - Fundamentos do teste
### **Como gerar qualidade**
* Compreensão clara dos requisitos do produto.
* Comunicação aberta e contínua com os stakeholders.
* Análise rigorosa dos requisitos, considerando diferentes perspectivas.
* Planejamento adequado com metas realistas.
* Entrega contínua de incrementos funcionais.
* Feedback frequente e ajustes constantes.
* Implementação de uma estratégia de testes abrangente.
* Testes de unidade, integração e aceitação.
* Ambiente propício para geração de qualidade.
* Cultura de trabalho colaborativa e aberta.
* Compartilhamento de conhecimento.
* Capacitação da equipe para buscar excelência.
* Melhoria contínua através de retrospectivas regulares.
* Identificação de oportunidades de aprimoramento.
* Implementação de ações corretivas.
* Aprendizagem e evolução contínuas.

### **Teste Dinâmico x Teste Estático**
* O teste dinâmico envolve a execução real do software para validar seu comportamento em tempo de execução. Consiste na criação e execução de casos de teste, fornecendo entradas ao software e verificando se os resultados obtidos estão de acordo com o esperado.
* O teste estático não necessita da  execução real do código. Envolve revisão manual ou automática de documentos, código-fonte, diagramas, especificações e outros artefatos para identificar erros, inconsistências, problemas de design, violações de padrões e outros problemas potenciais. 

### **Teste e Depuração**
* O QA é responsável pela realização dos testes que podem mostrar falhas causadas por defeitos no software, então a equipe de desenvolvimento deve realizar a localização, análise e correção desse defeito e encaminhar novamente para um novo teste. 
* O teste que encontra defeitos, cria a oportunidades de melhorar a qualidade do produto.
* O teste só aumenta a qualidade do software quando é capaz de encontrar e corrigir defeitos e verificar a conformidade dos requisitos funcionais e não funcionais.
![teste_depuracao](https://gitlab.com/letsquicia/compass/-/raw/main/images/testedepuracao.JPG)

### **Erro, defeito e falha**
* **Erro:** Refere-se a uma ação humana incorreta ou uma interpretação equivocada das especificações, que leva à criação de um defeito no software, pode ocorrer em qualquer fase do desenvolvimento.
* **Defeito:** É um estado do software, resultante de um erro no seu desenvolvimento ou implementação. Um defeito pode causar o mau funcionamento ou comportamento indesejado do software.
* **Falha:** É um evento que ocorre quando um defeito se manifesta durante a execução do software, resultando em um comportamento incorreto, falha no cumprimento de uma funcionalidade ou no atendimento às expectativas do usuário.
* Um software pode conter defeitos e nunca falhar.

### **Os sete princípios de testes**
1. O teste mostra a presença de *defeitos*.
2. Testes exaustivos são impossíveis. 
3. O teste inicial economiza tempo e dinheiro.
4. Defeitos se agrupam. (princípio de pareto, que afirma que aproximadamente 80% dos efeitos são causados por 20% das causas.)
5. Cuidado com o paradoxo do pesticida. (os testes devem ser regularmente atualizados, o paradoxo mostra a ineficácia de um mesmo pesticida aplicado diversas vezes na mesma praga que já evoluiu.)
6. O teste depende do contexto.
7. A ausência de erros é uma ilusão.

### **Fatores Contextuais** 
* **Complexidade do sistema:** A complexidade do sistema sendo testado pode afetar a abordagem e a intensidade dos testes necessários. Sistemas complexos exigem uma estratégia de teste mais abrangente e detalhada.
* **Cronograma e prazos:** Restrições de tempo podem afetar o planejamento e a execução dos testes. Prazos apertados podem exigir uma estratégia de teste mais focada e priorização eficiente das atividades de teste.
* **Recursos disponíveis:** A disponibilidade de recursos, como equipe de testes, ferramentas de teste e ambiente de teste, pode influenciar a capacidade de executar testes abrangentes e eficazes.
* **Ambiente de desenvolvimento:** O ambiente de desenvolvimento, incluindo o processo de desenvolvimento, as metodologias utilizadas e a colaboração com outras equipes, pode afetar a integração dos testes no fluxo de trabalho geral.
* **Requisitos e expectativas dos stakeholders:** É importante entender as necessidades e prioridades dos stakeholders para planejar e executar os testes de acordo.
* **Risco do projeto:** A avaliação do risco do projeto pode influenciar a ênfase nos testes de determinadas áreas críticas ou funcionalidades do sistema. 
* **Documentação:** A disponibilidade e a qualidade da documentação do sistema, incluindo requisitos, casos de teste e resultados de testes anteriores, podem afetar a eficiência e a eficácia do processo de teste.

### **Atividades de teste**
* **planejamento do teste:** etapa que define os propósitos e a abordagem do teste, define o escopo do teste e seleciona métricas.
* **Análise do teste:** determina o que testar.
* **Modelagem do teste:** elabora os casos de teste, massa de dados e projeta o ambiente de teste. 
* **Implementação do teste:** deve responder a pergunta “agora temos tudo para executar os testes?”, scripts de teste automatizados, suíte de testes. 
* **Execução do teste:** execução dos testes de acordo com o cronograma, execução manual dos testes, coleta de evidências, análise de anomalias, comunicação e registro dos resultados.
    * Teste de confirmação
    * Teste de regressão.
* **Conclusão do teste:** métricas consolidadas, lançamento do software, análise e verificação, melhora do processo.
#
## ㅤㅤㅤㅤㅤDia 5 - Pirâmide de testes
### **A pirâmide de testes**
* A pirâmide é composta pela base sendo de testes unitários, o meio de teste de integração e a ponta teste end-to-end.
* **Teste Unitário:** é o teste mais básico realizado em um software. Ele se concentra na verificação do comportamento de uma unidade isolada de código, como uma função, um método ou uma classe.
* **Teste de Integração:** verifica a interação entre diferentes módulos, componentes ou serviços de um sistema. 
* **Teste E2E (End-to-End):** é realizado para verificar o comportamento do sistema como um todo, simulando as interações dos usuários finais com o sistema. Ele é projetado para garantir que todas as partes do sistema, incluindo a interface do usuário, os componentes intermediários e os bancos de dados, funcionem corretamente em conjunto. 
* Normalmente a quantidade de testes de unidade são maiores que a quantidade de testes de integração que são maiores que a quantidade de testes e2e, porém o tempo para rodar é maior nos testes e2e do que nos de integração e unidade.
![piramide](https://gitlab.com/letsquicia/compass/-/raw/main/images/piramide.JPG)





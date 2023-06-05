## Índice
- [Dia 6 - Myers e o Princípio de Pareto/ Apostila Teste de Software](#dia-6---myers-e-o-princípio-de-pareto-apostila-teste-de-software)
- [Dia 7 e 8 - Java](#dia-7-e-8---java)
- [Dia 9 - CiberSecurity](#dia-9---cibersecurity)
- [Dia 10 - Apresentação do challenge, exercícios e versionamento](#dia-10---apresentação-do-challenge-exercícios-e-versionamento)


## Dia 6 - Myers e o prícipio de pareto/ Apostila Teste de Software

### **Myers e o Princípio de Pareto**
> "Testar é analisar um programa com a intenção de descobrir erros e defeitos."
> -Myers

* Antecipar testes traz benefícios.
* 80% dos problemas estão relacionados a 20% das causas.
* Quando se foca em 20% das causas, 80% dos problemas podem ser solucionados.

### [**Apostila Teste de Software**](https://www.pjf.mg.gov.br/secretarias/sarh/edital/interno/selecao2015/arquivos/apostilas/modulo4_p.pdf)
* Objetivos do teste:
    * Reduzir a probabilidade de incidência de erro no cliente. 
    * Minimizar riscos ao negócio do cliente.
    * Atender as necessidades do cliente (negócio, contratual, legal, etc.).
    * Resultando na maior satisfação do cliente.
* Falha é um evento.
* Defeito é um estado do software, causado por um erro.
* Benefícios trazidos pela realização correta de testes
    * Motivação por maior segurança aos clientes.
    * Oferecer maior continuidade do serviço ao negócio do cliente.
    * Melhoria da qualidade dos softwares.
    * Busca pela confiabilidade do software junto aos clientes.
    * Visando redução de gastos em correção de bugs.
* A regra 10 de Myers apresenta que o custo da correção de um defeito tende a aumentar quanto mais tarde ele for encontrado.
* Teste independente pode ser considerado em qualquer nível de teste.
* Um processo de teste básico deve contemplar: 
    * Planejamento e controle.
    * Análise e modelagem.
    * Implementação e execução.
    * Avaliação de critérios de saída e relatórios.
    * Atividade de encerramento dos testes.
    * Melhoria/Corretiva/Preventiva.
* A Validação e Verificação asseguram que o software cumpra com suas especificações e atenda às necessidades dos usuários.
* **Verificação:** Essa atividade está focada em examinar o sistema de software para garantir que ele esteja sendo construído corretamente. A verificação envolve a revisão e avaliação de documentos, modelos, códigos-fonte e outros artefatos relacionados ao sistema. O objetivo é identificar erros, inconsistências ou violações de padrões e especificações.
* **Validação:** Essa atividade concentra-se em determinar se o sistema está atendendo às necessidades e expectativas dos usuários e das partes interessadas. A validação envolve a realização de testes dinâmicos para garantir que o software esteja funcionando corretamente em um ambiente real. Os testes de validação são geralmente mais abrangentes e abordam as funcionalidades do sistema como um todo.
* O método V&V visa assegurar que tanto a construção correta do software (verificação) quanto a construção do software correto (validação) sejam realizadas. 
![processoV](https://gitlab.com/letsquicia/compass/-/raw/main/images/processoV.JPG)
* **Testes unitários:** tem por objetivo testar a menor parte testável do sistema (unidade), que pode ser um módulo, objeto ou classe, ele é independente de outros testes, caracterizado pelo uso de controladores (drivers) e simuladores (stubs). Não há registro de defeitos identificados, pois são corrigidos imediatamente. 
* **TDD (Test Driven Development):** técnica de desenvolvimento de software em que primeiro são descritos os testes e só depois é produzido um código que possa validá-lo.
* A base para o TDD é um ciclo curto de desenvolvimento. 
* **Teste de integração:** Testa a integração entre os diversos componentes de software criados.
* **Teste de sistema:** Valida o comportamento do sistema.
* **Teste de aceite:** Validação realizada pelos stakeholders. 
* **Testes Funcionais:** testes que avaliam o funcionamento da aplicação considerando o comportamento externo do software, é aplicável a todas as fases do teste.
    * Está construindo o produto certo?
* **Testes não-funcionais:** Busca a validação de aspectos não funcionais do software como desempenho, carga, estresse, usabilidade etc.
    * Como está funcionando?
* **Teste estrutural:** Busca a validação de aspectos estruturais como cobertura de código, sentença, decisão etc.
* **Teste de confirmação:** Valida a remoção de defeitos. 
* **Teste de regressão:** Deve ser utilizado quando ocorre alteração de software ou ambiente e valida se não foram gerados novos defeitos.
* **Teste da caixa-preta:** Testa com entradas e saídas, sem considerar aspectos internos (código). Utiliza-se do diagrama de transição de estados, que serão identificáveis e finitos.
* **Teste da caixa-branca:** Considera aspectos internos do software (código). Teste e cobertura de sentença, teste e cobertura de decisão. 100% de cobertura de decisão, garante 100% de cobertura de sentença, mas NÃO vice-versa


## Dia 7 e 8 - Java 
O sétimo e oitavo dia do projeto foram separados para realização de projetos praticos em Java, é possível visualiza-los na pasta ["Exercícios Java"](https://gitlab.com/letsquicia/compass/-/tree/main/Sprint%201%20-%20Processos%20%C3%81geis%20e%20Fundamentos%20de%20Teste/Exerc%C3%ADcios%20Java) desse repositório. 

## Dia 9 - CiberSecurity 
* phishing tem crescido 99,23% ao ano no Brasil, não clicar em links desconhecidos.
* Ameaças de wifi doméstico:
    * Sequestro de DNS
    * Botnets e Proxy
    * Monitoramento de tráfego
    * Vazamento de dados pessoais e senhas
* **OWASP (Open Web Application Security Project)** é uma organização sem fins lucrativos.
* Seu objetivo é melhorar a segurança de software e aplicativos da web.
* A OWASP é conhecida pela lista OWASP Top 10, que destaca os principais riscos de segurança em aplicativos da web.
* A organização fornece recursos, ferramentas e diretrizes de segurança gratuitamente.
* Eles promovem a conscientização e o desenvolvimento de software seguro.
* A colaboração é fundamental, com uma comunidade global de especialistas contribuindo.
* A OWASP busca mitigar riscos e proteger aplicativos contra ameaças e ataques.
* OWASP API Security é um projeto da OWASP que se concentra na segurança de interfaces de programação de aplicativos (APIs).
* O projeto fornece orientações e recursos para garantir a segurança das APIs.
* Aborda tópicos como autenticação, autorização, proteção contra ataques de injeção, gerenciamento de tokens de acesso e validação de entradas.
* Identifica e destaca as principais vulnerabilidades comuns em APIs.
* É desenvolvido pela comunidade e permite a colaboração de especialistas em segurança de API.
* Dicas de segurança digital para o dia a dia:
    * Boas senhas.
    * Uso de gerenciador de senhas.
    * Múltiplos fatores de autenticação. 
    * Cuidados com phishing.
    * Bom antivirus. 
    * Manter softwares atualizados.
    * Realização de backups.
    * Segurança nos navegadores usados.
    * Cuidar transações bancárias. 


## Dia 10 - Apresentação do challenge, exercícios e versionamento
* **O que funcionou?** <br>
Durante essa sprint, tudo o que me propus a fazer funcionou de acordo com as minhas expectativas. Embora algumas tarefas tenham demandado mais tempo do que outras, estou satisfeita com os resultados alcançados. Em particular, estou contente com a criação do repositório, que foi concluída com sucesso.


* **O que precisa mudar?** <br>
Identifiquei a necessidade de melhorar a administração do tempo durante a sprint. É importante que eu tenha uma maior organização e cautela para equilibrar todas as tarefas de forma mais eficiente, evitando assim o estresse desnecessário.


* **Quais conteúdos tiveram mais dificuldade?** <br>
Durante a sprint, encontrei mais dificuldades na resolução de problemas relacionados à compilação dos códigos do que no entendimento dos conteúdos abordados em si. Como já possuía uma base sólida nos assuntos tratados, enfrentei desafios principalmente no processo prático de compilação e integração do VS Code com o GitLab, pois já possuia a conexão com o GitHub e precisei reconfigura-las.



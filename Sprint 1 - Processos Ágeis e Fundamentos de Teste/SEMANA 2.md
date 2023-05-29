ㅤㅤ
 <div align="center">

# SEMANA II
</div>

## ㅤㅤㅤㅤㅤDia 6 - Myers e o prícipio de pareto/ Apostila Teste de Software

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



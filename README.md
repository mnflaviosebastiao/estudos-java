# Estudos de Java

Repositório onde registro meu aprendizado de Java e programação orientada a objetos, do zero. Todo o código aqui foi **escrito por mim**, à mão, com mentoria — não é código gerado nem copiado de tutorial. Os erros que cometi e as correções fazem parte do histórico.

**Autor:** Flávio Sebastião ([@mnflaviosebastiao](https://github.com/mnflaviosebastiao))
**Período:** abril/2026 — em andamento
**Contexto:** desenvolvedor PHP/Laravel estudando Java e engenharia de software.

---

## Por que este repositório existe

Meu critério de aprendizado é **autonomia**, não reconhecimento: só considero um conceito aprendido quando consigo escrevê-lo sozinho, sem consultar. Cada projeto aqui é um teste desse critério — e o commit fica mesmo quando o código ficou melhor depois.

Em junho de 2026 fiquei 77 dias sem programar em Java. Ao voltar, refiz os fundamentos do zero em vez de seguir de onde parei. Os projetos `delivery` e `oficina` são dessa retomada.

---

## Projetos

Do mais recente ao mais antigo. Cada um exercita conceitos específicos e roda sozinho no terminal.

### `oficina` — ordens de serviço de uma oficina mecânica
Classe **abstrata** (`Servico`) com quatro especializações, cada uma com sua regra de cobrança: troca de óleo soma a peça, revisão cobra por item, pintura cobra por m² com acréscimo de 60% se personalizada, lavagem tem valor próprio.

O ponto central é o **polimorfismo**: as ordens ficam num `HashMap<String, Servico>` e os métodos do app (listar, faturar, contar em aberto, buscar) trabalham só com o tipo base. Adicionar um quinto tipo de serviço não exige alterar nenhum deles — *Open/Closed Principle* na prática.

`Servico` · `TrocaDeOleo` · `Revisao` · `Pintura` · `Lavagem` · `AppOficina`

### `delivery` — pedidos com cálculo de faturamento
Encapsulamento, `ArrayList` de objetos e os três padrões de laço: acumulador com filtro (faturamento dos entregues), contador com negação (pedidos pendentes) e busca do máximo (maior pedido). `toString()` sobrescrito como única fonte de formatação.

`Pedido` · `AppPedidos`

### `estoque` — controle de produtos por código
`HashMap` indexado por código de produto, entrada e saída com validação de quantidade, setter que rejeita valor negativo.

`Produto` · `AppEstoque`

### `agenda` — contatos por nome
Busca por chave, verificação de existência, atualização e remoção em `HashMap`.

`Contato` · `AppAgenda`

### `empresa` — folha de pagamento com herança
Hierarquia `Funcionario` → `Gerente`, `Vendedor`, `Desenvolvedor`, cada um com sua regra de salário. Três apps: cálculo de folha, versão com polimorfismo em `ArrayList` e busca por matrícula em `HashMap`.

`Funcionario` · `Gerente` · `Vendedor` · `Desenvolvedor` · `AppEmpresa` · `AppEmpresaV2` · `AppBuscaFuncionario`

### `catalogo` — filmes com filtro por ano
`ArrayList` de objetos, filtro e busca linear por título.

`Filme` · `AppCatalogo`

### `listatarefas` — tarefas com mudança de estado
Comando que altera estado do objeto e consulta que o reporta.

`Tarefa` · `AppListaTarefa`

### `banco` — conta com saque e depósito
Validação antes de operar: saque que rejeita valor acima do saldo.

`Conta` · `AppBanco`

---

## Aulas e exercícios

`src/` na raiz — fundamentos na ordem em que estudei: métodos (`Aula05`), `Scanner` (`Aula06`), arrays (`Aula07`), classes e encapsulamento (`Aula08`), herança (`Aula09`), `ArrayList` (`Aula10`), `HashMap` (`Aula11`).

`src/exercicios/` — exercícios de modelagem de classes: produto, filme, conta bancária, aluno, música.

---

## Como rodar

Cada projeto é independente. A partir da raiz do repositório:

```bash
# oficina
javac -d bin src/projetos/oficina/*.java && java -cp bin AppOficina

# delivery
javac -d bin src/projetos/delivery/*.java && java -cp bin AppPedidos

# qualquer outro projeto
javac -d bin src/projetos/<projeto>/*.java && java -cp bin App<Nome>
```

**Nota:** os projetos ainda não declaram `package`, então compilam um de cada vez, não todos juntos — há classes de mesmo nome em pastas diferentes (`Produto` aparece em `exercicios` e em `projetos/estoque`). Organizar em pacotes e migrar para Maven está no meu plano de estudos.

Requer JDK 17 ou superior (desenvolvido com Temurin 25).

---

## O que vem a seguir

Interfaces e enums · exceções e `BigDecimal` para valores monetários · Streams e lambdas · pacotes, Maven e JUnit · JDBC e JPA · Spring Boot e APIs REST.

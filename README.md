
Desafio 4: Tratamento de Exceções em Java
Este projeto demonstra a aplicação do conceito de exceções em um programa simples de operações bancárias. O objetivo é ler os dados de uma conta e realizar um saque, validando as regras de negócio para evitar erros.

🚀 Tecnologias
Java: Linguagem de programação utilizada.

IntelliJ IDEA: Ambiente de Desenvolvimento Integrado (IDE) utilizado no projeto.

💻 Conceitos Aplicados
1. Programação Orientada a Objetos (POO)
O projeto é estruturado em classes para representar entidades do mundo real:

Account: Classe que modela uma conta bancária com atributos como número, titular, saldo e limite de saque. Possui métodos para deposit e withdraw.

Main: Classe principal (ponto de entrada) que interage com o usuário, coletando os dados da conta e solicitando o valor do saque.

2. Tratamento de Exceções Personalizadas
Para garantir a robustez da aplicação, foram implementadas exceções personalizadas:

BusinessException: Uma exceção criada para lidar com erros específicos das regras de negócio, como tentativas de saque inválidas.

A classe Account possui um método privado validateWithdraw que verifica se o saque é possível, lançando uma BusinessException caso o saldo seja zero ou o valor do saque exceda o limite.

O método main utiliza um bloco try-catch para chamar o método withdraw e capturar a exceção, exibindo uma mensagem de erro amigável ao usuário, em vez de interromper o programa.

⚙️ Como Executar
Clone o repositório.

Abra o projeto na sua IDE Java favorita.

Execute a classe Main.java.

🖥️ Exemplos de Execução
Exemplo 1: Saque Válido
Neste cenário, o valor do saque é menor que o limite e o saldo é suficiente.

Exemplo 2: Saque Inválido
Neste cenário, o valor do saque excede o limite de saque. O programa captura a exceção e exibe uma mensagem de erro.

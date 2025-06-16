# 🏦 Sistema Bancário em Java 💻

Este repositório contém um conjunto de classes Java que implementam funcionalidades básicas relacionadas a sistemas bancários e cálculos financeiros. O objetivo principal é demonstrar conceitos fundamentais de programação orientada a objetos, encapsulamento, além da aplicação de testes unitários para validação das operações. 

---

## 📋 Descrição do Projeto

O projeto é composto por três módulos principais:

1. 💸 **Calculadora de Comissão**  
   Implementa o cálculo do valor da comissão de um vendedor a partir do valor total vendido e do percentual de comissão, utilizando a fórmula matemática adequada.

2. 👤 **Modelo de Pessoa**  
   Classe que representa um modelo simplificado de pessoa, contendo atributos básicos e um método para apresentação pessoal.

3. 🏦 **Classe Conta Bancária e Testes Unitários**  
   Classe que simula operações bancárias elementares, como depósito, saque e transferência entre contas.  
   Os testes unitários, desenvolvidos com JUnit, asseguram a correção das operações implementadas.

---

## 📂 Estrutura do Código

| Arquivo               | Descrição                                               |
|-----------------------|---------------------------------------------------------|
| `CalculadorComissao.java` | Classe responsável pelo cálculo da comissão sobre vendas |
| `Pessoa.java`             | Classe modelo para representação básica de dados pessoais |
| `Conta.java`              | Classe que implementa a lógica das operações financeiras (não fornecida, mas testada) |
| `ContaTest.java`          | Testes unitários para validar os métodos da classe `Conta` |

---

## 🛠 Tecnologias Utilizadas

- ☕ Java 
- ✅ JUnit 4 para testes unitários

---

## 💡 Exemplo de uso da Calculadora de Comissão

```java
CalculadorComissao calculadora = new CalculadorComissao();
calculadora.valorVendido = 1500.00;
calculadora.percentualComissao = 7.5;
double comissao = calculadora.calcularValorComissao();
System.out.println("Valor da comissão: " + comissao);

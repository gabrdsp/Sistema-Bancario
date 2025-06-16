public class CalculadorComissao {
    // Qual o problema ? Criar um sistema que calcule o valor de comissão de um vendedor a partir do valor vendido
    // Quais são os dados necessários ? Valor vendido e o percentual de comissão
    // Quais as operações necessárias ? Calcular o valor da comissão com a fórmula = (valorVendido * percentualComissão) / 100

    double valorVendido;
    double percentualComissao;

    public double calcularValorComissao() {
        return (valorVendido * percentualComissao / 100);

    }


}

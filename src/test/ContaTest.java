import org.junit.Assert;
import org.junit.Test;

public class ContaTest {

    @Test
    public void deveAtualizarOSaldoQuandoOccorrerUmSaque() {
        // Arrange
        Conta contaGabriel = new Conta(111, 1000);
        double saldoEsperado = 700;

        //Act
        contaGabriel.sacar(300);

        //Assert
        Assert.assertEquals(saldoEsperado, contaGabriel.getSaldo(), 0.01);
    }

    @Test
    public void deveSacarComSucessoQuandoOccorrerUmSaqueComSaldoSuficiente() {
        // Arrange
        Conta contaGabriel = new Conta(111);
        contaGabriel.depositar(1000);

        //Act
        boolean foiPossivelSacar = contaGabriel.sacar(300);

        //Assert
        Assert.assertTrue(foiPossivelSacar);
    }

    @Test
    public void deveImpedirOSaqueQuandoOcorrerUmaTentativaDeSaqueSemSaldoSuficiente() {
        // Arrange
        Conta contaGabriel = new Conta(111);
        contaGabriel.depositar(1000);

        //Act
        boolean foiPossivelSacar = contaGabriel.sacar(1300);

        //Assert
        Assert.assertFalse(foiPossivelSacar);
    }

    @Test
    public void deveManterOSaldoQuandoOcorrerUmaTentativaDeSaqueSemSaldoSuficiente() {
        // Arrange
        Conta contaGabriel = new Conta(111);
        contaGabriel.depositar(1000);
        double saldoEsperado = 1000;

        // Act
        contaGabriel.sacar(1200);

        // Assert
        Assert.assertEquals(saldoEsperado, contaGabriel.getSaldo(), 0.01);
    }

    @Test
    public void deveAtualizarSaldoDaContaOrigemQuandoOcorrerUmaTransferencia(){
        // Arrange
        Conta contaGabriel = new Conta(111);
        contaGabriel.depositar(1000);

        Conta contaAna = new Conta(111);
        contaAna.depositar(2500);
        double saldoEsperadoContaOrigem = 400;

        // Act
        contaGabriel.transferir(contaAna, 600);

        // Assert
        Assert.assertEquals(saldoEsperadoContaOrigem,contaGabriel.getSaldo(), 0.01);
    }

    @Test
    public void exemploEncapsulamento(){
        Conta contaGabriel = new Conta(777);
        contaGabriel.depositar(1000);

    }

}

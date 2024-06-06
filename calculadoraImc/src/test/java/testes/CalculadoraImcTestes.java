package testes;

import control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraImcTestes {

    @Test
    public void testeAdultoBaixoPesoMuitoGrave(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso muito grave", calcImc.calcularImc(48.0, 1.74,20,"masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(49.0, 1.75,65,"feminino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(52.0, 1.75,65,"feminino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(50.0, 1.71,60,"masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(54.0, 1.71,40,"masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(55.0, 1.72,40,"masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(78.0, 1.77,40,"masculino"));
    }

    @Test
    public void testeAdultoSobrePesoLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(81.0, 1.80,40,"masculino"));
    }

    @Test
    public void testeAdultoSobrePesoLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(97.0, 1.80,40,"masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrau1LimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 1", calcImc.calcularImc(103.0, 1.85,40,"masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrau1LimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 1", calcImc.calcularImc(121.0, 1.86,40,"masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrau2LimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 2", calcImc.calcularImc(124.0, 1.88,40,"masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrau2LimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 2", calcImc.calcularImc(152.0, 1.95,40,"masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrau3(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 3", calcImc.calcularImc(119.0, 1.70,40,"feminino"));
    }

    @Test
    public void testeIdosoBaixoPeso(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(57.0, 1.70,66,"masculino"));
    }

    @Test
    public void testeIdosoPesoNormalLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(66.0, 1.73,70,"masculino"));
    }

    @Test
    public void testeIdosoPesoNormalLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(81.0, 1.73,70,"masculino"));
    }

    @Test
    public void testeIdosoSobrePesolLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(74.0, 1.65,70,"masculino"));
    }

    @Test
    public void testeIdosoSobrePesolLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(88.0, 1.71,70,"masculino"));
    }

    @Test
    public void testeIdosoObesidadeGrau1lLimiteinferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 1", calcImc.calcularImc(88.0, 1.71,70,"masculino"));
    }


    @Test
    public void testeIdosoObesidadeGrau1lLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 1", calcImc.calcularImc(88.0, 1.71,70,"masculino"));
    }

    @Test
    public void testeIdosoObesidadeGrau2lLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 2", calcImc.calcularImc(90.0, 1.60,70,"masculino"));
    }

    @Test
    public void testeIdosoObesidadeGrau2lLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 2", calcImc.calcularImc(106.0, 1.63,70,"masculino"));
    }

    @Test
    public void testeIdosoObesidadeGrau3(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 3", calcImc.calcularImc(107.0, 1.63,70,"masculino"));
    }

    @Test
    public void testeIdosaBaixoPeso(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(68.0, 1.77,66,"feminino"));
    }

    @Test
    public void testeIdosaPesoNormalLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(60.0, 1.65,70,"feminino"));
    }

    @Test
    public void testeIdosaPesoNormalLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calcImc.calcularImc(79.0, 1.71,70,"feminino"));
    }

    @Test
    public void testeIdosaSobrePesolLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(83.0, 1.75,70,"feminino"));
    }

    @Test
    public void testeIdosaSobrePesolLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(98.0, 1.75,70,"feminino"));
    }

    @Test
    public void testeIdosaObesidadeGrau1lLimiteinferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 1", calcImc.calcularImc(102.0, 1.78,70,"feminino"));
    }


    @Test
    public void testeIdosaObesidadeGrau1lLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 1", calcImc.calcularImc(96.0, 1.61,70,"feminino"));
    }

    @Test
    public void testeIdosaObesidadeGrau2lLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 2", calcImc.calcularImc(100.0, 1.64,70,"feminino"));
    }

    @Test
    public void testeIdosaObesidadeGrau2lLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 2", calcImc.calcularImc(117.0, 1.67,70,"feminino"));
    }

    @Test
    public void testeIdosaObesidadeGrau3(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade Grau 3", calcImc.calcularImc(118.0, 1.67,70,"feminino"));
    }

    @Test
    public void testeCriança2BaixoPeso(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(23.0, 1.26,2,"masculino"));
    }

    @Test
    public void testeCriança2PesoNormalLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(24.0, 1.26,2,"masculino"));
    }

    @Test
    public void testeCriança2PesoNormalLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(30.0, 1.29,2,"masculino"));
    }

    @Test
    public void testeCriança2SobrePesoLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(33.0, 1.35,2,"masculino"));
    }

    @Test
    public void testeCriança2SobrePesoLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(36.0, 1.37,2,"masculino"));
    }

    @Test
    public void testeCriança2Obesidade(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(36.0, 1.37,2,"masculino"));
    }

    @Test
    public void testeCriança4BaixoPeso(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(25.0, 1.27,4,"masculino"));
    }

    @Test
    public void testeCriança4PesoNormalLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(26.0, 1.29,4,"masculino"));
    }

    @Test
    public void testeCriança4PesoNormalLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(31.0, 1.35,4,"masculino"));
    }

    @Test
    public void testeCriança4SobrePesoLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(34.0, 1.41,4,"masculino"));
    }

    @Test
    public void testeCriança4SobrePesoLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(37.0, 1.43,4,"masculino"));
    }

    @Test
    public void testeCriança4Obesidade(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(36.0, 1.41,4,"masculino"));
    }

    @Test
    public void testeCriança6BaixoPeso(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(27.0, 1.32,6,"masculino"));
    }

    @Test
    public void testeCriança6PesoNormalLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(29.0, 1.36,6,"masculino"));
    }

    @Test
    public void testeCriança6PesoNormalLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(32.0, 1.37,6,"masculino"));
    }

    @Test
    public void testeCriança6SobrePesoLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(34.0, 1.41,6,"masculino"));
    }

    @Test
    public void testeCriança6SobrePesoLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(37.0, 1.43,6,"masculino"));
    }

    @Test
    public void testeCriança6Obesidade(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(38.0, 1.44,6,"masculino"));
    }

    @Test
    public void testeCriança8BaixoPeso(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(31.0, 1.41,8,"masculino"));
    }

    @Test
    public void testeCriança8PesoNormalLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(32.0, 1.43,8,"masculino"));
    }

    @Test
    public void testeCriança8PesoNormalLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(40.0, 1.53,8,"masculino"));
    }

    @Test
    public void testeCriança8SobrePesoLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(44.0, 1.66,8,"masculino"));
    }

    @Test
    public void testeCriança8SobrePesoLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(48.0, 1.63,8,"masculino"));
    }

    @Test
    public void testeCriança8Obesidade(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(50.0, 1.65,8,"masculino"));
    }

    @Test
    public void testeCriança10BaixoPeso(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(29.0, 1.39,10,"masculino"));
    }

    @Test
    public void testeCriança10PesoNormalLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(31.0, 1.43,10,"masculino"));
    }

    @Test
    public void testeCriança10PesoNormalLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(37.0, 1.43,10,"masculino"));
    }

    @Test
    public void testeCriança10SobrePesoLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(42.0, 1.52,10,"masculino"));
    }

    @Test
    public void testeCriança10SobrePesoLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(51.0, 1.52,10,"masculino"));
    }

    @Test
    public void testeCriança10Obesidade(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(52.0, 1.52,10,"masculino"));
    }

    @Test
    public void testeCriança12BaixoPeso(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(27.0, 1.34,12,"masculino"));
    }

    @Test
    public void testeCriança12PesoNormalLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(28.0, 1.36,12,"masculino"));
    }

    @Test
    public void testeCriança12PesoNormalLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(37.0, 1.36,12,"masculino"));
    }

    @Test
    public void testeCriança12SobrePesoLimiteInferior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(39.0, 1.39,12,"masculino"));
    }

    @Test
    public void testeCriança12SobrePesoLimiteSuperior(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Sobre peso", calcImc.calcularImc(52.0, 1.47,12,"masculino"));
    }

    @Test
    public void testeCriança12Obesidade(){
        CalculadoraImc calcImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade", calcImc.calcularImc(59.0, 1.47,12,"masculino"));
    }




}

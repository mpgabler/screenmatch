package Exercicios;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorEmReal;

    @Override
    public void converterDolarParaReal(double valorEmDolar) {
        this.valorEmReal = valorEmDolar * 5.69;
    }
}

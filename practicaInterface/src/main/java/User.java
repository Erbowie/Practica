public class User {
    private Calculo calculo;

    public User(Calculo calculo) {
        this.calculo = calculo;
    }
    public Calculo getCalculo() {
        return calculo;
    }
    public void setCalculo(Calculo calculo) {
        this.calculo = calculo;
    }
    public int executeCalculo(int a, int b) {
        return calculo.calcular(a,b);
    }
}

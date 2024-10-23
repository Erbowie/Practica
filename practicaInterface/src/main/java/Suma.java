import java.io.Serializable;

public class Suma implements Calculo {
    @Override
    public int calcular(int a, int b) {
        return a+b;
    }
}

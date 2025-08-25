public class TrianguloEquilatero extends PoligonoRegular {
    private static final int LADOS = 3;
    private static final String TIPOFIGURA = "Triángulo equilátero";

    public TrianguloEquilatero (double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    @Override
    public double calcularArea() {
        return (longitudLado * longitudLado * Math.sqrt(3)) / 4;
    }
}
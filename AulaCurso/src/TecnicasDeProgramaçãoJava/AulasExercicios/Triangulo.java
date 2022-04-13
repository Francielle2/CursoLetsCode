package TecnicasDeProgramacaoJava;

public class Triangulo implements IFormaGeometrica {
    private long base;
    private long altura;

    public Triangulo(long base, long altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public long calculaArea() {
        return (base * altura) / 2;
    }
}
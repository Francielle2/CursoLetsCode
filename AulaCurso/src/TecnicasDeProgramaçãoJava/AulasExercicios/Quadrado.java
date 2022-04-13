package TecnicasDeProgramacaoJava;

public class Quadrado implements IFormaGeometrica {
    private long lado;

    public Quadrado(long lado) {
        this.lado = lado;
    }

    @Override
    public long calculaArea(){
        return lado * lado;
    }
}
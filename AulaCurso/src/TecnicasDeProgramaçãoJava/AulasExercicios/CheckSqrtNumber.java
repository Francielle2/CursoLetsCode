package TecnicasDeProgramacaoJava;

public class CheckSqrtNumber implements ICheckNumber {
    @Override
    public boolean check(Integer number) {return (Math.sqrt(number) - Math.ceil(Math.sqrt(number))) == 0;}
}
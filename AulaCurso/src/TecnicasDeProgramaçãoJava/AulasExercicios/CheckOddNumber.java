package TecnicasDeProgramacaoJava;

public class CheckOddNumber implements ICheckNumber {
    @Override
    public boolean check(Integer number) {return number %2 != 0;}
}
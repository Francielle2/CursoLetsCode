package TecnicasDeProgramacaoJava;

public class CheckEvenNumber implements ICheckNumber {
    @Override
    public boolean check(Integer number) {return number %2 == 0;}
}
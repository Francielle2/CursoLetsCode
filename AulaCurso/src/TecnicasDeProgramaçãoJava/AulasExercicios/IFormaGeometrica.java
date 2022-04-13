package TecnicasDeProgramacaoJava;

//Interface Funcional - s� define 1 m�todo abstrato
@FunctionalInterface
public interface IFormaGeometrica {
 // m�todo abstrato -
 long calculaArea();

 // m�todo default
 default void print() {
     System.out.println("Calculo da Area: " + calculaArea());
 }
}
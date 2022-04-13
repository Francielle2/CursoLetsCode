package TecnicasDeProgramacaoJava;

//Interface Funcional - só define 1 método abstrato
@FunctionalInterface
public interface IFormaGeometrica {
 // método abstrato -
 long calculaArea();

 // método default
 default void print() {
     System.out.println("Calculo da Area: " + calculaArea());
 }
}
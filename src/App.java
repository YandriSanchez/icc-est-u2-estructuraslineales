import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import controller.Cola;
import controller.ColaG;
import controller.StackGeneric;
import controller.Stacks;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Stacks stack = new Stacks();

        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("tam = " + stack.size());
        stack.printStack();
        stack.pop();

        System.out.println("tam = " + stack.size());
        stack.printStack();

        StackGeneric<String> stackGS = new StackGeneric<String>();
        stackGS.push("uno");
        stackGS.push("cuatro");
        System.out.println("tam = "+ stackGS.size());
        stackGS.printStack();
        System.out.println("");

        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("tam = " + cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("tam = " + cola.size);
        cola.printCola();
        System.out.println("");

        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        ColaG<Persona> colaPersonas = new ColaG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        System.out.println("Cantidad de personas: "+colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("Atiene a la persona => " + colaPersonas.remove().getNombre());
        System.out.println("Cantidad de personas: "+colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("");

        System.out.println("-----Ejercicio 01 sign-----");
        SignValidator sign = new SignValidator();
        String input = "([]){}";
        System.out.println("Input: "+input);
        System.out.println("Output: "+sign.isValid(input));
        input = "({)}";
        System.out.println("Input: "+input);
        System.out.println("Output: "+sign.isValid(input));

        System.out.println("-----Ejercicio 02 sorting-----");
        StackSorter sorting = new StackSorter();
        Stacks pila = new Stacks();

        pila.push(5);
        pila.push(1);
        pila.push(4);
        pila.push(2);

        System.out.println("Pila original: ");
        pila.printStack();

        sorting.sortStack(pila);

        System.out.println("Pila ordenada:");
        pila.printStack();

    }


}

package Ejercicio_02_sorting;

import controller.Stacks;

public class StackSorter {

    public void sortStack(Stacks stack) {
        Stacks pilaAuxiliar = new Stacks();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!pilaAuxiliar.isEmpty() && pilaAuxiliar.peek() > temp) {
                stack.push(pilaAuxiliar.pop());
            }

            pilaAuxiliar.push(temp);
        }

        while (!pilaAuxiliar.isEmpty()) {
            stack.push(pilaAuxiliar.pop());
        }

    }
}

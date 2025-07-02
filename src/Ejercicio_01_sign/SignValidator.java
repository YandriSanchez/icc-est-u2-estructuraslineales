package Ejercicio_01_sign;

import controller.StackGeneric;

public class SignValidator {

    public boolean isValid(String s) {
        StackGeneric<Character> pila = new StackGeneric<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {

                pila.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (pila.isEmpty()){
                    return false;
                } 

                char tope = pila.pop();

                if ((ch == ')' && tope != '(') || (ch == '}' && tope != '{') || (ch == ']' && tope != '[')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
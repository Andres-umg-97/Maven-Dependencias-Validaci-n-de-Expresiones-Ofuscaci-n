package stackHandler.handler;

import umg.edu.gt.data_structure.stack.manual.StackLinked;
import umg.edu.gt.data_structure.stack.manual.SymbolValidator;

public class Main {
	
	public static void main(String[] args) {
        StackLinked stack = new StackLinked();

        
        stack.initStack('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Tamanio? " + stack.size());
        System.out.println("Peek: " + stack.peek()); // C
        System.out.println("Pop: " + stack.pop());   // C
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());   // B
        System.out.println("Vacia? " + stack.isEmpty()); // false
        System.out.println("Pop: " + stack.pop());   // A
        System.out.println("Vacia? " + stack.isEmpty()); // true
        System.out.println("Pop: " + stack.pop());   // A
        
       
        String valido = "(a+b) * [c-d]";
        String invalido = "([)]";

        System.out.println("Caso válido:");
        System.out.println(valido + " → " + SymbolValidator.isValid(valido));

        System.out.println("\nCaso inválido:");
        System.out.println(invalido + " → " + SymbolValidator.isValid(invalido));
        
    }
}

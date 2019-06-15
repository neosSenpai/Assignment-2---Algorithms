package com.company;


public class Stack {

    /**
     * Private Implementation of a method to check if the parentheses match. The method implements the LinkedList class
     * it then splits the input array. Loops through the array creating a new node at each instance of "(","{", and "[" and pushing the node to the front of the stack.
     * If the matching parentheses is found and the stack is not empty the stack will implement the pop method, removing the node and thus ensuring the only
     * way there is not a match is if there is a closing bracket but no opening bracket in the stack.
     *
     * @param x, a string that the user must input in a form of a math equation.
     * @return
     */
    private boolean checkParenMatch(String x) {
        LinkedList<Node<String>> stack = new LinkedList<>();
        String[] expression = x.split("");
        for (int i = 0; i < expression.length; i++) {
            if (expression[i].equals("(") || expression[i].equals("{") || expression[i].equals("[")) {
                Node<String> object = new Node<>(expression[i], null, null);
                stack.push(object);
            } else if (expression[i].equals(")") || expression[i].equals("}") || expression[i].equals("]")) {
                if (stack.isEmpty()) {
                    System.out.println("Nothing to match \"" + expression[i] + "\".");
                    return false;
                } else {
                    if (stack.last().getElement().equals("(") && expression[i].equals(")")) {
                        stack.pop();
                    } else if (stack.last().getElement().equals("{") && expression[i].equals("}")) {
                        stack.pop();
                    } else if (stack.last().getElement().equals("[") && expression[i].equals("]")) {
                        stack.pop();
                    }
                }
            }

        }
        if (stack.isEmpty()) {
            System.out.println("Everything matched!");
            return true;
        } else {
            System.out.println("Not everything matched.");
            return false;
        }
    }

    /**
     * Public implementation of the check ParenMatch method.
     * @param x, a string that the user must input in a form of a math equation.
     */
    public void ParenMatch(String x) {
        checkParenMatch(x);
    }
}

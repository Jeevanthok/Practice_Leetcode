package com.random.question;

public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append text to the StringBuffer
        sb.append(" World");
        System.out.println("After append: " + sb.toString()); // Outputs: Hello World

        // Insert text at a specific position
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb.toString()); // Outputs: Hello Java World

        // Replace a portion of text
        sb.replace(6, 10, "Python");
        System.out.println("After replace: " + sb.toString()); // Outputs: Hello Python World

        // Delete a portion of text
        sb.delete(6, 13);
        System.out.println("After delete: " + sb.toString()); // Outputs: Hello World

        // Reverse the StringBuffer content
        sb.reverse();
        System.out.println("After reverse: " + sb.toString()); // Outputs: dlroW olleH
    }
}


package com.random.question;

public class StringArrayPractice {
    public static void main(String[] args) {
        String str = "Jee~van#raje~ndra#thok#khad~angali#sinnar";
        String[] valueArray = str.split("#");
        String[] value = valueArray[0].split("~");

        getfullvalue(value,str);

    }

    private static void getfullvalue(String[] value, String str) {
        value[0]= (1<str.length() ? "":",");
    }
}

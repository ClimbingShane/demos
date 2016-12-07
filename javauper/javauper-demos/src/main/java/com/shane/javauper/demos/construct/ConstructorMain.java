package com.shane.javauper.demos.construct;

public class ConstructorMain {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
    }

    public static class Person {
        static {
            System.out.println("this is static{} 1");
        }

        {
            System.out.println("this is {} 1");
        }

        public Person() {
            System.out.println("this is Person(){}");
        }

        {
            System.out.println("this is {} 2");
        }

        static {
            System.out.println("this is static{} 2");
        }
    }
}

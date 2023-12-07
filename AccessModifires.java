package com;

public class AccessModifires {


    //  using  protected
    protected void display() {
        System.out.println("Display-base");
    }


    public class Circle extends AccessModifires {

        //public and protected both can be used.
        //cannot use private
        protected void display() {
            System.out.println("Display-derived");
        }


//public class AccessModifires {

        public static void main(String[] args) {
            AccessModifires a = new AccessModifires();
            a.display();
        }
    }
}
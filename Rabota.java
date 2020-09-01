package ru.mirea.lab1;
public class Rabota {

    public static class Dog
    {
        private int age;
        private String name;
        Dog(int age, String name)
        {
            this.age=age;
            this.name=name;
        }
        public void ToString()
        {
            System.out.println(age);
            System.out.println(name);
        }

    }
    public static void main(String[]args)
    {
        Dog dog;
        dog = new Dog(4, "Latinos");
        dog.ToString();
    }

}

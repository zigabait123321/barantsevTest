package ru.qaAutomation.testttt;

public class MyFirstProgram {

  public static void main(String[] args) {
    System.out.println("Hello world");

    Square s = new Square(5);
    System.out.println(s.area());

    Rectangle r = new Rectangle(4,5);
    System.out.println(r.xyz());

    System.out.println("Всего аргументов в командной строке: " + args.length);

  }

}

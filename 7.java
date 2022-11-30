// multilevel inheritance
class Parent {
    int a, b, c;
    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Addition is " + c);
    }}
class Child extends Parent {
    int d, e, f;
    void sub() {
        d = 50;
        e = 40;
        f = d - e;
        System.out.println("Subtraction is " + f);
    }}
class GrandChild extends Child {
    int g, h, i;
    void mul() {
        g = 10;
        h = 20;
        i = g * h;
        System.out.println("Multiplication is " + i);
    }}
class Main {
    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
        obj.add();
        obj.sub();
        obj.mul();
    }}

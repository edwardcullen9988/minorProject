// single inheritance with constructor
class A
{
    String name;
    int rollNo;
    A()
    {
        name = "John";
        rollNo = 2;
    }
}
class B extends A{
    int eng,hindi,maths,science,social,total;
    B()
    {
        eng = 90;
        hindi = 80;
        maths = 70;
        science = 60;
        social = 50;
        total = eng+hindi+maths+science+social;
    }
    void show()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Total Marks: "+total);
    }
}
class InheritanceDemo
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
    }
}

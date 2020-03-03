public class CallStack
{
    public static void main(String[] args){
        System.out.println("Executed before calling method 1");
        method1();
        System.out.println("Executed after calling method 1");
}

    public void method1()
    {
        System.out.println("Executed before calling method 2");
        method2();
        System.out.println("Executed after calling method 2");
    }
    public void method2()
    {
        System.out.println("Executed before calling method 3");
        method3();
        System.out.println("Executed after calling method 3");
    }

    public void method3()
    {
        System.out.println("Executed after calling method 3");
    }
}
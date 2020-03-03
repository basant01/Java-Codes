
public class CarClient {

    public static void main(String args[]) {
        int i = 89;
        Car ob = new Car();
        Car newob = new Car();

        ob.accelerate();
        ob.accelerate();
        ob.accelerate();
        ob.accelerate();

        newob.accelerate();
        newob.accelerate();
        newob.accelerate();

        System.out.printf("The speed of object is %d %n ",ob.print());
        System.out.printf("The speed of object1 is %d %n ",newob.print());
    }
}
public class Car {
    private String mode1;
    private String make;
    private int speed;
    private String color;

    public void accelerate(){
        speed++;
    }

    public void slowDown(){
        speed--;
    }

    public void halt(){
        speed = 0;
    }

    public int print(){
        return speed;
    }   
}
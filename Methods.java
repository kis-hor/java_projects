public class Methods{
    public void fullThrottle(){
        System.out.println("The car is going at its speed");
    }
    public void speed(int maxSpeed){
        System.out.println("Its speed is " + maxSpeed + " m/s.");
    }
    public static void main(String[] args){
        Methods myCar = new Methods();
        myCar.fullThrottle();
        myCar.speed(100);
    }
}




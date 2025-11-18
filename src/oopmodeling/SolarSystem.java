package oopmodeling;

public class SolarSystem {
    public static void main(String[] args) {
        Object obj = new Planet();
        Object obj2 = new Planet();
        Planet jupiter = new Planet(324234 , "Jupiter" );
        Planet jupiter2 = new Planet(324234 , "Jupiter" );
                Planet mars = new Planet(435345 , "Mars", 2343);
        System.out.println(jupiter.getMass());

        Celestianbody body3 = new Planet();




    }

}

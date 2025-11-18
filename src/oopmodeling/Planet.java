package oopmodeling;

public class Planet extends Celestianbody {
    public Planet(){
        super();
    }



    //constructor with two parameters
    public Planet(double mass, String nameOf) {
        super(nameOf);
        name = nameOf;
        this.mass = mass;
    }

    //constructor with three parameters
    public Planet(double mass, String name, float radius) {
        super(mass, name);
        this.mass = mass;
        this.name = name;
        this.radius = radius;

    }


}

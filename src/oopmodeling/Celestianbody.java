package oopmodeling;

public class Celestianbody {

	protected double mass=12;
	public float size=23;
    protected float radius;
    String name="pluton";

    public Celestianbody(double mass, String name) {
    }

    public Celestianbody(String nameOf) {
    }

    public Celestianbody() {

    }

    public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	

}

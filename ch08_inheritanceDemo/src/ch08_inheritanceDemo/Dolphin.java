package ch08_inheritanceDemo;

public final class Dolphin extends Animal {
	private String bHsize;

	public Dolphin(String name, int limbs, int age, String type, String bHsize) {
		super(name, limbs, age, type);
		this.bHsize = bHsize;
	}
	
	public String getName() {
		return "Dolphin name is " + name; //works because name in Animal Class is protected
	}

	public String getBHsize() {
		return bHsize;
	}

	public void setBHsize(String bHsize) {
		this.bHsize = bHsize;
	}

	public void swim() {
		System.out.println(name + " swims.");
	}
}

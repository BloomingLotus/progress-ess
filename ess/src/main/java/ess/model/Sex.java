package ess.model;

public enum Sex {
	F("F"), M("M");
	
	String s;
	
	private Sex(String s) {
        this.s = s;
    }
	
	@Override
    public String toString() {
        return s;
    }
}

package edu.pitt.cs;

public class CatImpl implements Cat {

	boolean rent = false;
	String name;
	int id;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void rentCat() {
		this.rent = true;
	}

	public void returnCat() {
		this.rent = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() {
		return rent;
	}

	public String toString() {
		return "ID " + this.id + ". " + this.name;
	}

}
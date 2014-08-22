package model;

import java.util.List;

public class Comida {
	private int id;
	List<Ingrediente> ingredientes;
	List<Aderezo> aderezos;
	
	public Comida(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public List<Aderezo> getAderezos() {
		return aderezos;
	}

	public void setAderezos(List<Aderezo> aderezos) {
		this.aderezos = aderezos;
	}
	
}

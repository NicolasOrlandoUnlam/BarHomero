package ar.edu.unlam.barhomero;

public class Cliente implements Comparable<Cliente>{
	private Integer edad;
	private String nombre;
	
	//Constructor
	
	public Cliente(String nombre, Integer edad) {
		this.edad=edad;
		this.nombre=nombre;
	}
	
	//Getters y Setters
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public boolean equals(Object o){
		Cliente c = (Cliente) o;
		
		return nombre.equals(c.getNombre());
		
	}
	
	@Override
	public int hashCode() {
		return nombre.hashCode();
	}
	
	@Override
	public int compareTo(Cliente o) {
		
		return nombre.compareTo(o.getNombre());
	}
	
	

	
}//fin

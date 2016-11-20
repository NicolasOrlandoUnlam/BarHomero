package ar.edu.unlam.barhomero;

import java.util.Comparator;
import java.util.TreeSet;

public class Bar {
	private TreeSet<Cliente> listaDeClientes;
	public boolean abrir;
	//-------------------------------------------
	
	
	public Bar (){
		this.abrir = false;//false para inicie cerrado
		this.listaDeClientes = new TreeSet<Cliente>();
		
	}
	
	

	public Bar(Comparator<Cliente> comparator) {
		this.abrir = false;//false para inicie cerrado
		this.listaDeClientes = new TreeSet<Cliente>(comparator);
	}



	//-------------------------------------------
	public TreeSet<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}
	public void setListaDeClientes(TreeSet<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}
	public boolean isAbrir() {
		return abrir;
	}
	public void setAbrir(boolean abrir) {
		this.abrir = abrir;
	}

	public Boolean abrirBar() {
		return abrir=true;
		// TODO Auto-generated method stub
		
	}

	public void ingresoClientes(Cliente cliente) {
		if (abrir=true) {
			
			listaDeClientes.add(cliente);
		}else {
			System.out.println("EL BAR ESTA CERRADO");	
		}
		
	}

	public TreeSet<Cliente> listadoDeClientes() {
		
		return listaDeClientes;
	}

	public int obtenerCantidadDeClientes() {
		// TODO Auto-generated method stub
		return listaDeClientes.size();
	}
	
	

}//fin

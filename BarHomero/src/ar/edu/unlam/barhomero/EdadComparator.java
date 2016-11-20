package ar.edu.unlam.barhomero;

import java.util.Comparator;

public class EdadComparator implements Comparator<Cliente> {
	
@Override
	public int compare(Cliente cliente, Cliente clientes) {
		
		return cliente.getEdad() - clientes.getEdad();
	}

}

package ar.edu.unlam.barhomero;



import java.util.TreeSet;

import org.junit.Test;


public class TestsBarHomero {



	@Test
	public void testQueNoSeAdmitanClientesConElMismoNombre() {
		
		
		System.out.println("-----------Test que no admita duplicados--------");
		
		Bar bar = new Bar();
		
		bar.abrirBar();
		
		
		 Cliente cl1 = new Cliente ("Ale",21);
		 Cliente cl2 = new Cliente ("Bernardo",22);
		 Cliente cl3 = new Cliente ("Zenon",19);
		 Cliente cl4 = new Cliente ("Ale",21);
		 
		 bar.ingresoClientes(cl1);
		 bar.ingresoClientes(cl2);
		 bar.ingresoClientes(cl3);
		 bar.ingresoClientes(cl4);
		
		System.out.println("Ingresaron la cantidad de:	" +  bar.getListaDeClientes().size());
	}
	
	@Test
	public void testQueOrdeneClientesAlfabeticamente(){
		
		System.out.println("-----------Test Orden alfabetico de clientes--------");
		
		Bar bar = new Bar();
		bar.abrirBar();
		
		 Cliente cl1 = new Cliente ("Ale",21);
		 Cliente cl2 = new Cliente ("Bernardo",22);
		 Cliente cl3 = new Cliente ("Zenon",19);
		 Cliente cl4 = new Cliente ("Ale",21);
		 
		 bar.ingresoClientes(cl1);
		 bar.ingresoClientes(cl2);
		 bar.ingresoClientes(cl3);
		 bar.ingresoClientes(cl4);
		 
		 TreeSet<Cliente> lista = bar.getListaDeClientes();
		 
		 for(Cliente cliente : lista){
			 System.out.println(cliente.getNombre());
			 
		 }
		 
		 
	}

	@Test
	public void testQueElBarAbraSinClientes(){
		
		System.out.println("-----------Test Que el bar se abra sin clientes--------");
		
		Bar bar = new Bar();
		bar.abrirBar();
		
	System.out.println("El bar esta ABIERTO:	" + bar.abrir);	 
	System.out.println("La cantidad de clientes es:	" + bar.obtenerCantidadDeClientes());
		 
			 
		 }
	
	@Test
	public void testCompararClientesAdentroAfueraDelBar(){
System.out.println("-----------Test que compara clientes Adentro y Afuera del Bar--------");
		
		Bar bar = new Bar();
		bar.abrirBar();
		 
		Cliente clQueIngreso = new Cliente("Ale",21 );
		Cliente clQueNoIngreso = new Cliente("Ale", 26);
		bar.ingresoClientes(clQueIngreso);
		System.out.println(clQueIngreso.compareTo(clQueNoIngreso));
	}
	
	@Test
	public void testQueComparaPorEdad(){
		System.out.println("-----------Test que ordena clientes Por Edad--------");
		Bar bar = new Bar(new EdadComparator());
		bar.abrirBar();
		
		 Cliente cl1 = new Cliente ("Ale",21);
		 Cliente cl2 = new Cliente ("Bernardo",22);
		 Cliente cl3 = new Cliente ("Zenon",19);
		 Cliente cl4 = new Cliente ("Ale",21);
		 
		 bar.ingresoClientes(cl1);
		 bar.ingresoClientes(cl2);
		 bar.ingresoClientes(cl3);
		 bar.ingresoClientes(cl4);
		
		TreeSet<Cliente> clientes = bar.getListaDeClientes();
		 
		 for(Cliente cliente : clientes){
			 System.out.println(cliente.getNombre());
		 }
		 
		
	}
	
}//

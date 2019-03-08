package listas_Enlazadas;

public class AppListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Lista l = new Lista();
		l.crearLista();
		l.imprimirLista();
		l.insertarCabeza();
		l.imprimirLista();
		l.insertarCola();
		l.imprimirLista();
		l.insertarDespuesNodo(2);
		l.imprimirLista();
		l.insertarAntesNodo(2);
		l.imprimirLista();
		*/
		
		/*try{
			Cola q = new Cola();
		q.quitar();
		}catch(Exception NullPointerException) 
		{
			
		}*/
		Nodo b = new Nodo(4);
		//Cola c = new Cola(b);
		Nodo a = new Nodo(2);
		Nodo d = new Nodo(3);
		Nodo h = new Nodo(1);/*
		//c.imprimirLista();
		System.out.println("Elementos de la Cola:");
		c.insertarCola(d);
		c.insertarCola(a);
		c.insertarCola(h);
		c.imprimirLista();
		System.out.println("\nQuitamos el primer elemento en entrar (1): " + c.quitar().dato);
		c.imprimirLista();
		System.out.println("\nTamaño de la cola actual:");
		System.out.println(c.tamañoCola());
		System.out.println("\n La cola está vacía? "+c.isEmpty());
		System.out.println("\n La cola está lleno? "+c.colaLlena());
	*/
		
		Pila p = new Pila();
		p.insertarCabeza(h);
		p.insertarCabeza(a);
		p.insertarCabeza(d);
		p.insertarCabeza(b);
		p.imprimirLista();
		System.out.println("\nSacando el último elemento que entró: "+ p.Sacar().dato +" \n");
		p.imprimirLista();
		p.limpiarPila();
		p.insertarCabeza(h);
		p.imprimirLista();
	}

}

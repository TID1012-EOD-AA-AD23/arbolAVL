package arbolAVL;



public class ClienteMainAVL {

	public static void main(String[] args) {
		ArbolAVL abo = new ArbolAVL();
		try {
			//Insertar Datos
			
			/*
			abo.insertar(new Entero(2));
			BTreePrinter.printNode(abo.getRaiz());
			abo.insertar(new Entero(1));
			BTreePrinter.printNode(abo.getRaiz());
			abo.insertar(new Entero(4));
			BTreePrinter.printNode(abo.getRaiz());
			
		
			
			abo.insertar(new Entero(5));
			abo.insertar(new Entero(9));
			abo.insertar(new Entero(3));
			abo.insertar(new Entero(6));
			abo.insertar(new Entero(7));
			BTreePrinter.printNode(abo.getRaiz());
			
			abo.eliminar(new Entero(6));
			BTreePrinter.printNode(abo.getRaiz());
			
			abo.eliminar(new Entero(7));
			BTreePrinter.printNode(abo.getRaiz());
			
			abo.eliminar(new Entero(2));
			BTreePrinter.printNode(abo.getRaiz());
			
			abo.eliminar(new Entero(4));
			BTreePrinter.printNode(abo.getRaiz());
			
			*/
			
			
			
			abo.insertar(new Entero(10));
			BTreePrinter.printNode(abo.getRaiz());
			abo.insertar(new Entero(15));
			BTreePrinter.printNode(abo.getRaiz());
			abo.insertar(new Entero(30));
			BTreePrinter.printNode(abo.getRaiz());
			abo.insertar(new Entero(8));
			BTreePrinter.printNode(abo.getRaiz());
			abo.insertar(new Entero(5));
			BTreePrinter.printNode(abo.getRaiz());
			abo.insertar(new Entero(2));
			BTreePrinter.printNode(abo.getRaiz());
			abo.insertar(new Entero(1));
			BTreePrinter.printNode(abo.getRaiz());
			
			
			System.out.print("\nPostOrden: ");
			abo.postorden();
			System.out.print("\nPostOrden Iterativo: ");
			abo.postOrdenIterativo();
			System.out.print("\nInOrden: ");
			abo.inorden();
			System.out.print("\nInOrden Iterativo: ");
			abo.postOrdenIterativo();
			System.out.print("\nPreOrden: ");
			abo.preorden();
			System.out.print("\nPreOrden Iterativo: ");
			abo.preordenIterativo();
			System.out.print("\nNiveles: ");
			abo.recorridoPorNiveles();
			System.out.println();

			
			
			BTreePrinter.printNode(abo.getRaiz());
			abo.eliminar(new Entero(2));
			BTreePrinter.printNode(abo.getRaiz());
			
			
			
		}catch(Exception e) {
			System.out.println("Error "+e.getMessage());
		}
		
		

	}

}

package Principal;

import javax.swing.JOptionPane;

public class CuadroDialogos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreUsuario = JOptionPane.showInputDialog("Ingrese su Nombre:");
		String edad = JOptionPane.showInputDialog("Introduce tu edad:");
		
		int edadUsuario = Integer.parseInt(edad);
		
		System.out.println("Su Nombre es "+nombreUsuario+" y su edad hoy es "+edad);
		System.out.println("Entonces su edad el año siguiente es "+(edadUsuario+1));
		
	}

}

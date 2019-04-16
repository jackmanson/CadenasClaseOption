package Principal;

import javax.swing.JOptionPane;

public class NumerosFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero=JOptionPane.showInputDialog("Ingre un numero:");
		
		double raiz=Double.parseDouble(numero);
		
		System.out.printf("%1.2f",raiz/3);
		
		System.out.println("\n-------------------------------------------------");
		
		System.out.printf("%1.3f", Math.sqrt(raiz)); // sqrt da la raiz cuadrada

	}

}

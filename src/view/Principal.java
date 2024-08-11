package view;

import controller.FatorialController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		FatorialController fc = new FatorialController();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("informe um número inteiro menor ou igual a 12:" ));
		while (num > 12) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Você precisa informar um número inteiro menor ou igual a 12:" ));
		}
		int fatorial = fc.fatorial(num);
		System.out.println("O Fatorial de "+num+" é igual a: "+fatorial);
	}

}

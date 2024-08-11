package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int fatorial(int num) {
		//Condição de parada
		if (num == 0 || num == 1) {
			return 1;
		} else {
			//A função deverá retornar a multiplicação do resultado com o número imediatamente anterior
			int res = num;
			return res * fatorial(num - 1);
		}
	}

}

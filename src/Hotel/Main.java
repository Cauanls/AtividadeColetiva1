package Hotel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i < 50;i++) {
			Hospede hospede = new Hospede("hospede " + i);
			hospede.start();
		}
		
		for(int i = 0;i < 10;i++) {
			Camareira camareira = new Camareira("camareira " + i);
			camareira.start();
		}
		
		for(int i = 0;i < 5;i++) {
			Recepcionista recepcionista = new Recepcionista("recepcionista " + i);
			recepcionista.start();
		}
	}

}

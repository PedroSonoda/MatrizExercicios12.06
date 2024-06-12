package matrizExercicios;

public class MatrizC {

	public static void main(String[] args) {

		int a [] [] = new int [3] [3];
		int b [] [] = new int [3] [3];
		int c [] [] = new int [3] [3];

		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				a [i] [j] = (int)Math.round(Math.random()*100);
				b [i] [j] = (int)Math.round(Math.random()*100);
				c [i] [j] = b [i][j]*a[i][j];

			}
		} System.out.println("Matriz A");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("[" + a [i][j]+"]");
			}

			System.out.println("\n-----------------");
		}
		System.out.println("Matriz B");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("[" + b [i][j]+"]");
			}

			System.out.println("\n-----------------");
		}
		System.out.println("Matriz C com a multiplicação de A e B");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("[" + c [i][j]+"]");
			}

			System.out.println("\n-----------------");
		}
	}

}



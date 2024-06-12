package matrizExercicios;


public class MatrizDiagonal {

	public static void main(String[] args) {




		int m [] [] = new int [4] [4];


		for (int i=0; i<4; i++) {

			m [i] [i] = (int)Math.round(Math.random()*100);

		}

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("[" + m [i][j]+"]");
			}

			System.out.println("\n-----------------");
		}

	}

}

package uptc.edu.logic;

import java.util.Vector;


public class logica {



	//-------------------------Atributos-------------------
	private int vectorUno [][]; 
	private int vectorDos [][];


	//-----------------------Constructor-------------------
	public logica(){

		beginComponents();
		llenarVecUno();
		llenarVectorDos();
		compararVectores();
	}



	//---------------------Inicializar Componentes---------
	public void beginComponents(){


		vectorUno  = new int [100][170]; 
		vectorDos  = new int [100][170];
	}




	public void llenarVecUno(){

		for (int i = 0; i < vectorUno.length; i++) {

			for (int j = 0; j < vectorUno.length; j++) {
				int alc = (int)(Math.random()*500+1);
				vectorUno[i][j] = alc;

				System.out.println("Posición: ["+i+"]"+"["+j+"]"+" = " + vectorUno[i][j]);

			}

		}



		System.out.println("\n"+"-----------------------Vector Dos --------------------------"+"\n");
	} 



	public void llenarVectorDos(){

		for (int i = 0; i < vectorDos.length; i++) {

			for (int j = 0; j < vectorDos.length; j++) {
				
				int ale = (int)(Math.random()*500+1);
				vectorDos[i][j]=ale;
				System.out.println("Posición: ["+i+"]"+"["+j+"]"+" = " + vectorDos[i][j]);

			}
		}


	}

	public void compararVectores(){


		for (int i = 0; i < vectorDos.length; i++) {


			for (int j = 0; j < vectorDos.length; j++) {

				int a = vectorDos[i][j];
				int b = vectorUno[i][j];


				if (a==b) {

					System.out.println("Vector Uno: "+vectorUno[i][j] + " Vector Dos: "+vectorDos[i][j] + 
							" ==> En la pisición ["+i+"]" +"["+j+"]");

				}				

			}

		}


	}



}

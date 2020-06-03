

import java.util.Scanner;

public class Prisma {
	int baseTriangulo;
	int alturaPrisma;
	
	
	public Prisma(int baseTriangulo, int alturaPrisma) {
		this.baseTriangulo = baseTriangulo;
		this.alturaPrisma = alturaPrisma;
	}
	
	public Prisma() {
		this.baseTriangulo = baseTriangulo;
		this.alturaPrisma = alturaPrisma;
	}
	
	public int getBaseTriangulo() {
		return baseTriangulo;
	}
	
	
	
	public void setBaseTriangulo(int baseTriangulo) {
		this.baseTriangulo = baseTriangulo;
	}

	public int getAlturaPrisma() {
		return alturaPrisma;
	}

	public void setAlturaPrisma(int alturaPrisma) {
		this.alturaPrisma = alturaPrisma;
	}
	
	private static void imprimirValor(String valor) {
		System.out.println(valor);
	}
	
	public static float leerValor () {
		Scanner sc = new Scanner(System.in);
			String valor = sc.nextLine();
				if(esNumero(valor)) {
					return Float.parseFloat(valor);
				} else {
					leerValor();
				}
		return 0f;
	}
	
	public static boolean esNumero (String valor) {
		float validarnum = 0.0f;
			try {
				validarnum = Float.parseFloat(valor);
				return true;			
			} catch (NumberFormatException e) {
				System.out.println("Dame un numero, por favor");		
			}
			return false;
	}
	
	public static float alturaTriangulo (float baseTriangulo) { 
		return (float) (baseTriangulo * (Math.sqrt(3)) / 2 );	
	}
	
	public static float areaBase (float baseTriangulo, float alturaTriangulo) { 
		return (baseTriangulo * alturaTriangulo ) / 2;
	}
	
	public static float perimetro (float baseTriangulo) { 
		return 3 * baseTriangulo;
	}
	
	public static float areaLateral (float perimetro, float alturaPrisma) { 
		return perimetro * alturaPrisma;
	}
	
	public static float areaTotal (float areaBase, float areaLateral) { 
		return 2 * areaBase + areaLateral;
	}

	
}	
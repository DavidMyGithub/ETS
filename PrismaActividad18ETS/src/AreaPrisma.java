

import java.util.Scanner;

public class AreaPrisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Programa para calcular el area de un prisma:");
		System.out.println("Dame la base del triangulo equilátero del prisma:");
		float baseTriangulo= leerValor();
		System.out.println("Dame la altura del prisma:");
		float alturaPrisma= leerValor();
		
		float alturaTriangulo = alturaTriangulo(baseTriangulo);	
		float areaBase = areaBase(baseTriangulo, alturaTriangulo);
		float perimetro = perimetro (baseTriangulo);
		float areaLateral = areaLateral(perimetro, alturaPrisma);
		float areaTotal= areaTotal(areaBase, areaLateral);
		System.out.println();
		imprimirValor("- Base: " + String.valueOf(baseTriangulo));
		imprimirValor("- Altura: " + String.valueOf(alturaPrisma));
		imprimirValor("- AreaTotal: " + String.valueOf(areaTotal));
		
		
		
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

//Esto es una actividad de ETS

import java.util.ArrayList;
import java.util.Collections;

public class AreaPrismaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("**********************");
		System.out.println("CREACION DE OBJETOS PRSIMA");
		System.out.println("**********************");
		
		System.out.println("Creando el objeto Prisma1 con:");
		int baseTriangulo1 = (int) (Math.random()*10) +1;
		int alturaTriangulo1 = (int) (Math.random()*10) +1;
		Prisma prisma1 = new Prisma(baseTriangulo1, alturaTriangulo1);
		System.out.println("Base: " + baseTriangulo1);
		System.out.println("Altura: " + alturaTriangulo1);
		float areaBase1= prisma1.areaBase(baseTriangulo1, alturaTriangulo1);
		float perimetro1= prisma1.perimetro(baseTriangulo1);
		float alturaPrisma1= prisma1.getAlturaPrisma();
		float areaLateral1 = prisma1.areaLateral(perimetro1, alturaPrisma1);
		float areaTotal1 = prisma1.areaTotal(areaBase1, areaLateral1);
		System.out.println("Area total: " + areaTotal1);  
		
		System.out.println("");
		
		System.out.println("Creando el objeto Prisma2 con:");
		int baseTriangulo2 = (int) (Math.random()*10) +1;
		int alturaTriangulo2 = (int) (Math.random()*10) +1;
		Prisma prisma2 = new Prisma(baseTriangulo2, alturaTriangulo2);
		System.out.println("Base: " + baseTriangulo2);
		System.out.println("Altura: " + alturaTriangulo2);
		float areaBase2= prisma2.areaBase(baseTriangulo2, alturaTriangulo2);
		float perimetro2= prisma2.perimetro(baseTriangulo2);
		float alturaPrisma2= prisma2.getAlturaPrisma();
		float areaLateral2 = prisma2.areaLateral(perimetro2, alturaPrisma2);
		float areaTotal2 = prisma2.areaTotal(areaBase2, areaLateral2);
		System.out.println("Area total: " + areaTotal2); 
		System.out.println("");
		
		System.out.println("Creando el objeto Prisma3 con:");
		int baseTriangulo3 = (int) (Math.random()*10) +1;
		int alturaTriangulo3 = (int) (Math.random()*10) +1;
		Prisma prisma3 = new Prisma(baseTriangulo3, alturaTriangulo3);
		System.out.println("Base: " + baseTriangulo3);
		System.out.println("Altura: " + alturaTriangulo3);
		float areaBase3= prisma3.areaBase(baseTriangulo3, alturaTriangulo3);
		float perimetro3= prisma3.perimetro(baseTriangulo3);
		float alturaPrisma3= prisma3.getAlturaPrisma();
		float areaLateral3 = prisma3.areaLateral(perimetro3, alturaPrisma3);
		float areaTotal3 = prisma3.areaTotal(areaBase3, areaLateral3);
		System.out.println("Area total: " + areaTotal3); 
		System.out.println("");
		
		System.out.println("**********************");
		
		System.out.println("Ordenados de mayor a menor:");
		
		ArrayList <Float> prismas = new ArrayList <Float>();
		prismas.add(areaTotal1);
		prismas.add(areaTotal2);
		prismas.add(areaTotal3);
		Collections.sort(prismas);

		if(areaTotal3>= areaTotal2 && areaTotal3 >= areaTotal2) {
			System.out.println("- Prisma3: area total " +  areaTotal3);
			if (areaTotal2 > areaTotal1) {
				System.out.println("- Prisma2: area total " +  areaTotal2);
				System.out.println("- Prisma1: area total " +  areaTotal1);
			} else {
				System.out.println("- Prisma1: area total " +  areaTotal1);
				System.out.println("- Prisma2: area total " +  areaTotal2);
			}
		} else if (areaTotal2 >= areaTotal3 && areaTotal2 >= areaTotal1) {
			System.out.println("- Prisma2: area total " +  areaTotal2);
			if (areaTotal1 >= areaTotal3) {
				System.out.println("- Prisma1: area total " +  areaTotal1);
				System.out.println("- Prisma3: area total " +  areaTotal3);
			} else {
				System.out.println("- Prisma3: area total " +  areaTotal3);
				System.out.println("- Prisma1: area total " +  areaTotal1);
			}			
		} else if (areaTotal1 >= areaTotal3 && areaTotal1 >= areaTotal2) {
			System.out.println("- Prisma1: area total " +  areaTotal1);
			if (areaTotal2 >= areaTotal3) {
				System.out.println("- Prisma2: area total " +  areaTotal2);
				System.out.println("- Prisma3: area total " +  areaTotal3);
			} else {
				System.out.println("- Prisma3: area total " +  areaTotal3);
				System.out.println("- Prisma2: area total " +  areaTotal2);
			}
			
		}
		System.out.println("");
		
		
	}

}

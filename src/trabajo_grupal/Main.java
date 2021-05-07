package trabajo_grupal;
import java.util.Scanner;

public class Main {

public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		
		
		double temperatura;
		int sector1 = 0;
		int sector2 = 0;
		int sector3 = 0;
		int ts1 = 0;
		int TS2 = 0;
		int TS3 = 0;
		int NTF =0;
		int empleados = 0;
		
		for (empleados = 0; empleados < 50; empleados ++) {
					
		int respuestaSector = (int) Math.floor(Math.random()* 3 + 1);	
		
		  if(respuestaSector ==1) { 
			{System.out.println("Es del sector 1");} {sector1 ++;} {System.out.println("Ingrese temperatura");}
			temperatura = ((Math.random()*(40-35))+35);
		
			if(temperatura >37) {{System.out.println("Tiene Fiebre");} {ts1 ++;}}
			else if (temperatura <37) {{ System.out.println("No tiene fiebre");} {NTF ++;}}
			
		}
		
		else if (respuestaSector ==2) {
			{System.out.println("Es del sector 2");} {sector2 ++;} {System.out.println("Ingrese temperatura");}
			temperatura = ((Math.random()*(40-35))+35);
			
			if(temperatura >37) {{System.out.println("Tiene Fiebre");} {TS2 ++;}}
			else if (temperatura <37) {{ System.out.println("No tiene fiebre");} {NTF ++;}}			
		}

		else if (respuestaSector ==3) { 
			{System.out.println("Es del sector 3");} {sector3 ++;} {System.out.println("Ingrese temperatura");}
			temperatura = ((Math.random()*(40-35))+35);
		
			if(temperatura >37) {{System.out.println("Tiene Fiebre");} {TS3 ++;}}
			else if (temperatura <37) {{ System.out.println("No tiene fiebre");} {NTF ++;}}
		}
}
		
		System.out.println("LOS RESULTADOS SON LOS SIGUIENTES");
		System.out.println("Los empleados con fiebre del sector 1 son: " + ts1);
		System.out.println("Los empleados con fiebre del sector 2 son: " + TS2);
		System.out.println("Los empleados con fiebre del sector 3 son: " + TS3);
		System.out.println("Los empleados que no tienen fiebre son: " + NTF);

		double porcentajeTotal = ts1 + TS2 + TS3;
		double porcentajeSector1 = (ts1 * 100) / sector1;
		double porcentajeSector2 = (TS2 * 100) / sector2;
		double porcentajeSector3 = (TS3 * 100) / sector3;

		System.out.println("El porcentaje de empleados total con fiebre es: " + porcentajeTotal * 100 / 50 + "%");
		System.out.println("El porcentaje de empleados del sector 1 con fiebre es: " + porcentajeSector1 + "%");
		System.out.println("El porcentaje de empleados del sector 2 con fiebre es: " + porcentajeSector2 + "%");
		System.out.println("El porcentaje de empleados del sector 3 con fiebre es: " + porcentajeSector3 + "%");

	}

}

import java.io.*; 
// Programa que dice el mes siguiente y el anterior
public class Exercici6 {
    public static void main(String[] args) throws IOException {
		int mes;
		int anno;
		BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un mes=");
        String valor1 = valor.readLine();
        mes = Integer.parseInt(valor1);
        System.out.print("Introduce un año=");
        String valor2 = valor.readLine();
        anno = Integer.parseInt(valor2);
		switch (mes){
			case 1:
				System.out.println("Mes que has introducido=1/"+anno+" Mes anterior=12/"+(anno-1)+" Mes siguiente"+(mes+1)+"/"+anno);
			break;
			case 2:
				System.out.println("Mes que has introducido=2/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente="+(mes+1)+"/"+anno);
			break;
			case 3:
				System.out.println("Mes que has introducido=3/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente="+(mes+1)+"/"+anno);
			break;
			case 4:
				System.out.println("Mes que has introducido=4/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente="+(mes+1)+"/"+anno);
			break;
			case 5:
				System.out.println("Mes que has introducido=5/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente="+(mes+1)+"/"+anno);
			break;
			case 6:
				System.out.println("Mes que has introducido=6/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente="+(mes+1)+"/"+anno);
			break;
			case 7:
				System.out.println("Mes que has introducido=7/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente="+(mes+1)+"/"+anno);
			break;
			case 8:
				System.out.println("Mes que has introducido=8/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente="+(mes+1)+"/"+anno);
			break;
			case 9:
				System.out.println("Mes que has introducido=9/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente="+(mes+1)+"/"+anno);
			break;
			case 10:
				System.out.println("Mes que has introducido=10/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente="+(mes+1)+"/"+anno);
			break;
			case 11:
				System.out.println("Mes que has introducido=11/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente="+(mes+1)+"/"+anno);
			break;
			case 12:
				System.out.println("Mes que has introducido=12/"+anno+" Mes anterior="+(mes-1)+"/"+anno+" Mes siguiente=1/"+(anno+1));
			break;
		}
    }
}

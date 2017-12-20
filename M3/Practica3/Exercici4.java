import java.io.*; 
// Ascensor
public class Exercici4 {
    public static void main(String[] args) throws IOException {
        String movimiento;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Indica en que piso estas(1=planta baja, 2=primera planta, 3=segunda planta)=");
        String pa = reader.readLine();
        int A = Integer.parseInt(pa);
        while(A!=1&&A!=2&&A!=3){
			System.out.println("Error introduce un piso que exista");
			System.out.print("Indica en que piso estas(1=planta baja, 2=primera planta, 3=segunda planta)=");
			String pa2 = reader.readLine();
			int B = Integer.parseInt(pa2);
			A=B;
		}
		do {
		System.out.println("Estas en el siguiente piso="+A+" Leyenda=(1=planta baja, 2=primera planta, 3=segunda planta)");
		System.out.println("Tienes las siguientes opciones para navegar por el ascensor");
		System.out.println("a=subir 1 piso");
		System.out.println("b=subir 2 pisos");
		System.out.println("c=bajar 1 piso");
		System.out.println("d=bajar 2 pisos");
		System.out.println("x=salir del ascensor");
		System.out.print("Elige una opcion=");
		movimiento = reader.readLine();
		switch (movimiento){
			case "a":
			A=A+1;
			break;
			case "b":
			A=A+2;
			break;
			case "c":
			A=A-1;
			break;
			case "d":
			A=A-2;
			break;
		}
		switch (A){
			case 4:
			System.out.println("Error no existe ese piso(vuelves a la planta baja)");
			A=1;
			break;
			case 5:
			System.out.println("Error no existe ese piso(vuelves a la planta baja)");
			A=1;
			break;
			case 0:
			System.out.println("Error no existe ese piso(vuelves a la planta baja)");
			A=1;
			break;
			case (-1):
			System.out.println("Error no existe ese piso(vuelves a la planta baja)");
			A=1;
			break;
		}
		System.out.println("Estas en el siguiente piso="+A);
		}
		while(!movimiento.equals("x"));
		System.out.println("Has salido del ascensor");
    }
}

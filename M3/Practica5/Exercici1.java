import java.io.*; 
public class Exercici1 {
    public static void main(String[] args) throws IOException {
        int i;
        int notabaja=10;
        int notamayor=0;
        int notamedia;
        int suma=0;
        String nombrebaja;
        String nombrealta;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce la cantidad de alumnos=");
        String alumno = reader.readLine();
        int alumnos = Integer.parseInt(alumno);
        while(alumnos>=51 || alumnos<=0){
		System.out.println("Error");
		System.out.println("Introduce la cantidad de alumnos=");
		String alumno2 = reader.readLine();
		int alumnos2 = Integer.parseInt(alumno2);
		alumnos=alumnos2;
		}
        for(i=0;i<alumnos;i++){
			System.out.print("Introduce el nombre=");
			String nombre = reader.readLine();
			System.out.print("Introduce la nota=");
			String numero = reader.readLine();
			int nota = Integer.parseInt(numero);
			suma=suma+nota;
			if (nota<=notabaja){
				notabaja=nota;
			}
			else if (nota>=notamayor){
				notamayor=nota;
			}
		}
			
			
		
		notamedia=suma/alumnos;
		System.out.println("La nota media es="+notamedia);
		System.out.println("La nota mas baja es="+notabaja);
		System.out.println("La nota mas alta es="+notamayor);
    }
}


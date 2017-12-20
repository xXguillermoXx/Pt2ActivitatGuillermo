import java.io.*; 
public class Exercici3 {
    public static void main(String[] args) throws IOException {
        int i;
        int x;
        int array_notas[];
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
		array_notas=new int[alumnos];
        for(i=0;i<alumnos;i++){
			System.out.print("Introduce la nota=");
			String numero = reader.readLine();
			array_notas[i] = Integer.parseInt(numero);

		}
		for(x=alumnos-1;x>0;x--){
		
			System.out.print(array_notas[x]+",");
		}
			System.out.print(array_notas[0]);
    }
}

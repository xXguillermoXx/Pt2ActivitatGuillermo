import java.io.*; 
public class Exercici10 {
    public static void main(String[] args) throws IOException {
        int i;
        int x;
        int y;
        int z;
        int totalbuscar=0;
        float notabaja=10;
        float notamayor=0;
        float notamedia;
        float suma=0;
        String nombrebaja;
        String nombrealta;
        float array_notas[];
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
		array_notas=new float[50];
        for(i=0;i<alumnos;i++){
			System.out.print("Introduce la nota=");
			String numero = reader.readLine();
			array_notas[i] = Float.parseFloat(numero);
			suma=suma+array_notas[i];
			if (array_notas[i]>=notamayor){
				notamayor=array_notas[i];
			}
			if (array_notas[i]<=notabaja){
				notabaja=array_notas[i];
			}
		}
			
		notamedia=suma/alumnos;
		System.out.println("La nota media es="+notamedia);
		System.out.println("La nota mas baja es="+notabaja);
		System.out.println("La nota mas alta es="+notamayor);
		
		System.out.print("Introduce la nota que quieres buscar=");
		String notabu = reader.readLine();
		int notab = Integer.parseInt(notabu);
		for (y=0;y<=alumnos;y++){
			if(array_notas[y]==notab){
				totalbuscar=totalbuscar+1;
			}
			if (y==0){
				System.out.print("La posicion de las notas son:");
			}
			if (y==alumnos-1){
				if(array_notas[y]==notab){
					x=y;
					System.out.print(x);
					break;
				}
			}
			if(array_notas[y]==notab){
				x=y;
				System.out.print(x+" - ");
			}
		}
		System.out.println();
		System.out.println("Hay "+totalbuscar+" notas con el valor "+notab);
		
    }
}

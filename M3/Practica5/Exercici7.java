import java.io.*; 
public class Exercici7 {
    public static void main(String[] args) throws IOException {
        int i;
        int x;
        int y;
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
		array_notas=new float[alumnos];
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
		System.out.println("Quieres aprobar a todos?(si o no)");
		String pregunta = reader.readLine();
		if (pregunta.equals("si")){
		notabaja=10;
		notamayor=0;
		suma=0;
		for(y=0;y<alumnos;y++){
			if (array_notas[y]<=4){
				array_notas[y]=5;
			}
			if (y==alumnos-1){
				if (array_notas[y]>=notamayor){
					notamayor=array_notas[y];
				}
				if (array_notas[y]<=notabaja){
					notabaja=array_notas[y];
				}
				suma=suma+array_notas[y];
				System.out.println(array_notas[y]);
				continue;
			}
			if (array_notas[y]>=notamayor){
				notamayor=array_notas[y];
			}
			if (array_notas[y]<=notabaja){
				notabaja=array_notas[y];
			}
			suma=suma+array_notas[y];
			System.out.print(array_notas[y]+" - ");
		}
		}
		notamedia=suma/alumnos;
		System.out.println("La nota media es="+notamedia);
		System.out.println("La nota mas baja es="+notabaja);
		System.out.println("La nota mas alta es="+notamayor);
		

		
    }
}

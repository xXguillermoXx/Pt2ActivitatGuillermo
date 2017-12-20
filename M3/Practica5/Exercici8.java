import java.io.*; 
public class Exercici8 {
    public static void main(String[] args) throws IOException {
        float q;
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
		
		System.out.print("Introduce la posicion de la nota que quieres añadir=");
		String pos = reader.readLine();
		int pos1 = Integer.parseInt(pos);
		System.out.println("Introduce la nueva nota=");
		String newnota = reader.readLine();
		float newnota1 = Float.parseFloat(newnota);
		for (y=alumnos;y>pos1;y--){
			array_notas[y]=array_notas[y-1];
		}
		array_notas[pos1] = newnota1;
		suma=0;
		notamayor=0;
		notabaja=10;
		for(x=0;x<=alumnos;x++){
			if (x==alumnos){
				System.out.println(array_notas[x]);
				if (array_notas[x]>=notamayor){
					notamayor=array_notas[x];
				}
				if (array_notas[x]<=notabaja){
					notabaja=array_notas[x];
				}
				suma=suma+array_notas[x];
				continue;
			}
			System.out.print(array_notas[x]+" - ");
			suma=suma+array_notas[x];
			if (array_notas[x]>=notamayor){
				notamayor=array_notas[x];
			}
			if (array_notas[x]<=notabaja){
				notabaja=array_notas[x];
			}
		}
		
		notamedia=suma/alumnos;
		System.out.println("La nota media es="+notamedia);
		System.out.println("La nota mas baja es="+notabaja);
		System.out.println("La nota mas alta es="+notamayor);
		
    }
}

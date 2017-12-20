import java.io.*; 
public class Exercici11 {
    public static void main(String[] args) throws IOException {
		int i;
		float suma=0;
		float notabaja=10;
		float notamayor=0;
		float notamedia;
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

		}
		System.out.println("Que quieres hacer con las notas?");
		System.out.println("1 = Mirar las notas");
		System.out.println("2 = Estadisticas notas");
		System.out.println("3 = Corregir nota");
		System.out.println("4 = Aprovar a todos");
		System.out.println("5 = Añadir una nota");
		System.out.println("6 = Eliminar una nota");
		System.out.println("7 = Buscar una nota");
		String programa = reader.readLine();
		int progsel = Integer.parseInt(programa);
		switch(progsel){
			case 1:
			int x;
			System.out.print("Las notas son: ");
			for(x=0;x<alumnos;x++){
			if(x==alumnos-1){
				System.out.print(array_notas[x]);
				continue;
			}
			System.out.print(array_notas[x]+" - ");
			}
			break;
			case 2:
			int x1;
			for(x1=0;x1<alumnos;x1++){
			suma=suma+array_notas[x1];
			if (array_notas[x1]>=notamayor){
				notamayor=array_notas[x1];
			}
			if (array_notas[x1]<=notabaja){
				notabaja=array_notas[x1];
			}
			}
			notamedia=suma/alumnos;
			System.out.println("La nota media es="+notamedia);
			System.out.println("La nota mas baja es="+notabaja);
			System.out.println("La nota mas alta es="+notamayor);
			break;
			case 3:
			int x2;
			System.out.print("Introduce la posicion de la nota que quieres cambiar=");
			String pos = reader.readLine();
			int pos1 = Integer.parseInt(pos);
			System.out.println("Introduce la nueva nota=");
			String newnota = reader.readLine();
			float newnota1 = Float.parseFloat(newnota);
			array_notas[pos1] = newnota1;
			for(x2=0;x2<alumnos;x2++){
			if (x2==alumnos-1){
				System.out.println(array_notas[x2]);
				continue;
			}
			System.out.print(array_notas[x2]+" - ");
			}
			break;
			case 4:
			int y;
			System.out.println("Estas seguro de aprovar a todos?(si o no)");
			String pregunta = reader.readLine();
			if (pregunta.equals("si")){
			for(y=0;y<alumnos;y++){
			if (array_notas[y]<=4){
				array_notas[y]=5;
			}
			if (y==alumnos-1){
				System.out.println(array_notas[y]);
				continue;
			}
			System.out.print(array_notas[y]+" - ");
			}
			}	
			break;
			case 5:
			int x3;
			int y2;
			System.out.print("Introduce la posicion de la nota que quieres añadir=");
			String pos11 = reader.readLine();
			int pos2 = Integer.parseInt(pos11);
			System.out.println("Introduce la nueva nota=");
			String newnota2 = reader.readLine();
			float newnota12 = Float.parseFloat(newnota2);
			for (y2=alumnos;y2>pos2;y2--){
				array_notas[y2]=array_notas[y2-1];
			}
			array_notas[pos2] = newnota12;
			for(x3=0;x3<=alumnos;x3++){
			if (x3==alumnos){
				System.out.println(array_notas[x3]);
				continue;
			}
			System.out.print(array_notas[x3]+" - ");
			}
			break;
			case 6:
			int y3;
			int x4;
			System.out.print("Introduce la posicion de la nota que quieres eliminar=");
			String pos33 = reader.readLine();
			int pos3 = Integer.parseInt(pos33);
			for (y3=pos3;y3<alumnos;y3++){
				array_notas[y3]=array_notas[y3+1];
			}
			for(x4=0;x4<=alumnos;x4++){
				if(x4==alumnos-2){
					System.out.print(array_notas[x4]);
					break;
				}
			System.out.print(array_notas[x4]+" - ");
			}
			break;
			case 7:
			int y4;
			int x5;
			int totalbuscar=0;
			System.out.print("Introduce la nota que quieres buscar=");
			String notabu = reader.readLine();
			int notab = Integer.parseInt(notabu);
			for (y4=0;y4<=alumnos;y4++){
				if(array_notas[y4]==notab){
					totalbuscar=totalbuscar+1;
				}
				if (y4==0){
					System.out.print("La posicion de las notas son:");
				}
				if(array_notas[y4]==notab){
					x5=y4;
					System.out.print(x5+" - ");
				}
			}
			System.out.println();
			System.out.println("Hay "+totalbuscar+" notas con el valor "+notab);
			break;
		}
    }
}

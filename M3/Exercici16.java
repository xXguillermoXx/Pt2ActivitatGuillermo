import java.io.*; 
// Ascensor
public class Exercici16 {
    public static void main(String[] args) throws IOException {
        int piso2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Indica el piso en el que se encuentra(primer piso, segundo piso, tercer piso)=");
        String piso = reader.readLine();
        if (piso.equals("primer piso")){
			piso2=1;
		}
        else if(piso.equals("segundo piso")){
			piso2=2;
		}
		else if(piso.equals("tercer piso")){
			piso2=3;
		}
		System.out.print("Indica cuantos pisos quieres subir o bajar(subir 1 piso, subir 2 pisos, bajar 1 piso, bajar 2 pisos)=");
		String ascensor = reader.readLine();
		if (ascensor.equals("subir 1 piso")){
			piso2=piso2+1;
			System.out.println("Se encuentra en el siguiente piso="+piso+"piso");
		}
		
	}
}

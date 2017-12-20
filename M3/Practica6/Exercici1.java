import java.io.*; 
public class Exercici1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce texto=");
        String texto = reader.readLine();
        System.out.println("Introduce un caracter=");
        String caracter = reader.readLine();
        if (texto.indexOf(caracter) > -1){
			System.out.print("El caracter '"+caracter+"' aparece en '"+texto+"'");
		}
		else{
			System.out.print("El caracter '"+caracter+"' no aparece en '"+texto+"'");
		}
			
    }
}

import java.io.*; 
public class Exercici2 {
    public static void main(String[] args) throws IOException {
        int i;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un nombre=");
        String nombre = reader.readLine();
        System.out.print("Introduce un numero=");
        String numero1 = reader.readLine();
        int numero = Integer.parseInt(numero1);
        for(i=0;i<numero;i++){
			System.out.println(nombre);
		}
    }
}

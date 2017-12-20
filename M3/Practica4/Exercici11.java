import java.io.*; 
public class Exercici11 {
    public static void main(String[] args) throws IOException {
        int i;
        int y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un numero=");
        String numero1 = reader.readLine();
        int numero = Integer.parseInt(numero1);
        for(y=1;y<=numero;y++){
        for(i=1;i<=y;i++){
			System.out.print("*");
		}
		System.out.println("");
		}
    }
}


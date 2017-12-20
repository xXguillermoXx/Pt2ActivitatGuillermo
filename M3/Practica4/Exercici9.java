import java.io.*; 
public class Exercici9 {
    public static void main(String[] args) throws IOException {
        int i;
        int y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un numero=");
        String numero1 = reader.readLine();
        int numero = Integer.parseInt(numero1);
        for(y=0;y<numero;y++){
			System.out.println("");
        for(i=1;i<numero+1;i++){
			System.out.print(i);
		}
		}
    }
}


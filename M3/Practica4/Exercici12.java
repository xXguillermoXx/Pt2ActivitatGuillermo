import java.io.*; 
public class Exercici12 {
    public static void main(String[] args) throws IOException {
        int i;
        int y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un numero=");
        String numero1 = reader.readLine();
        int numero = Integer.parseInt(numero1);
        for(y=1;y<=numero;y++){
        for(i=y;i>=1;i--){
			while (i<y){
				System.out.print(",");
				break;
			}
			System.out.print(i);
			
		}
		System.out.println("");
		}
    }
}


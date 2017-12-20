import java.io.*; 
public class Exercici13 {
    public static void main(String[] args) throws IOException {
        int i;
        int y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un numero=");
        String numero1 = reader.readLine();
        int numero = Integer.parseInt(numero1);
        for(y=numero;y>=1;y--){
        for(i=1;i<=y;i++){
			System.out.print(i);
			while (i<y){
				System.out.print(",");
				break;
			}
			
		}
		System.out.println("");
		}
    }
}


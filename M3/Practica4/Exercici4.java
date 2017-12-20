import java.io.*; 
public class Exercici4 {
    public static void main(String[] args) throws IOException {
        int i;
        int suma=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un numero=");
        String numero1 = reader.readLine();
        int numero = Integer.parseInt(numero1);
        for(i=0;i<=numero;i++){
			suma=suma+i;
		}
		System.out.println("La suma es="+suma);
    }
}

import java.io.*; 
public class Exercici2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un numero=");
        String numero1 = reader.readLine();
        int numero = Integer.parseInt(numero1);
		cubenumbers(numero);
    }
    public static void cubenumbers(int x){
		int i;
		int y;
		for(y=0;y<x;y++){
			System.out.println("");
        for(i=1;i<x+1;i++){
			System.out.print(i);
		}
		}
	}
}


import java.io.*; 
public class Exercici7 {
    public static void main(String[] args) throws IOException {
		int i;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce una palabra=");
        String palabra = reader.readLine();
        int x = palabra.length();
        for (i=1;i<x;i++){
			System.out.println(palabra.substring(0,i));
		}
		for (i=x;i>0;i--){
			System.out.println(palabra.substring(0,i));
		}
    }
}

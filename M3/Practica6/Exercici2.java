import java.io.*; 
public class Exercici2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce tu nombre=");
        String nombre = reader.readLine();
        System.out.print(nombre.toUpperCase());
        
    }
}

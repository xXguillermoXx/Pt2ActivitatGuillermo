import java.io.*; 
public class Exercici3 {
    public static void main(String[] args) throws IOException {
		int contador=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce tu nombre=");
        String nombre = reader.readLine();
        int ba = nombre.indexOf('a');
        while(ba!=-1){
			contador=contador+1;
			ba = nombre.indexOf('a', ba + 1);
		}
        System.out.print("El nombre contiene "+contador+" 'a's");   
    }
}

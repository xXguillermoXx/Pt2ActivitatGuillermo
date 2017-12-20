import java.io.*; 
public class Exercici5 {
    public static void main(String[] args) throws IOException {
		int i;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce tu nombre=");
        String nombre = reader.readLine();
        int x = nombre.length();
        for (i=0;i<x;i++){
			if(i==0){
				System.out.print((""+nombre.charAt(0)).toUpperCase());
				continue;
			}
			else if ((""+nombre.charAt(i-1)).equals(" ")){
			System.out.print((""+nombre.charAt(i)).toUpperCase());
			}
			else{
			System.out.print((""+nombre.charAt(i)));
			}
		}
    }
}

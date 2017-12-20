import java.io.*; 
public class Exercici4 {
    public static void main(String[] args) throws IOException {
		int contador=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce tu nombre=");
        String nombre = reader.readLine();
        int ba = nombre.indexOf('a');
        int be = nombre.indexOf('e');
        int bi = nombre.indexOf('i');
        int bo = nombre.indexOf('o');
        int bu = nombre.indexOf('u');
        while(ba!=-1){
			contador=contador+1;
			ba = nombre.indexOf('a', ba + 1);
		}
		while(be!=-1){
			contador=contador+1;
			be = nombre.indexOf('e', be + 1);
		}
		while(bi!=-1){
			contador=contador+1;
			bi = nombre.indexOf('i', bi + 1);
		}
		while(bo!=-1){
			contador=contador+1;
			bo = nombre.indexOf('o', bo + 1);
		}
		while(bu!=-1){
			contador=contador+1;
			bu = nombre.indexOf('u', bu + 1);
		}
        System.out.print("El nombre contiene "+nombre.length()+" caracteres y "+contador+" vocales");   
    }
}

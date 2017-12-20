import java.io.*; 
public class Exercici4 {
    public static void main(String[] args) throws IOException {
        int i;
        int x=0;
        int array_numero[];
        array_numero=new int[101];
        for(i=0;i<=100;i++){
			array_numero[i]=x;
			x=x+2;
			System.out.println(i+"-"+array_numero[i]);
		}
    }
}

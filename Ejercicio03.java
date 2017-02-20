package actividad01;
import java.io.*;

public class Ejercicio03 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Introduce un número");
		
		BufferedReader entrada_numero=new BufferedReader (new InputStreamReader (System.in));
		
		String texto=entrada_numero.readLine();
		
		int valor=Integer.parseInt(texto);
		
		int valor_total=valor*10;
		
		System.out.println(valor + " x 10 = " + valor_total);
		

	}

}

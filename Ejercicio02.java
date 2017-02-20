package actividad01;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// PUNTO 4 Datos simples
		
		//Dato de tipo 'byte'
		byte dato_byte=1;
		
		System.out.println("Byte es un dato que representa datos enteros. Su rango va desde el -128 al 127. Se utilizan 8 bits para almacenar el dato."
				+ " El valor de la variable es " + dato_byte);
				
		//Dato de tipo 'short'
		short dato_short=30000;
		
		System.out.println("Short es un dato que representa datos enteros. Su rango va desde el -32768 al 32767. Se utilizan 16 bits para almacenar el dato."
				+ " El valor de la variable es " + dato_short);
		
		//Dato de tipo 'int'
		int dato_int=2000000;
		
		System.out.println("Int es un dato que representa datos enteros. Su rango va desde el -2147483648 al 2147483647. Se utilizan 32 bits para almacenar el dato."
				+ " El valor de la variable es " + dato_int);
		
		//Dato de tipo 'long'
		long dato_long=90000000000000L;
		
		System.out.println("Long es un dato que representa datos enteros. Su rango va desde el -9223372036854775808 al 9223372036854775807. Se utilizan 64 bits para almacenar el dato. Usa el prefijo L."
				+ " El valor de la variable es " + dato_long);
		
		//Dato de tipo 'char'
		char dato_char='c';
		
		System.out.println("Char es un dato que representa datos enteros y caracteres. Su rango va desde el 0 al 65535."
				+ " El valor de la variable es " + dato_char);
		
		//Dato de tipo 'float'
		float dato_float=2.525F;
		
		System.out.println("Float es un dato que representa datos decimales (coma flotante). Puede contener 7 digitos. Se utilizan 32 bits en formato IEEE."
				+ " El valor de la variable es " + dato_float);
		
		//Dato de tipo 'double'
		double dato_double=4.4645744574;
		
		System.out.println("Double es un dato que representa datos decimales (coma flotante). Puede contener 16 digitos. Se utilizan 64 bits en formato IEEE."
				+ " El valor de la variable es " + dato_double);
		
		//Dato de tipo 'boolean'
		boolean dato_boolean=true;
		
		System.out.println("Boolean es un dato que representa valores booleanos (verdadero o falso). Puede contener true o false."
				+ " El valor de la variable es " + dato_boolean);
		
		
		
		
		
		
		
		
		
		//PUNTO 5 Operadores aritméticos, relacionales, lógicos, unitarios y de asignación
		
		System.out.println("Aritméticos");
		
		//ARITMÉTICOS
		//El operador aritmético '+' se utiliza para sumar
		int e=4;
		int b=2;
		int sum=e+b;
		System.out.println(e + " + " + b + " = " + sum);
		
		//El operador aritmético '-' se utiliza para restar
		int res=e-b;
		System.out.println(e + " - " + b + " = " + res);
		
		//El operador aritmético '*' se utiliza para multiplicar
		int mult=e*b;
		System.out.println(e + " * " + b + " = " + mult);
				
		//El operador aritmético '/' se utiliza para dividir
		int div=e/b;
		System.out.println(e + " / " + b + " = " + div);
				
		//El operador aritmético '%' se utiliza para conseguir el módulo o resto de una división entera
		int porcent=e%b;
		System.out.println(e + " % " + b + " = " + porcent);
		
		System.out.println("Relacionales");
		
		//RELACIONALES
		//El operador relacional '<' se utiliza para indicar si un número es menor que otro
		int a=10;
		int d=15;
		boolean menor=a<d;
		System.out.println(a + " < " + d + " = " + menor);
		
		//El operador relacional '>' se utiliza para indicar si un número es mayor que otro
		boolean mayor=a>d;
		System.out.println(a + " > " + d + " = " + mayor);
				
		//El operador relacional '<=' se utiliza para indicar si un número es menor o igual que otro
		boolean menorigual=a<=d;
		System.out.println(a + " <= " + d + " = " + menorigual);
				
		//El operador relacional '>=' se utiliza para indicar si un número es mayor o igual que otro
		boolean mayorigual=a>=d;
		System.out.println(a + " >= " + d + " = " + mayorigual);
				
		//El operador relacional '!=' se utiliza para indicar si un número es distinto que otro
		boolean distinto=a!=d;
		System.out.println(a + " != " + d + " = " + distinto);
				
		//El operador relacional '==' se utiliza para indicar si un número es igual que otro
		boolean igual=a==d;
		System.out.println(a + " == " + d + " = " + igual);
		
		
		System.out.println("Lógicos");
		
		//LÓGICOS
		//El operador lógico '&& o &' dará como resultado true si ambos operandos son true y false en caso contrario
		int x=2;
		int y=5;
		boolean and=x>y && x>=y;
		System.out.println(x + " > " + y + " && " + x + " >= " + y + " = " + and);
		
		//El operador lógico '|| o |' dará como resultado false si ambos operandos son false y true en caso contrario
		boolean or=! (x<y || x != y);
		System.out.println("(" + x + " < " + y + " || " + x + " != " + y + ")" + " = " + or);
		
		//El operador lógico '!' vuelve el operando false si es true y true si es false
		boolean contrario=true;
		contrario=!contrario;
		System.out.println("True = " + contrario);
		
		//El operador lógico '^' vuelve el resultado true si un operando es true y el otro false, y false en caso contrario
		boolean contrariodoble=true;
		boolean contrariodoble2=false;
		boolean resultadocd=contrariodoble^contrariodoble2;
		System.out.println("True + False = " + resultadocd);
		
		
		
		System.out.println("Asignación");
		
		//ASIGNACIÓN
		//El operador de asignación '*=' se utiliza para multiplicar el primer número por el segundo
		int h=2;
		h*=5;
		System.out.println(h);
		
		//El operador de asignación '/=' se utiliza para dividir el primer número entre el segundo
		int j=2;
		j/=5;
		System.out.println(j);
		
		//El operador de asignación '%=' se utiliza para dividir el primer número entre el segundo y obtener el módulo o resto
		int k=2;
		k%=5;
		System.out.println(k);
				
		//El operador de asignación '+=' se utiliza para sumar el primer número al segundo
		int f=2;
		f+=5;
		System.out.println(f);
				
		//El operador de asignación '-=' se utiliza para restar el primer número al segundo
		int g=2;
		g-=5;
		System.out.println(g);
		
		
		System.out.println("Unitarios");
		
		//UNITARIOS
		//El operador unitario '~' se utiliza como complemento a 1 de la variable
		int r=4;
		int s=~r;
		System.out.println(s);
		
		//El operador unitario '-' se utiliza para cambiar el signo del operando
		int i=-r;
		System.out.println(i);
				
		//El operador unitario '--' se utiliza para decrementar el operando
		r--;
		System.out.println(r);
				
		//El operador unitario '++' se utiliza para incrementar el operando
		r++;
		System.out.println(r);	
				

		
				

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}

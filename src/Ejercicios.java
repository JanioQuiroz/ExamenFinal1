import java.util.Scanner;


//Implementar las funciones
//Sugerencia: pueden usar la funcion main para probar sus funciones pero no es necesario
//Recuerden que pueden:
//"devolver" valores con el "return"
//"Imprimir" valores con el "System.out.print"
//"Pedir" valores con el "Scanner"

public class Ejercicios
{
	//devuelve x multiplicado por 2 (1pt)
	// solo creamos la variable x y lo multiplicamos por 2
	static int multiplicarPorDos(int x)
	{
		return x * 2 ;
	}
	
	//devuelve el numero mayor entre a, b, c y d (2pts)
	
	static int getMayor(int a, int b, int c, int d) 
	//ejercicio ya que lo colamos con int lo que aplicamos en los ejercicios de la tarea
	//https://github.com/MikeSabillon/Examen1/blob/master/PrograExamenMiguel/src/Ejercicios.java
	{
		if(a > b && a > c && a > d)
		{
			System.out.println(a + " es el numero mayor");
			return a;
		}
		else if(b > a && b > c && b > d)
		{
			System.out.println(b + " es el numero mayor");
			return b;
		}
		else if(c > a && c > b && c > d) // similar al ejercicio de tarea ya que creamos todas las variables
		{
			System.out.println(c + " es el numero mayor");
			return c;
		}
		else if(d > a && d > b && d > c)
		{
			System.out.println(d + " es el numero mayor");
			return d;
		}
		else
		{
			System.out.println("Resultado: "+ a +" (Todos los numeros son iguales!)"); // creamos al final 
			return a;
		}
	}
		
	
	//Pide 2 nombres de personas.
	//Si los nombres son iguales imprime "Tocayos" de lo contrario imprime "No son tocayos". (2pts)
	{ 
	Scanner s = new Scanner(System.in); //creamos las 2 string para que se pueda ingresar ya que son texto 
		String nom1;
		String nom2;
		System.out.println("ingrese Nombre: ");
           nom1=s.next();
           System.out.println("ingrese otro nombre: ");  //pedimos que ingrese la segunda variable
           nom2=s.next();
           {
        	   if(nom1.equals(nom2 ))
        	   {
        		   
           
        		System.out.println("son tocayos ");
        	   
        	   }else 
        	   {
        		   System.out.println("no son tocayos ");
        	   }
           }
	}

	
	
	//Imprime 100 numeros que sean multiplos de 5(3pts)
	
	void imprimirMultiplosDe5() //ayuda de este link https://github.com/MikeSabillon/Examen1/blob/master/PrograExamenMiguel/src/Ejercicios.java
	{
		for(int a = 1; a < 101 ; a++)
		{
			System.out.println("Multiplos de 5");
			System.out.println( 5 + " * " + a + " = " + 5*a);
		}
	}
	
	//Devuelve true si edad es menor o igual a 25 y promedio mayor o igual a 85 (3pts)

	
	boolean aplicaBeca(int edad, int promedio)
	{
		
	if( edad >= 25 && promedio >= 85)
	{
	return true;
	}
	return false;
		}
	
		
	//Pide 4 numeros, si todos son pares devuelve true, de lo contrario devuelve false (4puntos)
	
	
	
	//Pueden probar sus funciones en el main pero no es necesario ni será evaluado
	public static void main(String args[])
	{

			
		
	}
}

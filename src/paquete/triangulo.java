package paquete;
import java.io.*;

public class triangulo {
	
	private int a,b,c;
	
	public triangulo(String path)
	{
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      int flag=0;
	      
	      System.out.println("Gente vaga nomas");

	      try {
	         archivo = new File (path);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         String linea;
	         if((linea=br.readLine())!=null)
	         {
	        	 String[] datos = new String[3];

	        		 datos=linea.split(" ");
	        		 this.a=Integer.parseInt(datos[0]);
	        		 this.b=Integer.parseInt(datos[1]);
	        		 this.c=Integer.parseInt(datos[2]);
	         }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	         System.out.println("error en el archivo");
	         flag++;
	      }finally{
	         try{                    
	            if( null != fr ){   
	               fr.close(); 
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	         if(flag>0)
	        	 System.exit(0);
	      }
	}

	public void determinarTriangulo()
	{
		if(a>=b+c || b>=a+c || c>=a+b){
			System.out.println("No se puedo formar el TRIANGULO");
			return;
		}
		
		if(a==b && b==c){
			System.out.println("TRIANGULO EQUILATERO");
			return;
		}
		if(a==b || b==c || c==a){
			System.out.println("TRIANGULO ISOSELES");
			return;
		}
		System.out.println("TRIANGULO ESCALENO");
		
	}
	public static void main(String[] args) {
		triangulo tri = new triangulo("C:/Users/Esteban/workspace/Triangulo/src/paquete/in");
		tri.determinarTriangulo();
	}

}

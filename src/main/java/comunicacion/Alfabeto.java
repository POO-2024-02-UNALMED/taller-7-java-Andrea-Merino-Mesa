package comunicacion;

public class Alfabeto extends Pictograma{

	private static String [] letras ;
	private String interpretacion;
	
	public Alfabeto(String origen,String [] let,String inter) {
		super(origen);
		letras=let;
		interpretacion=inter;
	}

	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	//public int interpretacion() {
		//return 1;
	//}

	public String toString() {
		String st=null;
		for(int i=0 ;i <letras.length; i++) {
			if(i==0) {
				st = letras[i] + ", ";
			}
			else{if (i==letras.length-1) {st += letras[i];}
			else{st += letras[i] + ", ";}}
		}
		return st;
	}
	
	public void setinterpretacion(String inter){
		interpretacion=inter;
	}
	
	public  String[] getletras(){
		return letras;
	}
	
}
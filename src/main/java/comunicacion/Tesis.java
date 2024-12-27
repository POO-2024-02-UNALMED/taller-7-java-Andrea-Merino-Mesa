package comunicacion;

public class Tesis extends Escrito{
	
	private String idea;
	private static String [] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis (String origen, String titulo, String autor, int paginas, String idea,String [] args, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea= idea;
		argumentos=args;
		this.conclusion=conclusion;
		this.referencias=referencias;
		this.interpretacion=interpretacion;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return 5*palabrasPagina*getPaginas();
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+this.idea+"\n"+argumentos.length+"\n"+this.conclusion+"\n"+this.referencias;
	}
	
	public String getIdea(){
		return idea;
	}
	public void setIdea(String id){
		idea=id;
	}
	public String [] getArgumentos(){
		return argumentos;
	}
	public void setArgumentos(String [] args){
		argumentos=args;
	}
	public String getConclusion(){
		return conclusion;
	}
	public void setConclusion(String con){
		conclusion=con;
	}
	public String getReferencias(){
		return referencias;
	}
	public void setReferencias(String ref){
		referencias=ref;
	}
	public void setInterpretacion(String inter){
		interpretacion=inter;
	}
	
}
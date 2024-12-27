package comunicacion;

public class Fabula extends Escrito{

	private String ensenanzas;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ens, String inter) {
		super(origen, titulo, autor, paginas);
		this.ensenanzas= ens;
		this.interpretacion=inter;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*getPaginas();
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+this.ensenanzas;
	}
	
	public String getEnsenanza(){
		return ensenanzas;
	}
	public void setEnsenanza(String ens){
		ensenanzas=ens;
	}
	public void setInterpretacion(String inter){
		interpretacion=inter;
	}
}
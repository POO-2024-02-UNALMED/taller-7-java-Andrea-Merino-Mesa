package comunicacion;

public class Periodico extends Escrito{

	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha,String primicia,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha= fecha;
		this.primicia=primicia;
		this.interpretacion=interpretacion;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return 10*palabrasPagina*getPaginas();
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+this.fecha+"\n"+this.primicia;
	}
	
	public String getFecha(){
		return fecha;
	}
	public void setFecha(String fe){
		fecha=fe;
	}
	
	public String getPrimicia(){
		return primicia;
	}
	public void setPrimicia(String pri){
		primicia=pri;
	}

	public void setInterpretacion(String inter){
		interpretacion=inter;
	}
}
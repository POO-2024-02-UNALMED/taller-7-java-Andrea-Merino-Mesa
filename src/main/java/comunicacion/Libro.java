package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String coa, String ed, String edc, String inter) {
		super(origen, titulo, autor, paginas);
		this.co_autor= coa;
		this.editorial=ed;
		this.edicion=edc;
		this.interpretacion=inter;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return 2*palabrasPagina*getPaginas();
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+this.co_autor+"\n"+this.editorial+"\n"+this.edicion;
	}
	public String getCo_autor(){
		return co_autor;
	}
	public void setCo_autor(String coa){
		co_autor=coa;
	}
	public String getEditorial(){
		return editorial;
	}
	public void setEditorial(String edl){
		editorial=edl;
	}
	public String getEdicion(){
		return edicion;
	}
	public void setEdicion(String ed){
		edicion=ed;
	}
	public void setInterpretacion(String inter){
		interpretacion=inter;
	}
}
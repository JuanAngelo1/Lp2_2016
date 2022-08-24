import java.util.Date;

public class Profesor extends MiembroPUCP{
	
	private String codigo;
	private EstadoProfesor estado;
	
	public Profesor(String nombre,Date fechaNacimiento,String codigo,EstadoProfesor estado){
		
			super(nombre,fechaNacimiento);
			this.codigo=codigo;
			this.estado=estado;
	}
	
	public String mostrarDatos(){
		
		String reporte=" ";
		
		reporte="Profesor : "+codigo+" - "+getNombre()+" - "+estado;
		
		return reporte;
		
	}

}
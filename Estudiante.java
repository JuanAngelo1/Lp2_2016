import java.util.Date;

public class Estudiante extends MiembroPUCP{
 
	private String codigo;
	private float CRAEST;
	
	public Estudiante (String nombre,Date fechaNacimiento,String codigo,float CRAEST){

		super(nombre,fechaNacimiento);
		this.codigo=codigo;
		this.CRAEST=CRAEST;
	}
	
	public String mostrarDatos(){
		String reporte=" ";
		
		reporte="Alumno :"+codigo+"-"+getNombre()+"-"+CRAEST;
		return reporte;
	}
	
}
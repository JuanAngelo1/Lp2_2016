import java.util.Date;

public abstract class MiembroPUCP extends Miembro implements Consultable{
	
	public MiembroPUCP (String nombre,Date fechaNacimiento){
		
		super(nombre,fechaNacimiento);
	}
	
	//metodo Abastracto porque las clase Estudiante y Profesor van
	//a implementar el mostrar Datos.
	public abstract String mostrarDatos();
}
import java.util.Date;

public abstract class Miembro{
	
	public static int correlativo=1;
	private String nombre;
	private Date fechaNacimiento;
	private String direccion;
	private String email;
	private char sexo;
	
	private int id;
	
	
	public Miembro(String nombre,Date fechaNacimiento){
		
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.id=correlativo;
		correlativo++;
	
	}
	
	//Como en la impresion vamos a necesitar el nombre 
	//Hacemos su get y set
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	
	
}
import java.util.ArrayList;

public class Equipo{
	
	private String nombre;
	private String interes;
	
	private ArrayList<Miembro> miembros;
	
	//Constructor de la clase Equipo
	
	public Equipo(String nombre,String interes){
		
		this.nombre=nombre;
		this.interes=interes;
		
	}
	
	//Setea el arreglo de miembros
	public void setMiembros(ArrayList<Miembro> miembros){
		this.miembros=miembros;
	}
	
	//Getea el arreglo de Miembros
	
	public ArrayList<Miembro> getMiembros(){
		return miembros;
	}
	
	public String ConsultarMiembrosPUCP(){
		String reporte=" ";
		
		for(int i=0;i<miembros.size();i++){
			
			if(miembros.get(i) instanceof MiembroPUCP)
				reporte+=((MiembroPUCP)miembros.get(i)).mostrarDatos()+"\n";
			
		}
		
		return reporte;
	}
	
	
}
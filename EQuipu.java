import java.util.ArrayList;


public class EQuipu{
		
	private ArrayList<Equipo> equipos;

	//Retorna el arreglo de equipos
	public ArrayList<Equipo> getEquipos(){
		return equipos;
	}	

	//Setea el arreglo de equipos
	public void setEquipo(ArrayList <Equipo> equipos){
		this.equipos=equipos;
	}
	
	//Funcion que consulta los datos de los miembros PUCP
	public String ConsultarMiembrosDeEquipo(int indice){
		String reporte= equipos.get(indice).ConsultarMiembrosPUCP();

		return reporte;
			
	}
		
}
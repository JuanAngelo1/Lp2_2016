import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Principal{

	public static void main(String[] args) throws Exception{
		
		//Crear Objeto Simple Date Format
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		
		//Crea una Instancia en EQuipu
		
		EQuipu objEquipu=new EQuipu();
		
		
		//Crear Equipo
		
		Equipo objEquipo=new Equipo("HCI-DUXAIT","Area de Interaccion Humano-Computador");
		
		
		//Creamos 2 Alumnos
		
		Estudiante alumno1=new Estudiante("Juan Perez",sdf.parse("17-03-1991"),"20090606",63.5F);
		
		Estudiante alumno2=new Estudiante("Adriana Rojas",sdf.parse("19-05-2002"),"20196493",70.4F);
		
		
		//Creamos Profesor
		
		Profesor profe1=new Profesor("Andrea Montenegro",sdf.parse("06-12-1987"),"46891", EstadoProfesor.TC);
		
	
		//añadir al equipo los profes y alumno
		
		objEquipo.setMiembros(new ArrayList<>());
		
		objEquipo.getMiembros().add(alumno1);
		objEquipo.getMiembros().add(alumno2);
		objEquipo.getMiembros().add(profe1);
		
		//añadir al EQuipu el equipo formado
		
		objEquipu.setEquipo(new ArrayList<>());
		objEquipu.getEquipos().add(objEquipo);
		
		
		String reporte=objEquipu.ConsultarMiembrosDeEquipo(0);
		
		System.out.println(reporte);
	}
}
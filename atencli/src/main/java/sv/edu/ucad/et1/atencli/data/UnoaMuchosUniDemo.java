package sv.edu.ucad.et1.atencli.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.atencli.data.entities.Alumnos;
import sv.edu.ucad.et1.atencli.data.entities.Carrera;

public class UnoaMuchosUniDemo {
	public static void main(String[] args){
		Session sesion = hibernateUtil.getSessionFactory().openSession();
		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
			
			
			Carrera car = createNuevaCar();
			car.getAlumnos().add(createNuevaAlunu());
			car.getAlumnos().add(createNuevaAluant());
				
			sesion.save(car);
			
			transaccion.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			hibernateUtil.getSessionFactory().close();
		}
	}//fin del metodo main
	
	private static Carrera createNuevaCar(){
		Carrera car = new Carrera();
		car.setNomcar("Comunicacion");
		return car;
	}//fin de createNuevaCar
	
	private static Alumnos createNuevaAlunu(){
		Alumnos alunu = new Alumnos();
		alunu.setNomalu("Berta");
		alunu.setApealu("Dominguez");
		alunu.setCarnetalu("BD12016");
		alunu.setCicloalu("V");
		alunu.setCuealu("Be10");
		alunu.setClavealu("domi011");
		return alunu;
	}//fin de createNuevaAlunu
	
	private static Alumnos createNuevaAluant(){
		Alumnos aluant = new Alumnos();
		aluant.setNomalu("xochil");
		aluant.setApealu("Juarez");
		aluant.setCarnetalu("JZ12015");
		aluant.setCicloalu("X");
		aluant.setCuealu("XJuarez");
		aluant.setClavealu("zoo");
		return aluant;
	}//fin de createNuevaAluant
	
}//fin de clase ppal

package sv.edu.ucad.et1.atencli.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.atencli.data.entities.Alumnos;

public class DemoAlumnosPersistence {
	public static void main(String[] args){
		Session sesion = hibernateUtil.getSessionFactory().openSession();
		
		Alumnos alu = createNuevaAlu();
		
		System.out.println(sesion.contains(alu));
		

		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
			sesion.save(alu);
			
			System.out.println(sesion.contains(alu));
		
			transaccion.commit();	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			sesion.close();
			hibernateUtil.getSessionFactory().close();
		}	
	}

	private static Alumnos createNuevaAlu(){
		Alumnos alu = new Alumnos();
		alu.setNomalu("Will");
		alu.setApealu("Velasquez");
		alu.setCarnetalu("CV12004");
		alu.setCicloalu("III");
		alu.setCuealu("Wil10");
		alu.setClavealu("Zv5s");
		return alu;
	}	
}

package sv.edu.ucad.et1.atencli.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.atencli.data.entities.Carrera;

public class DemoCarreraPersistence {
	public static void main(String[] args){
		Session sesion = hibernateUtil.getSessionFactory().openSession();
		
		Carrera car = createNuevaCarrera();
		
		System.out.println(sesion.contains(car));

		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
			sesion.save(car);
			System.out.println(sesion.contains(car));
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

	private static Carrera createNuevaCarrera(){
		Carrera car = new Carrera();
		car.setNomcar("Admin");
		return car;
	}	
}

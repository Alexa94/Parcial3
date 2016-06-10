package sv.edu.ucad.et1.atencli.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.atencli.data.entities.Autor;

public class DemoAutorPersistence {
	public static void main(String[] args){
		Session sesion = hibernateUtil.getSessionFactory().openSession();
		
		Autor bibli = createNewAutor();
		
		System.out.println(sesion.contains(bibli));

		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
			sesion.save(bibli);
			System.out.println(sesion.contains(bibli));
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

	private static Autor createNewAutor() {
		Autor nautor = new Autor();
		nautor.setNomaut("Miguel");
		nautor.setApeaut("Espino");
		nautor.setNacaut("Salvadoreño");
		return nautor;
	}
}

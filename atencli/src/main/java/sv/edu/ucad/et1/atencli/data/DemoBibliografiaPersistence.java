package sv.edu.ucad.et1.atencli.data;

import java.util.Date;
import org.hibernate.Session;
import sv.edu.ucad.et1.atencli.data.entities.Bibliografia;

public class DemoBibliografiaPersistence {
	public static void main(String[] args){
		Session sesion = hibernateUtil.getSessionFactory().openSession();
		
		Bibliografia biblio = createNewBibliografia();
		
		System.out.println(sesion.contains(biblio));

		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
			sesion.save(biblio);
			System.out.println(sesion.contains(biblio));
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

	private static Bibliografia createNewBibliografia() {
		Bibliografia biblio = new Bibliografia();
		biblio.setLugimbiblio("El Salvador");
		biblio.setFecimbiblio(new Date());
		return biblio;
	}
}

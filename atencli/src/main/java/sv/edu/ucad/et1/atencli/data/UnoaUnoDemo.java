package sv.edu.ucad.et1.atencli.data;

import java.util.Date;
import org.hibernate.Session;

import sv.edu.ucad.et1.atencli.data.entities.Autor;
import sv.edu.ucad.et1.atencli.data.entities.Bibliografia;

public class UnoaUnoDemo {
	public static void main(String[] args){
		Session sesion = hibernateUtil.getSessionFactory().openSession();
		
//Inicio de la transaccion
		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
		
			Autor bibli = createNewAutor();
			Bibliografia carri = createNewBibliografia(bibli);

			sesion.save(carri);
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


	private static Bibliografia createNewBibliografia(Autor auto) {
		Bibliografia nbiblio = new Bibliografia();
		nbiblio.setLugimbiblio("Brasil");
		nbiblio.setFecimbiblio(new Date());
		nbiblio.setApa(auto);
		return nbiblio;
	}
	

	private static Autor createNewAutor() {
		Autor nautor = new Autor();
		nautor.setNomaut("Pedro");
		nautor.setApeaut("Abarca");
		nautor.setNacaut("Brasileño");
		return nautor;
	}
}

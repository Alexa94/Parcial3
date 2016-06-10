package sv.edu.ucad.et1.atencli.data;
import java.util.Date;
import org.hibernate.Session;

import sv.edu.ucad.et1.atencli.data.entities.Utiles;
import sv.edu.ucad.et1.atencli.data.entities.Prestamos;

public class UnoaUnoUniLucy {
	public static void main(String[] args){
		Session sesion = hibernateUtil.getSessionFactory().openSession();
		
			try{
				org.hibernate.Transaction transaccion = sesion.beginTransaction();
			
				Utiles util = createNewUtiles();
				Prestamos pre = createNewPrestamos(util);

				sesion.save(pre);
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
	

		private static Prestamos createNewPrestamos(Utiles util) {
			Prestamos pre = new Prestamos();
			pre.setFepre(new Date());
			pre.setFedev(new Date());
			pre.setFemaxpre(new Date());
			pre.setUtil(util);
			return pre;
		}
	
		private static Utiles createNewUtiles() {
			Utiles util = new Utiles();
			util.setNomutil("Calculadora");
			return util;
		}
	}
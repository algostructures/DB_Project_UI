package Hibernate; /**
 *
 * @author ADMIN
 */
import java.util.List;
import java.util.Iterator;
import entities.Service;
 
import org.hibernate.HibernateException; 
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLManageService {
   private static SessionFactory factory;
   public static void preLoad(){
       try{
           //step 1: Create Session Factory
           factory = new Configuration().configure().buildSessionFactory();
       }catch (Throwable ex) {
           System.err.println("Failed to create sessionFactory object." + ex);
           throw new ExceptionInInitializerError(ex);
       }
   }
   /*public static void main(String[] args) {
      try{
          //step 1: Create Session Factory
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      HQLManageService ME = new HQLManageService();

      ME.listServiceVehicleFull();
   }*/


   /* HQL example to retrieve, when more than one field is selected */

   
   /* HQL example to retrieve, when more than one field is selected */
   public List listServiceVehicleFull( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();

         Query qry = session.createQuery("FROM Service");

          List vehicles = qry.list();

         tx.commit();
         return vehicles;
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace();
      }finally {
         session.close(); 
      }
      return null;
   }
   public void addServiceVehicle(String v, String ow,int o) {
       Session session = factory.openSession();
       Transaction tx = null;

       tx = session.beginTransaction();
       Service sc = new Service();
       sc.setOdometer(o);
       sc.setOwner(ow);
       sc.setVehicleModel(v);
       session.save(sc);
       session.close();
   }
}

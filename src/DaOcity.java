import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author umair
 */
public class DaOcity {

    public void save(GeoCity city) {
        // Get session factory and open a new session
        SessionFactory factory = Hibernate.getSessionFactory();
        // Begin transaction
        try  {
            Session session = factory.openSession();
            // Begin transaction
            Transaction t = session.beginTransaction();
            // Persist city and commit changes
            session.persist(city);
            t.commit();
            // Close the session
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}

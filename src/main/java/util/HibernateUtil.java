package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2017/5/23.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory1;
    private static Transaction transaction;
    private static Session session;


    /**
     * 开启一个会话
     * @param sessionFactory
     * @return
     */
    public static Session openSession(SessionFactory sessionFactory) {
        sessionFactory1=sessionFactory;
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        return session;
}




    public static void closeSession() {
        if (transaction != null) {
            transaction.commit();
        }
        if (session != null) {
            session.close();
        }
        if (sessionFactory1 != null) {
            sessionFactory1.close();
        }
    }

}

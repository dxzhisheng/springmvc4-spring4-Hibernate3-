package dao.impl;

import bean.StudentBean;
import dao.StudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import util.HibernateUtil;

/**
 * Created by Administrator on 2017/8/22.
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void insertStu(StudentBean studentBean) {
        Session session = HibernateUtil.openSession(sessionFactory);

        session.save(studentBean);

        HibernateUtil.closeSession();

    }
}

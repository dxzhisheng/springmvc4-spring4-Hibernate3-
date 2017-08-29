package service.impl;

import bean.StudentBean;
import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import service.StudentService;

/**
 * Created by Administrator on 2017/8/22.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void addStu(StudentBean studentBean) {
        studentDao.insertStu(studentBean);
    }
}

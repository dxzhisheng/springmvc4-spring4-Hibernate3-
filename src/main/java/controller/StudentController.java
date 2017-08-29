package controller;

import bean.StudentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.StudentService;

/**
 * Created by Administrator on 2017/8/22.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {



        this.studentService = studentService;
    }


    @RequestMapping(value = "/addStu.html")
    public String addStu(){
        StudentBean studentBean=new StudentBean(1,"sdongwan",22);
        studentService.addStu(studentBean);

        return "result";
    }
}

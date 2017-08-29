package service;

import bean.StudentBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/8/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)
//加载配置文件
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:springmvc_servlet.xml"})
public class StudentServiceTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private StudentService studentService;

    @Test
    public void testAddStu() {
        StudentBean studentBean = new StudentBean(2, "bcy", 21);
        studentService.addStu(studentBean);

    }

}

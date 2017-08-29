package bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/22.
 */
public class StudentBean implements Serializable {
    private Integer sId;
    private String sName;
    private Integer sAge;

    public StudentBean() {
    }

    public StudentBean(Integer sId, String sName, Integer sAge) {
        this.sId = sId;
        this.sName = sName;
        this.sAge = sAge;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                '}';
    }
}

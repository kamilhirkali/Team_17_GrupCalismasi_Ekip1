package Kamil.Projects.OgrenciNotSistemi;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
   /* fields : name,mpno,branch
    Methods : Teacher()*/
   private String name;
   private String mpno;
   private String branch;


   public Teacher(String name, String mpno, String branch) {

                 setName(name);
                 setMpno(mpno);
                 setBranch(branch);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMpno() {
        return mpno;
    }

    public void setMpno(String mpno) {
        this.mpno = mpno;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "[" +
                 name +  " ==> "+
                 branch  +
                "]";
    }
}




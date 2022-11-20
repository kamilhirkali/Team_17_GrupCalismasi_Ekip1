package Kamil.Projects.OgrenciNotSistemi;

import java.util.ArrayList;
import java.util.List;

public class Course extends Runner {
   /* fields (variable) : name,code,prefix,note,Teacher
    Methods : Course() , addTeacher() , printTeacher()*/
   private String name;
   private int code;
   private String teacher;
   private int prefix,note;
   private List<Teacher>ogretmenler=new ArrayList<>();


    public Course(String name, int code, String teacher, int prefix, int note) {
        this.name = name;
        this.code = code;
        this.teacher = teacher;
        this.ogretmenler = ogretmenler;
        setPrefix(prefix);
        setNote(note);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void addTeacher(Teacher a){
       ogretmenler.add(a);
    }

   public void printTeacher(){
       for(Teacher w:ogretmenler){
           System.out.println(w);
       }
   }
}

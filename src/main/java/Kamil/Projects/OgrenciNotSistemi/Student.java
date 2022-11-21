package Kamil.Projects.OgrenciNotSistemi;

public class Student{
   /* fields : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()*/
private String name,stuNo,classes,course1,course2,course3;
private double avarage;
private boolean isPass;

   public Student(String name, String stuNo, String classes, String course1, String course2, String course3, double avarage, boolean isPass) {
      this.name = name;
      this.stuNo = stuNo;
      this.classes = classes;
      this.course1 = course1;
      this.course2 = course2;
      this.course3 = course3;
      this.avarage = avarage;
      setPass(isPass);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getStuNo() {
      return stuNo;
   }

   public void setStuNo(String stuNo) {
      this.stuNo = stuNo;
   }

   public String getClasses() {
      return classes;
   }

   public void setClasses(String classes) {
      this.classes = classes;
   }

   public String getCourse1() {
      return course1;
   }

   public void setCourse1(String course1) {
      this.course1 = course1;
   }

   public String getCourse2() {
      return course2;
   }

   public void setCourse2(String course2) {
      this.course2 = course2;
   }

   public String getCourse3() {
      return course3;
   }

   public void setCourse3(String course3) {
      this.course3 = course3;
   }

   public double getAvarage() {
      return avarage;
   }

   public void setAvarage(double avarage) {
      this.avarage = avarage;
   }

   public boolean isPass() {
      return isPass;
   }

   public void setPass(boolean pass) {
      isPass = pass;
   }
/* addBulkExamNote();
    isPass();
    calcAvarage();
    printNote();*/



   public double calcAvarage(int prefix, int note, int sozluYuzdesi,String dersAdi) {
      int yaziliYuzdesi=100-sozluYuzdesi;
      avarage=(prefix*sozluYuzdesi/100)+(note*yaziliYuzdesi/100);
      System.out.println(dersAdi+" dersinin ortalamasi ="+avarage);

      return avarage;
   }

   public void printNote(double ort) {

      System.out.println("Derslerin genel ortalamasi ="+ort);

      if (isPass){
         System.out.println("Ogrenci sinifi gecti");
      }else{
         System.out.println("Ogrenci sinifta kaldi");
      }



   }

}

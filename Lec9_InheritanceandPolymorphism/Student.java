
package Lec9_InheritanceandPolymorphism;

public class Student {
  private  String id;
  private float gpa;

    public Student(String id, float gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}

public class Student{
    public String first;
    public String last;
    public int grade;
    public int age;
    
    public Student(){
        first = null;
        last = null;
        grade = 0;
        age = 0;
    }
    
    public Student(String f, String l, int g, int a){
        first = f;
        last = l;
        grade = g;
        age = a;
    }
    
    public String toString(){
        return first + " " + last + " is " + age  + " years old and is in Grade " + grade;
    }
}
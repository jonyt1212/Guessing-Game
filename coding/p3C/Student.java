public class Student{
    public String first;
    public String last;
    public int grade;
    public int age;
    public double grades[];
    
    public Student(){
        first = null;
        last = null;
        //grade = 0;
        //age = 0;
        grades = new double[] {0, 0, 0, 0, 0};
    }
    
    public Student(String f, String l, /*int g, int a,*/ double eng, double math, double sci, double art, double socsci){
        first = f;
        last = l;
        // = g;
        //age = a;
        grades = new double[] {eng, math, sci, art, socsci};
    }
    
    public double calcGPA(){
        double sum = 0;
        for(int i=0; i<grades.length; i++){
            sum += grades[i];
        }
        return sum/grades.length;
    }
    
    public void setMathGPA(double newGPA){
        grades[1] = newGPA;
    }
    
    public double getMathGPA(){
        return grades[1];
    }
    
    public String toString(){
        return ("Student: " + first + " " + last + "\nCumulative GPA: " + calcGPA());
    }
}
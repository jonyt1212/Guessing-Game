public class StudentDriver{
    public static void main(String args[]){
        Student senior = new Student("Joe", "Senior", 3.0, 3.0, 3.5, 4.0, 4.0);
        System.out.println(senior);
        senior.setMathGPA(4.0);
        System.out.println(senior.getMathGPA());
        System.out.println(senior.calcGPA());
        System.out.println(senior);
    }
}
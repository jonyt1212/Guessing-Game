public class StudentDriver{
    public static void main(String args[]){
        Student senior = new Student("Joe", "Senior", 3.0, 3.0, 3.5, 4.0, 4.0);
        System.out.println(senior);
        senior.setEngGPA(3.5);
        senior.setMathGPA(4.5);
        senior.setSciGPA(3.8);
        senior.setArtGPA(2.6);
        senior.setSocSciGPA(1.0);
        System.out.println("\n\n"+ senior);
        
        Student freshman = new Student("Sue", "Foo", 2.0, 4.0, 1.5, 3.0, 1.0);
        System.out.println("\n\n\n" + freshman);
        freshman.setEngGPA(0.5);
        freshman.setMathGPA(2.5);
        freshman.setSciGPA(4.8);
        freshman.setArtGPA(1.6);
        freshman.setSocSciGPA(4.0);
        System.out.println("\n\n"+ freshman);
    }
}
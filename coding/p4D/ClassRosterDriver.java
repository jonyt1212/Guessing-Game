public class ClassRosterDriver{
    public static void main(String args[]){
        ClassRoster test = new ClassRoster("Science");
        for(Student obj: test.studentList){
            System.out.println(obj.calcGPA());
        }
        test.dropStudent(3);
        System.out.println("\n");
        for(Student obj: test.studentList){
            System.out.println(obj.calcGPA());
        }
        System.out.println();
        test.addStudent(new Student("Smert", "Alex", 4.0, 4.0, 4.0, 4.0, 4.0));
        for(Student obj: test.studentList){
            System.out.println(obj.first);
        }
    }
}
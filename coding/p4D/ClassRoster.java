import java.util.List;
import java.util.ArrayList;
public class ClassRoster{
    public String courseName;
    public List<Student> studentList = new ArrayList<Student>();
       
    public ClassRoster(String cN){
        courseName = cN;
        studentList.add(new Student("Bill", "Joel", 1.4, 5.0, 2.3, 1.0, 4.0));
        studentList.add(new Student("Phil", "Noel", 1.4, 1.0, 1.3, 1.0, 1.0));
        studentList.add(new Student("Till", "Powell", 2.4, 4.0, 4.3, 3.0, 2.0));
        studentList.add(new Student("Mill", "Snowel", 4.0, 4.0, 4.0, 4.0, 4.0));
        studentList.add(new Student("Will", "Moel", 4.4, 3.8, 4.3, 2.0, 3.3));
    }
    
    public String studentWithMaxGPA(){
        double prevGPA = 0;
        String student = null;
        for(Student obj: studentList){
            if(obj.calcGPA() > prevGPA){
                student = obj.last;
            }
        }
        return student;
    }
     
    public void dropStudent(int minGradeLevel){
        for(int i = 0; i<studentList.size(); i++){
            if(studentList.get(i).calcGPA() < minGradeLevel){
                studentList.remove(i);
                i--;
            }
        }
    }
    
    public void addStudent(Student newStudent){
        studentList.add(newStudent);
    }
}
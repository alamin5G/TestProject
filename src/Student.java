
public class Student {

    private int id;
    private String name;
    private String section;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Student(){

    }

    public Student(int studentId, String studentName) throws IllegalArgumentException {

        if (studentName == null){
            throw new IllegalArgumentException("Student Name Value is null");
        } 

        id = studentId;
        name = studentName;
    }

    public Student(int studentId, String studentName, String studentSection) throws IllegalArgumentException{
        
        if (studentName == null){
            throw new IllegalArgumentException("Student Name column must be filled up");
        }else if (studentSection == null){
            throw new IllegalArgumentException("Student section column must be filled up");
        }
        
        id = studentId;
        name = studentName;
        section = studentSection;
    }



}

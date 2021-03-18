public class Student {
    int age;
    String name;
    int grade;
    public Student(int a, String n, int g){
        age = a;
        name = n;
        grade = g;

    }
    public void Graduation(){
        System.out.println("You are graduating this year!!!");
    }

    public static void main(String[] args) {
        Student newStudent = new Student(17, "Ala'", 12);
        newStudent.Graduation();
    }
}

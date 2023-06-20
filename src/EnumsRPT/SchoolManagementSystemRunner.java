package EnumsRPT;

        /*Task: Write the student and teacher deletion program for school management
        Define the role for the user (ADMIN, TEACHER, STUDENT) and give permission to delete according to the role.
        student delete authorization (ADMIN,TEACHER)
        teacher delete authorization ADMIN
         */

public class SchoolManagementSystemRunner {
    public static void main (String[] args) {

        Student student = new Student("Zia");
        Teacher teacher = new Teacher("Frotan");

        User user1 = new User(Role.ADMIN);
        User user2 = new User(Role.TEACHER);
        User user3 = new User(Role.STUDENT);

        deleteStudent(student, user1);
        deleteStudent(student, user2);
        deleteStudent(student, user3);
        System.out.println("--------------------------------");
        deleteTeacher(teacher, user1);
        deleteTeacher(teacher, user2);
        deleteTeacher(teacher, user3);




    }
    public static void deleteStudent (Student student, User user ){
        if(user.getRole() == Role.TEACHER || user.getRole() ==Role.ADMIN){
            System.out.println("Student is deleted successfully by: "+user.getRole().getName());
        } else {
            System.out.println(user.getRole().getName() +"is not permitted to delete Student ");
        }
    }

    public static void deleteTeacher (Teacher teacher, User user ){
        if(user.getRole() ==Role.ADMIN){
            System.out.println("Teacher is deleted successfully by: "+user.getRole().getName());
        } else {
            System.out.println(user.getRole().getName() +"is not permitted to delete Teacher ");
        }
    }

}

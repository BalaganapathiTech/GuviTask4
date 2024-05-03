package Question1;

public class Main {
        public static void main(String[] args) {
            try {
                Student student1=new Student(1,"Balaji",20,"Java FullStack");
                System.out.println("Student created-"+student1.getName());

                Student student2=new Student(2,"Jo3n@es",20,"CS Engineering");
                System.out.println("Student2 Created-"+student2.getName());

            }catch (AgeNotWithinRangeException | NameNotValidException e){
                System.out.println("Exception Occured-"+e.getMessage());
            }
        }
    }

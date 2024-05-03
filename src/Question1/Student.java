package Question1;

public class Student {
        private int rollNo;
        private String name;
        private int age;
        private String course;

        public Student(int rollNo,String name,int age,String course) throws NameNotValidException, AgeNotWithinRangeException{
            this.rollNo=rollNo;

            if (!isValidName(name)){
                throw new NameNotValidException("Invalid Name"+name);
            }
            this.name=name;

            if (!isValidAge(age)){
                throw new AgeNotWithinRangeException("Age not within range"+age);
            }
            this.age=age;

            this.course=course;
        }
        private boolean isValidAge(int age){
            return age>=15 && age<=21;
        }
        private boolean isValidName(String name){
            return name.matches("[a-zA-Z]+");
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }
    }

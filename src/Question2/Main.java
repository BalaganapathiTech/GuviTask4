package Question2;

public class Main {

    public static void main(String[] args) {

        try {
            Voter voter1=new Voter(1353,"Balaji",1);
            System.out.println("Voter Created :"+voter1.getName());

            Voter voter2=new Voter(1232,"Sundar",23);
            System.out.println("Voter created:"+voter2.getName());
        }catch (InvalidAgeException e){
            System.out.println("Exception Occured: "+ e.getMessage());
        }
    }
}

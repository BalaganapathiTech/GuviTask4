package Question4;

import Question1.Main;

import java.util.HashMap;

public class GradeMark {

private HashMap<String,Integer> grademap;
public GradeMark(){
    this.grademap=new HashMap<>();
}
    public void addStudent(String name,Integer grade){
    grademap.put(name,grade);
    }

    public void removeStudent(String name){
    grademap.remove(name);
    }

    public void displaygrade(String name){
Integer grade=grademap.get(name);
if (grade!=null){
    System.out.println(name+"'s student grade is-"+grade);
}else {
    System.out.println(name+"is not found");
}
    }
    public void displayAll(){
    System.out.println("Student grade is-");
    for (String name: grademap.keySet()){
        System.out.println(name+":"+grademap.get(name));
    }
    }

    public static void main(String[] args) {
        GradeMark gradeMark=new GradeMark();

        gradeMark.addStudent("Balaji",85);
        gradeMark.addStudent("Kalai",97);
        gradeMark.addStudent("Jones",67);
        gradeMark.addStudent("Karthi",79);

        gradeMark.displayAll();
        gradeMark.displaygrade("Kalai");
        gradeMark.removeStudent("jones");
        gradeMark.displayAll();
    }
}
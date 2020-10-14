package sample;
public class Main{
    public static void main(String[] args) {
        Student boy = new Student(1133,"Thanaphon",'M',73);
        boy.setName("Thanaphon Sombunkaeo");

        System.out.println(boy.getName());
        System.out.println(boy.getGender());
        System.out.println(boy.calGPA());

        boy.setScore(53);
        System.out.println("After change score : ");
        System.out.println(boy.calGPA());
    }
}

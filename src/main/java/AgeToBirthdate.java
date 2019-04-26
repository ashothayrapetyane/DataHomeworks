import java.time.LocalDate;

public class AgeToBirthdate {

    private int age;

    public AgeToBirthdate(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getDate(){
        LocalDate date = LocalDate.now();


        return date.minusYears(age).getYear();
    }

    public static void main(String[] args) {
        AgeToBirthdate valod = new AgeToBirthdate(33);
        System.out.println(valod.getDate());
    }
}

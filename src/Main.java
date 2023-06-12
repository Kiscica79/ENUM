public class Main {
    public static void main(String[] args) {


        Person person  = new Person("Ildikó", Gender.WOMAN, EyeColor.BLUE, Religion.ROMAN_CATHOLIC);
        System.out.println(person.toString());
        System.out.println(person.getGender().getOlaszNev());

    }
}
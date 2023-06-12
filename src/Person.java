public class Person {

    private String name;
    private Gender gender;
    private EyeColor eyeColor = EyeColor.BLUE;
    private Religion religion;

    public Person(){}

    public Person(String name, Gender gender, EyeColor eyeColor, Religion religion) {
        this.name = name;
        this.gender = gender;
        this.eyeColor = eyeColor;
        this.religion = religion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", eyeColor=" + eyeColor +
                ", religion=" + religion +
                '}';
    }
}

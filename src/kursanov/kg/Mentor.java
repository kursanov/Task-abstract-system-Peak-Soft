package kursanov.kg;

public class Mentor {

    private String name;

    private Gender gender;

    private String email;

    private Group group;

    public Mentor(String name, Gender gender, String email, Group group) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.group = group;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith("@gmail.com")) {
            this.email = email;
        }else System.out.println("Accaunt [@gmail.com] менен аяктасын!" );
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }



    @Override
    public String toString() {
        return "Mentor{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", group=" + group +
                '}';
    }
}

package finalExamRetake01.people;

public class Man {

    // id,first_name,last_name,email,gender,ip_address

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private String ipAddresss;

    public Man(String id, String firstName, String lastName, String email, Gender gender, String ipAddresss) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.ipAddresss = ipAddresss;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public String getIpAddresss() {
        return ipAddresss;
    }
}

package ro.ianders.universitylabsterremake.datatypes;

/**
 * Created by paul.iusztin on 13.12.2017.
 */

public class Profile {
    private String firstName;
    private String lastName;
    private String email;

    public Profile() {}

    public Profile(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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
}

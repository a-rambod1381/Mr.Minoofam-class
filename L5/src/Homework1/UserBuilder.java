package Homework1;

public class UserBuilder {
    private String username;
    private String name;
    private String password;
    private String age;
    private String address;
    private String phone_number;
    private String education;

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder setPhone_Number(String phone_number) {
        this.phone_number = phone_number;
        return this;
    }

    public UserBuilder setEducation(String education) {
        this.education = education;
        return this;
    }

    /*public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getEducation() {
        return education;
    }*/

    public User createUser() {
        return new User(username, name, password, age, address, phone_number, education);
    }
}
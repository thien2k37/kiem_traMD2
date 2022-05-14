package Phonebook;

public class Phonebook {
    private String name,address,email,facebook,sex,group;
    private int bird, phoneNumber;

    public Phonebook() {
    }

    public Phonebook(String name, String address, String email, String facebook, String sex, String group, int bird, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
        this.sex = sex;
        this.group = group;
        this.bird = bird;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getBird() {
        return bird;
    }

    public void setBird(int bird) {
        this.bird = bird;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "PhoneDirectory{" + "name= " + name + ", address= " + address + ", email= " + email + ", facebook= " + facebook + ", sex= " + sex  + ", group='" + group + ", bird= " + bird + ", phoneNumber= " + phoneNumber + "}\n";
    }
}


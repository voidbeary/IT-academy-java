public class User {
    public String firstname;
    public String lastname;
    public String city;
    public String country;
    public int age;
    public String countryCode;
    public String email;
    public String userid;


    public User(String firstname, String lastname, String city, String country, int age, String countryCode, String email, String userid) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.country = country;
        this.age = age;
        this.countryCode = countryCode;
        this.email = email;
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getEmail() {
        return email;
    }

    public String getUserid() {
        return userid;
    }

    public void print() {
        System.out.println(this.getFirstname() + " " + this.getLastname() + " " + this.getCity() + " " + this.getCountry() + " " + this.getAge() + " " + this.getCountryCode() + " " + this.getEmail() + " " + this.getUserid());
    }
}

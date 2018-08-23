package com.sda.builder;

public class User {

    private String name;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    private String email;
    private String telephoneNumber;
    private Integer age;


    public static final class UserBuilder {
        private String name;
        private String lastName;
        private String address;
        private String city;
        private String postalCode;
        private String email;
        private String telephoneNumber;
        private Integer age;

        private UserBuilder() {
        }

        public static UserBuilder anUser() {
            return new UserBuilder();
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder telephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = new User();
            user.telephoneNumber = this.telephoneNumber;
            user.email = this.email;
            user.postalCode = this.postalCode;
            user.lastName = this.lastName;
            user.address = this.address;
            user.name = this.name;
            user.age = this.age;
            user.city = this.city;
            return user;
        }

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public Integer getAge() {
        return age;
    }
}

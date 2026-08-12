public class Customer {
    private String name;
    private String email;
    private Long phone;

    public Customer(String name, String email, Long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Long getPhone() {
        return this.phone;
    }


    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Email : " + this.email);
        System.out.println("Phone : " + this.phone);
    }
}

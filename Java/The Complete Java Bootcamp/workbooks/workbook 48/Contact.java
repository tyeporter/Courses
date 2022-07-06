import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be null/blank.");
        if (phoneNumber == null || phoneNumber.isBlank()) throw new IllegalArgumentException("Phone number cannot be null/blank.");
        if (phoneNumber.length() < 5) throw new IllegalArgumentException("Phone number should have 5 or more digits.");
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = this.toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be null/blank.");
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) throw new IllegalArgumentException("Phone number cannot be null/blank.");
        if (phoneNumber.length() < 5) throw new IllegalArgumentException("Phone number should have 5 or more digits.");
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        this.setAge(this.toAge(birthDate));
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public int toAge(String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime();
        return (int)(TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
            "Phone number: " + this.phoneNumber + "\n" +
            "Birth Date: " + this.birthDate + "\n" +
            "Age: " + this.age + " years old\n";
    }
}

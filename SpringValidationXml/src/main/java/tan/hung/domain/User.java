package tan.hung.domain;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;
import tan.hung.validation.Age;


import java.time.LocalDate;

@Age(message = "{custom.age.errormessage}")
public class User {
    @Size(min = 2, max = 30, message = "{abc}")
    private String name;

    @Email(message = "Email must follow the formatter:***@***")
    @NotBlank(message = "Email must have a value")
    private String email;

    @Min(value = 18, message = "must be greater or equal to 18")
    @NotNull(message = "{notnull.age}")
    private Integer age;

    @NotNull(message = "Birthday is a required field")
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate birthday;

    @NotBlank(message = "Role must have a value")
    private String role;

    private MultipartFile profileImage;

    @Valid
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public MultipartFile getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(MultipartFile profileImage) {
//        System.out.println("go setter");
        this.profileImage = profileImage;
    }
}

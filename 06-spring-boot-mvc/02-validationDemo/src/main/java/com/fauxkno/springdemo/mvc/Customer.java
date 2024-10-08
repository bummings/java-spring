package com.fauxkno.springdemo.mvc;

import com.fauxkno.springdemo.mvc.validation.CourseCode;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName = "";

    @Min(value=0, message = "must be greater than or equal to zero.")
    @Max(value = 10, message = "must be less than or equal to 10.")
    @NotNull(message = "is required")
    private Integer freePasses;
    // using the Integer type as a wrapper class because of the validation working on a "string"

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 digits plz")
    private String postalCode;

    @CourseCode
    private String courseCode;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}

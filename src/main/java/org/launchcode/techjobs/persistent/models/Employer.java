package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    //Represents list of all items in a job. Name parameter is set to employer_id.
    @OneToMany
    @JoinColumn(name="employer_id")
    private final List<Job> jobs = new ArrayList<>();
    //Limits size and ensures location field is not blank:
    @NotBlank
    @Size(min=2, max=60)
    private String location;
    //Accesses superclass constructor:
    public Employer(String location) {
        super();
        this.location = location;
    }
    //No-arg constructor:
    public Employer() {}
    //Getters and Setters:
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}


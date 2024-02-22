package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    //Added @ManyToMany annotation with the argument mappedBy="skills" to configure this mapping.
    //This initializes Job listing in Skill class.
    @ManyToMany(mappedBy = "skills")
        private List<Job> jobs = new ArrayList<>();

    @NotBlank
    @Size(min=5,max=500)
    private String description;
    public Skill(String description) {
        super();
        this.description = description;
    }
    public Skill() {}
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //Added getter and setter for skill.jobs
    public List<Job> getJobs() {
        return jobs;
    }
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}

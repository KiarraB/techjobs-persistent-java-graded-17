package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {
    //Removed redundant fields. Replaced the type of field employer to be of type Employer.
    //Refactored affected constructor and getter and setter.
    //Added @ManyToOne on the field employer.
    //Added @ManyToMany for Job.skills
    @ManyToMany
    private List<Skill> skills = new ArrayList<>();
    @ManyToOne
    private Employer employer;
    public Job() {
    }

    //Initialized the id and value fields.
    //Changed String initialization of someSkills to the newly added ManyToMany List<Skill> to map the relationship
    public Job(Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    //Getters and setters.
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    //Changed getters and setters for skills


    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}

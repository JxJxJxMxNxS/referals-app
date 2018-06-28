package com.Nearsoft.referrals.model;

import com.Nearsoft.referrals.JobDescriptionJsonConverter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "job")
public class Job implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @Convert(converter = JobDescriptionJsonConverter.class)
    private JobDescription jobDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JobDescription getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(JobDescription jobDescription) {
        this.jobDescription = jobDescription;
    }


    @Override
    public String toString() {
        return String.format("Job[id=%d, title='%s']", id, title);
    }
}
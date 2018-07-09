package com.Nearsoft.referrals.repository;

import com.Nearsoft.referrals.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends CrudRepository<Job, Long> {
    List<Job> findByTitle(String title);
}

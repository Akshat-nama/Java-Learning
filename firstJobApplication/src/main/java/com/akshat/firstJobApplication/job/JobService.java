package com.akshat.firstJobApplication.job;

import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.util.List;

public interface JobService {
    public List<Jobs> findAll();
    public void createJob(Jobs job);

    public Jobs getJobById(Long id);
    public boolean deleteJobById(Long id);

   public Jobs updateJob(Long id, Jobs updatedJobData);
}

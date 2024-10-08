package com.akshat.firstJobApplication.job.impl;

import com.akshat.firstJobApplication.job.JobRepository;
import com.akshat.firstJobApplication.job.JobService;
import com.akshat.firstJobApplication.job.Jobs;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {
    private JobRepository jobRepository;
    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Jobs> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Jobs job) {
        jobRepository.save(job);
    }

    @Override
    public Jobs getJobById(Long id) {

       return jobRepository.findById(id).orElse(null);
    }

    public boolean deleteJobById(Long id) {
        try{
            jobRepository.deleteById(id);
            return true;
        }catch  (Exception e){
            return false;
        }
    }

    @Override
    public Jobs updateJob(Long id, Jobs updatedJobData) {
        Optional<Jobs> jobsOptional = jobRepository.findById(id);

        if(jobsOptional.isPresent()){
            Jobs job = jobsOptional.get();
                job.setLocation(updatedJobData.getLocation());
                job.setTitle(updatedJobData.getTitle());
                job.setDescription(updatedJobData.getDescription());
                job.setMinSalary(updatedJobData.getMinSalary());
                job.setMaxSalary(updatedJobData.getMaxSalary());
                jobRepository.save(job);
                return updatedJobData;
        }
        return null;
    }
}

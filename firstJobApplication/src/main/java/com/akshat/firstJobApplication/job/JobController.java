package com.akshat.firstJobApplication.job;

import com.akshat.firstJobApplication.job.impl.JobServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {
    private JobServiceImpl jobServiceImpl;

    //The service annotation in the JobServiceImpl class will automatically inject the bean at the run time
    public JobController(JobServiceImpl jobServiceImpl) {
        this.jobServiceImpl = jobServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<Jobs> >findAll(){
        return new ResponseEntity<>(jobServiceImpl.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createJobs(@RequestBody Jobs job){
        jobServiceImpl.createJob(job);
        return new ResponseEntity<>("Job created successfully!!", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jobs> getJobById(@PathVariable Long id){
        Jobs job = jobServiceImpl.getJobById(id);
        if(job!=null)
            return new ResponseEntity<>(job, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long id){
        boolean deleted = jobServiceImpl.deleteJobById(id);
        if(deleted)
            return new ResponseEntity<>("Deleted Successfully!!", HttpStatus.OK);
        return new ResponseEntity<>("ID Not Found", HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Jobs> updateJob(@PathVariable Long id, @RequestBody Jobs job){
        Jobs updatedJob = jobServiceImpl.updateJob(id, job);
        if(updatedJob!=null)
            return new ResponseEntity<>(updatedJob, HttpStatus.OK);
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    }


}

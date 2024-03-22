package MuhammedFurkanDemir.Hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MuhammedFurkanDemir.Hrms.Business.Abstracts.JobService;
import MuhammedFurkanDemir.Hrms.Entities.Concrete.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	
	private JobService jobService;

	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping("/getall")
	public List<Job> GetAll(){
		return this.jobService.GetAll();
	}
	
}

package MuhammedFurkanDemir.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MuhammedFurkanDemir.Hrms.Business.Abstracts.JobService;
import MuhammedFurkanDemir.Hrms.DataAccess.Abstracts.JobDao;
import MuhammedFurkanDemir.Hrms.Entities.Concrete.Job;

@Service
public class JobManager implements JobService {

	
	
	private JobDao jobDao;
	
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}



	@Override
	public List<Job> GetAll() {
		
		return this.jobDao.findAll();
	}

}

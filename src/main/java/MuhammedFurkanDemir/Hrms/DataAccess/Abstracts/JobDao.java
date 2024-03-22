package MuhammedFurkanDemir.Hrms.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MuhammedFurkanDemir.Hrms.Entities.Concrete.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}

package pms.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pms.com.entities.Effort;
import pms.com.repository.EffortRepository;
import pms.com.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EffortServiceImplement implements EffortService {
    @Autowired
    private EffortRepository effortRepository;

    @Override
    public List<Effort> getAll() {
        return effortRepository.findAll();
    }

    @Override
    public Effort findById(int id) {
        Optional<Effort> effort = effortRepository.findById(id);
        if(effort.isPresent()) {
            return effort.get();
        }
        return null;
    }

    @Override
    public Effort create(Effort e) {
        return effortRepository.save(e);
    }

    @Override
    public Effort approve(int id, Effort e) {
        Optional<Effort> effort = effortRepository.findById(id);
        if(effort.isPresent()) {
            effortRepository.save(e);
        }
        return null;
    }
}

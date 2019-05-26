package pms.com.service;

import org.springframework.stereotype.Service;
import pms.com.entities.Effort;

import java.util.List;

@Service
public interface EffortService {
    public List<Effort> getAll();
    public Effort findById(int id);
    public Effort create(Effort e);
    public Effort approve(int id, Effort e);
}

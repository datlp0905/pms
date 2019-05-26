package pms.com.service;

import org.springframework.stereotype.Service;
import pms.com.dto.ProjectDto;
import pms.com.entities.Project;

import java.util.List;

@Service
public interface ProjectService {
    List<ProjectDto> getAll();

    ProjectDto findById(int id);

    Project create(Project p);

    Project update(int id, Project p);

    void delete(int id);
}

package pms.com.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pms.com.dto.ProjectDto;
import pms.com.entities.Project;
import pms.com.mapper.ProjectMapper;
import pms.com.repository.ProjectRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImplement implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    private ProjectMapper projectMapper = Mappers.getMapper(ProjectMapper.class);

    @Override
    public List<ProjectDto> getAll() {
        return projectRepository.findAll()
                                .stream()
                                .map(entity -> projectMapper.entityToDto(entity))
                                .collect(Collectors.toList());
    }

    @Override
    public ProjectDto findById(int id) {
        Optional<Project> project = projectRepository.findById(id);
        if(project.isPresent()) {
            return projectMapper.entityToDto(project.get());
        }
        return null;
    }

    @Override
    public Project create(Project p) {
        return projectRepository.save(p);
    }

    @Override
    public Project update(int id, Project p) {
        Optional<Project> project = projectRepository.findById(id);
        if(project.isPresent()) {
            return projectRepository.save(p);
        }
        return null;
    }

    @Override
    public void delete(int id) {
        Optional<Project> project = projectRepository.findById(id);
        if(project.isPresent()) {
            projectRepository.delete(project.get());
        }
    }
}

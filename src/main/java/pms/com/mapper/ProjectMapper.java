package pms.com.mapper;

import org.mapstruct.Mapper;
import pms.com.dto.ProjectDto;
import pms.com.entities.Project;

@Mapper
public interface ProjectMapper {
    ProjectDto entityToDto(Project project);
    Project dtoToEntity(ProjectDto dto);
}

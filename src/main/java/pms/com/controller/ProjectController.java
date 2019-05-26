package pms.com.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pms.com.dto.ProjectDto;
import pms.com.entities.Project;
import pms.com.service.ProjectService;

import java.util.List;

@RestController
@RequestMapping("projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    @ApiOperation("Get all project")
    public List<ProjectDto> getAll(){
        return projectService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation("Get a project by id")
    public ProjectDto findById(@PathVariable(name = "id") int id) {
        return projectService.findById(id);
    }

    @PostMapping
    @ApiOperation("Create a new project")
    public Project create(@RequestBody Project project) {
        return projectService.create(project);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update information of a project")
    public Project update(@PathVariable(name = "id") int id, @RequestBody Project project) {
        return projectService.update(id, project);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete a project by id")
    public void delete(@PathVariable(name = "id") int id) {
        projectService.delete(id);
    }
}

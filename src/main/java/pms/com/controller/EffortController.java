package pms.com.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pms.com.entities.Effort;
import pms.com.service.EffortService;

import java.util.List;

@RestController
@RequestMapping("efforts")
public class EffortController {
    @Autowired
    private EffortService effortService;

    @GetMapping
    @ApiOperation("Get all effort")
    public List<Effort> getAll() {
        return effortService.getAll();
    }

    @GetMapping("{id}")
    @ApiOperation("Get effort by id")
    public Effort getById(@PathVariable(name = "id") int id) {
        return effortService.findById(id);
    }

    @PostMapping
    @ApiOperation("Create a new effort")
    public Effort create(@RequestBody Effort effort) {
        return effortService.create(effort);
    }

    @PutMapping("{id}")
    public Effort approve(@PathVariable(name = "id") int id, @RequestBody Effort effort) {
        return effortService.approve(id, effort);
    }
}

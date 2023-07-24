package main.java.com.wildcodeschool.wildandwizard.controller;
import com.wildcodeschool.wildandwizard.entity.Course;
import com.wildcodeschool.wildandwizard.entity.Wizard;
import com.wildcodeschool.wildandwizard.repository.CourseRepository;
import com.wildcodeschool.wildandwizard.repository.WizardRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;


@Controller
public class CourseController {
    @Autowired CourseRepository courseRepository;

    @Autowired WizardRepository wizardRepository;

    @GetMapping("courses")
    @ResponseBody
    public List<Course> getCourses(@PathVariable Long id){
        Optional<Wizard> wizard = wizardRepository.findById(id);
        if(wizard.isPresent()){
            return wizard.get().getCourses();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "wizard not found");
        }
    }


}

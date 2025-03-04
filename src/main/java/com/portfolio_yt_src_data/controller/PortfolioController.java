package com.portfolio_yt_src_data.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio_yt_src_data.entity.About;
import com.portfolio_yt_src_data.entity.Certification;
import com.portfolio_yt_src_data.entity.Contact;
import com.portfolio_yt_src_data.entity.Experience;
import com.portfolio_yt_src_data.entity.Project;
import com.portfolio_yt_src_data.entity.Skill;
import com.portfolio_yt_src_data.service.PortfolioService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class PortfolioController {

    private final PortfolioService service;

    public PortfolioController(PortfolioService service) {
        this.service = service;
    }

    @GetMapping("/about")
    public List<About> getAllAboutInfo() {
        return service.getAllAboutInfo();
    }

    @GetMapping("/about/{id}")
    public Optional<About> getAboutById(@PathVariable String id) {
        return service.getAboutById(id);
    }

    @GetMapping("/certifications")
    public List<Certification> getAllCertifications() {
        return service.getAllCertifications();
    }

    @GetMapping("/certifications/{id}")
    public Optional<Certification> getCertificationById(@PathVariable String id) {
        return service.getCertificationById(id);
    }

    @PostMapping("/certifications")
    public Certification createOrUpdateCertification(@RequestBody Certification certification) {
        return service.saveCertification(certification);
    }
    
    @GetMapping("/contact")
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }

    @GetMapping("/contact/{id}")
    public Optional<Contact> getContactById(@PathVariable String id) {
        return service.getContactById(id);
    }

    @PostMapping("/contact")
    public Contact createOrUpdateContact(@RequestBody Contact contact) {
        return service.saveContact(contact);
    }
    
    @GetMapping("/experience")
    public List<Experience> getAllExperiences() {
        return service.getAllExperiences();
    }

    @GetMapping("/experience/{id}")
    public Optional<Experience> getExperienceById(@PathVariable String id) {
        return service.getExperienceById(id);
    }

    @PostMapping("/experience")
    public Experience createOrUpdateExperience(@RequestBody Experience experience) {
        return service.saveExperience(experience);
    }
    
    @GetMapping("/projects")
    public List<Project> getAllProjects() {
        return service.getAllProjects();
    }

    @GetMapping("/projects/{id}")
    public Optional<Project> getProjectById(@PathVariable String id) {
        return service.getProjectById(id);
    }

    @PostMapping("/projects")
    public Project createOrUpdateProject(@RequestBody Project project) {
        return service.saveProject(project);
    }
    @GetMapping("/skills")
    public List<Skill> getAllSkills() {
        return service.getAllSkills();
    }

    @GetMapping("/skills/{id}")
    public Optional<Skill> getSkillById(@PathVariable String id) {
        return service.getSkillById(id);
    }

    @PostMapping("/skills")
    public Skill createOrUpdateSkill(@RequestBody Skill skill) {
        return service.saveSkill(skill);
    }
}

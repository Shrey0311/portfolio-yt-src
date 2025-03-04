package com.portfolio_yt_src_data.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.portfolio_yt_src_data.entity.About;
import com.portfolio_yt_src_data.entity.Certification;
import com.portfolio_yt_src_data.entity.Contact;
import com.portfolio_yt_src_data.entity.Experience;
import com.portfolio_yt_src_data.entity.Project;
import com.portfolio_yt_src_data.entity.Skill;
import com.portfolio_yt_src_data.repo.AboutRepository;
import com.portfolio_yt_src_data.repo.CertificationRepository;
import com.portfolio_yt_src_data.repo.ContactRepository;
import com.portfolio_yt_src_data.repo.ExperienceRepository;
import com.portfolio_yt_src_data.repo.ProjectRepository;
import com.portfolio_yt_src_data.repo.SkillRepository;

@Service
public class PortfolioService {

    private final AboutRepository aboutRepository;
    private final CertificationRepository certificationRepository;
    private final ContactRepository contactRepository;
    private final ExperienceRepository experienceRepository;
    private final ProjectRepository projectRepository;
    private final SkillRepository skillRepository;

    public PortfolioService(AboutRepository aboutRepository, 
    		CertificationRepository certificationRepository, 
    		ContactRepository contactRepository,
    		ExperienceRepository experienceRepository,
    		ProjectRepository projectRepository,
    		SkillRepository skillRepository) {
        this.aboutRepository = aboutRepository;
        this.certificationRepository = certificationRepository;
        this.contactRepository = contactRepository;
        this.experienceRepository = experienceRepository;
        this.projectRepository = projectRepository;
        this.skillRepository = skillRepository;
    }

    public List<About> getAllAboutInfo() {
        return aboutRepository.findAll();
    }

    public Optional<About> getAboutById(String id) {
        return aboutRepository.findById(id);
    }

    public List<Certification> getAllCertifications() {
        return certificationRepository.findAll();
    }

    public Optional<Certification> getCertificationById(String id) {
        return certificationRepository.findById(id);
    }

    public Certification saveCertification(Certification certification) {
        return certificationRepository.save(certification);
    }
    
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(String id) {
        return contactRepository.findById(id);
    }

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
    
    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    public Optional<Experience> getExperienceById(String id) {
        return experienceRepository.findById(id);
    }

    public Experience saveExperience(Experience experience) {
        return experienceRepository.save(experience);
    }
    

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(String id) {
        return projectRepository.findById(id);
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
    
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public Optional<Skill> getSkillById(String id) {
        return skillRepository.findById(id);
    }

    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }
}

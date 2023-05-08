package com.project.services;

import com.project.models.Admin;
import com.project.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
        @Autowired
        private AdminRepository adminRepository;

        public Admin createAdmin(Admin admin) {
            return adminRepository.save(admin);
        }

        public Admin updateAdmin(Admin admin) {
            return adminRepository.save(admin);
        }

        public void deleteAdmin(Integer id) {
            adminRepository.deleteById(id);
        }

        public void deleteAllAdmins (){
            adminRepository.deleteAll();
        }

        public List<Admin> getAllAdmins() {
            return adminRepository.findAll();
        }

        public Optional<Admin> getAdminById(Integer id) {
            return adminRepository.findById(id);
        }
}



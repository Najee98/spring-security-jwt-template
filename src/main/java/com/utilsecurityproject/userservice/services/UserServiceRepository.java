//package com.utilsecurityproject.userservice.services;
//
//import com.utilsecurityproject.userservice.domain.AppUser;
//import com.utilsecurityproject.userservice.domain.Role;
//import com.utilsecurityproject.userservice.repositories.RoleRepository;
//import com.utilsecurityproject.userservice.repositories.UserRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
////What this annotation does is that it creates a constructor and makes sure all the arguments defined are passed into it
////and this is one way of achieving dependency injection by using lombock
//@RequiredArgsConstructor
//@Transactional
//@Slf4j
//
//public class UserServiceRepository implements UserService{
//
//    private final UserRepository userRepository;
//    private final RoleRepository roleRepository;
//
//    @Override
//    public AppUser saveUser(AppUser user) {
//        log.info("Saving new user {} to the database", user.getName());
//        return userRepository.save(user);
//    }
//
//    @Override
//    public Role saveRole(Role role) {
//        log.info("Saving new role {} to the database", role.getName());
//        return roleRepository.save(role);
//    }
//
//    @Override
//    public void addRoleToUser(String userName, String roleName) {
//        log.info("Adding role {} to user {}", roleName, userName);
//        AppUser user = userRepository.findByUserName(userName);
//        Role role = roleRepository.findByName(roleName);
//        user.getRoles().add(role);
//
//        //once this method is done executing everything is going to be saved to the db because we have the @Transaction annotation
//        //so I don't have to call the user repository
//    }
//
//    @Override
//    public AppUser getUser(String userName) {
//        log.info("Fetching user {}", userName);
//        return userRepository.findByUserName(userName);
//    }
//
//    @Override
//    public List<AppUser> getUsers() {
//        log.info("Fetching all users");
//        return userRepository.findAll();
//    }
//}

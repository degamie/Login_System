package com.spring_login_web_page.Springmvc_login_system.service;

import com.spring_login_web_page.Springmvc_login_system.repository.RoleRepository;
import com.spring_login_web_page.Springmvc_login_system.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

@Service
//public class UserServices implements UserRepository{
public class UserServices implements UserDetailsService{
    private final RoleRepository roleRepository;
    //    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserServices(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    Set<Role> roles=new HashSet<>();
//    public List<ApplicationUser> getUserId(String userId) {
//        return userId;
//    }

//    @Override
    public Integer setUserId(Integer UserId) {
        return UserId;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        this.loadUserByUsername(username);
        return null;
    }

    //    @Override
    public UserRepository loadUserByUsername(String username, String password) throws UsernameNotFoundException {
        throw new UsernameNotFoundException(username + "LoadUserBYUserName");
    }
//        System.out.println(UserDetailsService.class.getName());
//        if (username.equals(username)) throw new UsernameNotFoundException(username + "LoadUserByUsername");
//        roles = new Role("USER", 1);
        //return new ApplicationUser(1,USERNAME.isEmpty(1), PASSWORD,roles);//Testing Purposes
//        return new ApplicationUser(1,username,passwordEncoder.encode(password),roleRepository.findByName(username));
//        getName();
//         return loadUserByUsername(username, password);


//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends ApplicationUser> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends ApplicationUser> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return List.of();
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<ApplicationUser> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<String> strings) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public ApplicationUser getOne(String s) {
//        return null;
//    }
//
//    @Override
//    public ApplicationUser getById(String s) {
//        return null;
//    }
//
//    @Override
//    public ApplicationUser getReferenceById(String s) {
//        return null;
//    }
//
//    @Override
//    public <S extends ApplicationUser> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends ApplicationUser> List<S> findAll(Example<S> example) {
//        return List.of();
//    }
//
//    @Override
//    public <S extends ApplicationUser> List<S> findAll(Example<S> example, Sort sort) {
//        return List.of();
//    }
//
//    @Override
//    public <S extends ApplicationUser> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends ApplicationUser> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends ApplicationUser> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends ApplicationUser, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public <S extends ApplicationUser> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends ApplicationUser> List<S> saveAll(Iterable<S> entities) {
//        return List.of();
//    }
//
//    @Override
//    public Optional<ApplicationUser> findById(String s) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(String s) {
//        return false;
//    }
//
//    @Override
//    public List<ApplicationUser> findAll() {
//        return List.of();
//    }
//
//    @Override
//    public List<ApplicationUser> findAllById(Iterable<String> strings) {
//        return List.of();
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(String s) {
//
//    }
//
//    @Override
//    public void delete(ApplicationUser entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends String> strings) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends ApplicationUser> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public List<ApplicationUser> findAll(Sort sort) {
//        return List.of();
//    }
//
//    @Override
//    public Page<ApplicationUser> findAll(Pageable pageable) {
//        return null;
//    }


//    @Override
//   UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return null;
//    }
}

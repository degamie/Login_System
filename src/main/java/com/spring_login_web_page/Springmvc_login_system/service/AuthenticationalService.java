package com.spring_login_web_page.Springmvc_login_system.service;

import com.spring_login_web_page.Springmvc_login_system.model.ApplicationUser;
import com.spring_login_web_page.Springmvc_login_system.model.LoginResponseDTO;
import com.spring_login_web_page.Springmvc_login_system.repository.RoleRepository;
import com.spring_login_web_page.Springmvc_login_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

//import static jdk.internal.icu.impl.Punycode.encode;

@Service
public class AuthenticationalService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
//    @Autowired
    public String username;
    private String password;
    public String userid;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;
    private PasswordEncoder passwordEncoder;
    ApplicationUser userRole = roleRepository.findByAuthority("USER");

    //@Autowired
    public LoginResponseDTO loginUsername(String username, String password) {
        try {
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (AuthenticationException e) {

        }
        return new LoginResponseDTO(null, "");
    }

    @Autowired
    public List<User> getUsers() {
        return userRepository.getAllUsers();
    }
    @Autowired
    public String getUserById(String userid){
        return userRepository.findUserById(username).orElseThrow(()-> HttpStatus.BAD_REQUEST,"UserId not Found!");
    }
    @Autowired
    public String getUserByusername(String username){
        return userRepository.findUserByUsername(username).orElseThrow(()-> HttpStatus.BAD_REQUEST,"UserId not Found!");
    }
    @Autowired
    public String getUserBypassword(String password){
        return userRepository.findUserBypassword(username).orElseThrow(()-> HttpStatus.BAD_REQUEST,"UserId not Found!");
    }

    @Autowired
    public String registeruser(String username, String password){
        return "User is Registered Successfully!"+passwordEncoder.encode(password);
    }
    public String encode(String password) {
        return password;
    }

    public String matches(String password2) {
        password = password.matches(passwordEncoder.encode(password)) ? "yes" : "no";
        return password;
    }
}
//        String UsernameStaus=userRepository.findUserByUsername(username).orElseThrow(()-> HttpStatus.BAD_REQUEST,"User not Found!");
       //  String UserpasswordStaus=userRepository.findUserBypassword(password).orElseThrow(()-> HttpStatus.BAD_REQUEST,"User not Found!");


//        return passwordEncoder.encode(password)

//        userRepository.findAll();


    //            String password2 = password;


//            }
//    List<Authentication> authorities = new List<Authentication>();


//            return userRepository.save(new ApplicationUser(0, username,passwordEncoder.encode(authorities.equals(password.contains()))));

//
//    @Override
//        public int size() {
//            return 0;
//        }
//
//        @Override
//        public boolean isEmpty() {
//            return false;
//        }
//
//        @Override
//        public boolean contains(Object o) {
//            return false;
//        }
//
//        @Override
//        public Iterator<Authentication> iterator() {
//            return null;
//        }
//
//        @Override
//        public Object[] toArray() {
//            return new Object[0];
//        }
//
//        @Override
//        public <T> T[] toArray(T[] a) {
//            return null;
//        }
//
//        @Override
//        public boolean add(Authentication authentication) {
//            return false;
//        }
//
//        @Override
//        public boolean remove(Object o) {
//            return false;
//        }
//
//        @Override
//        public boolean containsAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public boolean addAll(Collection<? extends Authentication> c) {
//            return false;
//        }
//
//        @Override
//        public boolean addAll(int index, Collection<? extends Authentication> c) {
//            return false;
//        }
//
//        @Override
//        public boolean removeAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public boolean retainAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public void clear() {
//
//        }
//
//        @Override
//        public Authentication get(int index) {
//            return null;
//        }
//
//        @Override
//        public Authentication set(int index, Authentication element) {
//            return null;
//        }
//
//        @Override
//        public void add(int index, Authentication element) {
//
//        }
//
//        @Override
//        public Authentication remove(int index) {
//            return null;
//        }
//
//        @Override
//        public int indexOf(Object o) {
//            return 0;
//        }
//
//        @Override
//        public int lastIndexOf(Object o) {
//            return 0;
//        }
//
//        @Override
//        public ListIterator<Authentication> listIterator() {
//            return null;
//        }
//
//        @Override
//        public ListIterator<Authentication> listIterator(int index) {
//            return null;
//        }
//
//        @Override
//        public List<Authentication> subList(int fromIndex, int toIndex) {
//            return List.of();
//        }
//    };
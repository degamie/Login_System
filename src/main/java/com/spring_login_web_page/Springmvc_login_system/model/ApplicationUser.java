package com.spring_login_web_page.Springmvc_login_system.model;

import com.spring_login_web_page.Springmvc_login_system.repository.UserRepository;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.management.relation.Role;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name= "User")
public class ApplicationUser implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="userid")
    @Column(unique = true)
    private Integer userid;

    private String username;
    private String password;
    private Set<Role> authorities;


    //    private String message;
//    public Set<Role> getRoles() {};

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @JoinTable(
            name = "user_role_junction",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = password)}
    )

//    @Override
    public ApplicationUser(Set<Role> authorities) {
        super();
        this.authorities = new HashSet<>(getAuthorities().hashCode());
    }

    private HashSet<Object> Authorities() {
        return null;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return "";
    }

    //    @Override
//    public String getAuthorities(){
//        throw new UnsupportedOperationException("Authorized Account");
//    }
    @Override
    public boolean isAccountNonExpired() {
        throw new UnsupportedOperationException("Account is Non Expired");
    }

    @Override
    public boolean isAccountNonLocked() {
        throw new UnsupportedOperationException("Account is Unlocked");
    }

    @Override
    public boolean isCredentialsNonExpired() {
        throw new UnsupportedOperationException("Unimplemented Method: 'get Authorized'");
    }

    //    @Override
    public boolean setPassword(String password) {
        this.password = password;
        return true;
    }

    //    @Override
    public Boolean isAccountLocked() {
        throw new UnsupportedOperationException("Account is Not Locked");
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("UnImplemented Method ");
        return true;
    }

    //    @Override
    public Set<Role> getAuthorities(Set<Role> authorities) {
        return authorities;
    }

    //    @Override
    public void setUsername(String Username) {
        this.username = Username;
    }

    //        @Override
    public Boolean setAuthorities(Set<Role> authorities) {
        this.authorities = authorities;
        return true;
    }

    //@Override
    public String getUsername() {
        return username;
    }
//        this.username=username;


    //    @Override
    public String loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("In the UserDetailsServices");
        return username;
    }
//        return UserRepository.findByUsername(username).orElseThrow(
//                ()->new UsernameNotFoundException;
//        );

    public ApplicationUser applicationUser(Integer userid, String username, String password, Set<Role> authorities) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        super();
//        return true;
//        this.authorities = authorities;
    }
}
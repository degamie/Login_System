package com.spring_login_web_page.springmvc_login_system.model;

import com.spring_login_web_page.Springmvc_login_system.repository.UserRepository;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Indexed;

import javax.management.relation.Role;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.basic.BasicComboBoxEditor;
@Table(name= 'User')
@Entity

// @EntityScan
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class ApplicationUser implements UserDetails{
    @Id
    @Generated(strategy=GeneratedValue.AUTO)

    public Integer userid;
    public String username;
    public String password; 
    public Set<Role> authorities;
}
    
// //    private String message;
//     public Set<Role> authorities=new HashSet<>();
//     public Set<Role> getAuthorities(){
//         return this.authorities;
//     }

//     public Integer getUserid() {return userid;}
//     public void setUserid(int userid) {this.userid = userid;}

//     @ManyToMany(fetch = FetchType.EAGER)
//     @JoinTable(
//             name = 'user_role_junction',
//             joinColumns = {@JoinColumn(name='user_id')},
//             inverseJoinColumns = {@JoinColumn(name='role_id')}
//     )
//     public ApplicationUser() {
//         super();
//         this.authorities = new HashSet<>();
//     }
//     @Override
//     public Collection<? extends GrantedAuthority> getAuthorities() {
//         return List.of();
//     }

//     @Override
//     public String getPassword(){return "";}
// //    @Override
// //    public String getAuthorities(){
// //        throw new UnsupportedOperationException("Authorized Account");
// //    }
//     // @Override
//     public boolean isAccountNonExpired() {throw new UnsupportedOperationException("Account is Non Expired");}
//     // @Override
//     public boolean isAccountNonLocked() {throw new UnsupportedOperationException("Account is Unlocked");}
//     // @Override
//     public boolean isCredentialsNonExpired() {throw new UnsupportedOperationException("Unimplemented Method: 'get Authorized'");}
//     // @Override
//     public boolean setPassword(String password) {this.password = password;}
//     // @Override
//     public Boolean isAccountLocked(){throw new UnsupportedOperationException("Account is Not Locked");
//     }
//     // @Override
//     public boolean isEnabled(){throw new UnsupportedOperationException("UnImplemented Method ");return true;}
//     // @Override
//     public void setAuthorities(Set<Role> authorities) {
//         this.authorities = authorities;
//     }
//     // @Override

//     // @Override
//     public void setUsername(String Username){
//         this.username = Username;
//     }
//     // @Override
//     public String getUsername(){
//         return username;
//     }

// //    @Override
//     public String loadUserByUsername(String username) throws UsernameNotFoundException {
//         // System.out.println("In the UserDetailsServices");
//         return UserRepository.findByUsername(username);
//          //     .orElseThrow
//         //         ()->new UsernameNotFoundException;
//         // );
//     }
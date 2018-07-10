package com.nsk.cloud.microservicesimpleprovideruser.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author nsk
 * 2018/7/9 7:51
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if("user".equals(username)){
            return new SecurityUser("user","password1","user-role");
        }else if("admin".equals(username)){
            return new SecurityUser("admin","password2","admin-role");
        }
        return null;
    }

    class SecurityUser implements UserDetails{

        private Long id;
        private String username;
        private String password;
        private String role;

        public SecurityUser(){
            // for sonar
        }

        public SecurityUser(String username,String password,String role){
            super();
            this.username = username;
            this.password = password;
            this.role = role;
        }

        public boolean isEnabled(){
            return true;
        }

        public boolean isAccountNonExpired(){
            return true;
        }

        public boolean isAccountNonLocked(){
            return true;
        }

        public boolean isCredentialsNonExpired(){
            return true;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(this.role);
            authorities.add(authority);
            return authorities;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        @Override
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        @Override
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }
    }
}

//package com.subhajit.Medicare.Services.Implementation;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.subhajit.Medicare.Models.ERole;
//import com.subhajit.Medicare.Models.Role;
//import com.subhajit.Medicare.Models.User;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.io.Serial;
//import java.util.Collection;
//import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;
//@Getter
//@Setter
//@AllArgsConstructor
//public class UserDetailsImpl implements UserDetails {
//    @Serial
//    private static final long serialVersionUID = 1L;
//    private String id;
//    private String username;
//    private String email;
//    @JsonIgnore
//    private String password;
////    private Collection<? extends GrantedAuthority> authorities;
//    @Enumerated(EnumType.STRING)
//    private ERole role;
////    public static UserDetailsImpl build(User user) {
//////        List<GrantedAuthority> authorities = user.getRoles().stream()
//////                .map(role -> new SimpleGrantedAuthority(role.getName().name()))
//////                .collect(Collectors.toList());
////        List<GrantedAuthority> authorities = ERole
////        return new UserDetailsImpl(
////                user.getId(),
////                user.getUsername(),
////                user.getEmail(),
////                user.getPassword(),
////                authorities);
////    }
//
////    @Override
////    public Collection<? extends GrantedAuthority> getAuthorities() {
////        return authorities;
////    }
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return role.getAuthorities();
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        UserDetailsImpl user = (UserDetailsImpl) o;
//        return Objects.equals(id, user.id);
//    }
//}
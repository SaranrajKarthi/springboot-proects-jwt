//package com.securitySB3.config;
//
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import com.securitySB3.service.JwtService;
//import com.securitySB3.service.UserService;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class RequestFilter extends OncePerRequestFilter {
//
//	@Autowired
//	private UserService userService;
//	
//	@Autowired
//	private JwtService jwtService;
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		
//		final String authorizationHeader = request.getHeader("Authorization");
//
//        String username = null;
//        String jwt = null;
//		
//        
//	}
//	
//	
//}

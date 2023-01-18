package web;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

//Cross-origin resource sharing (CORS)
	@Component
	public class CorsFilter extends OncePerRequestFilter {

		@Override
		protected void doFilterInternal(HttpServletRequest request, 
				HttpServletResponse response, FilterChain filterChain)
				throws ServletException, IOException {		
			response.addHeader("Access-Control-Allow-Origin", "*");
			response.addHeader("Access-Control-Allow-Methods",
					   "GET, POST, PUT, DELETE, PATCH, OPTIONS");
			response.addHeader("Access-Control-Allow-Headers",
					   "origin, content-type, accept,x-req");		
			  filterChain.doFilter(request, response);
		}	
	}

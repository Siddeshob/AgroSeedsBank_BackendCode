//package seeds.bank.ReactSeedBank.Authentication;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.bind.annotation.*;
//
//
//    @RestController
//    @RequestMapping("/api/auth")
//    public class AuthController {
//
//        @Autowired
//        private AuthenticationManager authenticationManager;
//
//        @PostMapping("/login")
//        public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
//            try {
//                Authentication authentication = authenticationManager.authenticate(
//                        new UsernamePasswordAuthenticationToken(username, password)
//                );
//
//                if (authentication.isAuthenticated()) {
//                    return ResponseEntity.ok().body("Login successful");
//                } else {
//                    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//                }
//            } catch (AuthenticationException e) {
//                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//            }
//        }
//    }
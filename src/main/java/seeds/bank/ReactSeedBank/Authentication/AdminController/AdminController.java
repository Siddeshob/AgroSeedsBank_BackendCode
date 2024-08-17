//package seeds.bank.ReactSeedBank.Authentication.AdminController;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import seeds.bank.ReactSeedBank.Authentication.Service.AdminService;
//
//@RestController
//@RequestMapping("/api/admin")
//public class AdminController {
//
//    @Autowired
//    private AdminService adminService;
//
//    @PostMapping("/authenticate")
//    public boolean authenticate(@RequestParam String username, @RequestParam String password) {
//        return adminService.authenticate(username, password);
//    }
//}
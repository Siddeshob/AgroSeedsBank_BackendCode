//package seeds.bank.ReactSeedBank.Authentication.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import seeds.bank.ReactSeedBank.Authentication.AdminEntity;
//import seeds.bank.ReactSeedBank.Authentication.Repo.AdminRepo;
//
//@Service
//public class AdminService {
//    @Autowired
//    private AdminRepo adminRepo;
//
//    public boolean authenticate(String username, String password) {
//        AdminEntity admin = adminRepo.findByUsername(username);
//        if (admin != null && admin.getPassword().equals(password)) {
//            return true;
//        }
//        return false;
//    }
//
//}

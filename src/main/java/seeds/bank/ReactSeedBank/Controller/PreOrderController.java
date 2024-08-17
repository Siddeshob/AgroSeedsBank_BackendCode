package seeds.bank.ReactSeedBank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seeds.bank.ReactSeedBank.Entity.PreOrderEntity;
import seeds.bank.ReactSeedBank.Service.PreOrderService;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@CrossOrigin("*")
public class PreOrderController {
    @Autowired
    PreOrderService preOrderService;

    public PreOrderController(PreOrderService preOrderService)
    {
        this.preOrderService=preOrderService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public PreOrderEntity CreatePreOrder(@RequestBody PreOrderEntity preOrderEntity) {
        return preOrderService.CreatePreOrder(preOrderEntity);
    }

    @GetMapping("/all")
    public List<PreOrderEntity> getAllPreOrder()
    {
        return preOrderService.getAllPreOrders();
    }
}

package seeds.bank.ReactSeedBank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seeds.bank.ReactSeedBank.Entity.PreOrderEntity;
import seeds.bank.ReactSeedBank.Repo.PreOrderRepo;

import java.util.List;

@Service
public class PreOrderService {
    @Autowired
    PreOrderRepo preOrderRepo;

    public PreOrderService(PreOrderRepo preOrderRepo){
        this.preOrderRepo=preOrderRepo;
    }

    public PreOrderEntity CreatePreOrder(PreOrderEntity preOrderEntity){
        return preOrderRepo.save(preOrderEntity);
    }
    public List<PreOrderEntity> getAllPreOrders()
    {
        return preOrderRepo.findAll();
    }
}

package seeds.bank.ReactSeedBank.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import seeds.bank.ReactSeedBank.Entity.Card;
import seeds.bank.ReactSeedBank.Entity.PreOrderEntity;

@Repository
public interface PreOrderRepo extends JpaRepository<PreOrderEntity,Long> {


}

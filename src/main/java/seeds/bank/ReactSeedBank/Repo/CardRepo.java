package seeds.bank.ReactSeedBank.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import seeds.bank.ReactSeedBank.Entity.Card;

@Repository
public interface CardRepo extends JpaRepository<Card,Long> {
}

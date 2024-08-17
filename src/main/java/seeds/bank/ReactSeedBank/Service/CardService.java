package seeds.bank.ReactSeedBank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seeds.bank.ReactSeedBank.Entity.Card;
import seeds.bank.ReactSeedBank.Repo.CardRepo;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {
    @Autowired
    private CardRepo cardRepo;
    public CardService(CardRepo cardRepo)
    {
        this.cardRepo=cardRepo;
    }
    public List<Card> getAllCards()
    {
        return cardRepo.findAll();
    }
    public Optional<Card> getCardsById(Long id)
    {
        return cardRepo.findById(id);
    }
    public Card createCard(Card card)
    {
        if(card.getId()!=null){
            card.setId(null);
        }
        return cardRepo.save(card);
    }
    public Card updateCard(Long id,Card card)
    {
        Card findedCard=cardRepo.findById(id).orElseThrow(() ->new RuntimeException("card cannot find"));
        findedCard.setImageLink(card.getImageLink());
        findedCard.setItemName(card.getItemName());
        findedCard.setPrice(card.getPrice());
        findedCard.setVillageAddress(card.getVillageAddress());

        return cardRepo.save(findedCard);
    }
    public void deleteCard(Long id)
    {
        cardRepo.deleteById(id);
    }
    public void deleteAllCards()
    {
        cardRepo.deleteAll();
    }
}

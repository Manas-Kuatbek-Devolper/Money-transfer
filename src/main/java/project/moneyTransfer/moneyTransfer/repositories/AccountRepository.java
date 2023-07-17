package project.moneyTransfer.moneyTransfer.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.moneyTransfer.moneyTransfer.entities.Account;

@Repository

public interface AccountRepository extends JpaRepository<Account,String> {
    Account findByAccountId(String fromAccountId);
}

package project.moneyTransfer.moneyTransfer.services.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.moneyTransfer.moneyTransfer.entities.Account;
import project.moneyTransfer.moneyTransfer.repositories.AccountRepository;
import project.moneyTransfer.moneyTransfer.services.AccountService;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public String transferMoney(String fromAccountId, String toAccountId, double amount) {
        Account fromAccount = accountRepository.findByAccountId(fromAccountId);
        Account toAccount = accountRepository.findByAccountId(toAccountId);

        if (fromAccount == null || toAccount == null) {
            return "Не удалось найти счета";
        }

        if (fromAccount.getBalance() < amount) {
            return "Недостаточно средств на счете";
        }

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        accountRepository.save(fromAccount);
        accountRepository.save(toAccount);

        return "Перевод выполнен успешно";
    }
    }





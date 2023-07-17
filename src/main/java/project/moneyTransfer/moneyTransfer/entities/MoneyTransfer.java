package project.moneyTransfer.moneyTransfer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransfer {
    private String fromAccountId;
    private String toAccountId;
    private double amount;
}

package project.moneyTransfer.moneyTransfer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Account {
    @Id

    private String accountId;
    private double balance;
}

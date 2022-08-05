package net.abdaziz.javainvoicemanagement.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Entity
@Data
@SQLDelete(sql = "update payment set status_record = 'INACTIVE' where id = ?")
@Where(clause = "status_record = 'ACTIVE'")
public class Payment extends BaseEntity {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_virtual_account")
    private VirtualAccount virtualAccount;

    @NotNull
    private LocalDateTime transactionDate;

    @NotNull @NotEmpty
    private String providerReference;

    @NotNull @Min(1)
    private BigDecimal amount;
}

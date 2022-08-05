package net.abdaziz.javainvoicemanagement.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Entity
@Data
@SQLDelete(sql = "update virtual_account set status_record = 'INACTIVE' where id = ?")
@Where(clause = "status_record = 'ACTIVE'")
public class VirtualAccount extends BaseEntity {

    @NotNull
    @ManyToOne @JoinColumn(name = "id_payment_provider")
    private PaymentProvider paymentProvider;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_invoice")
    private Invoice invoice;

    @NotNull @NotEmpty @Size(min = 1)
    private String companyId;

    @NotNull
    @NotEmpty
    @Size(min = 1)
    private String accountNumber;

    @NotNull @Enumerated(EnumType.STRING)
    private VirtualAccountType virtualAccountType = VirtualAccountType.CLOSED;
    
}

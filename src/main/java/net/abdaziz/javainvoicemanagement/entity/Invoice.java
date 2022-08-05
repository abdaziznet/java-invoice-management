package net.abdaziz.javainvoicemanagement.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Entity
@Data
@SQLDelete(sql = "update invoice set status_record = 'INACTIVE' where id = ?")
@Where(clause = "status_record = 'ACTIVE'")
public class Invoice extends BaseEntity {

    @NotNull
    @ManyToOne @JoinColumn(name = "id_invoice_type")
    private InvoiceType invoiceType;

    @NotNull @NotEmpty @Size(min = 3, max = 100)
    private String invoiceNumber;   

    @NotNull
    private LocalDateTime dueDate; 
    
    @NotNull @NotEmpty @Size(min = 3, max = 255)
    private String description;

    @NotNull @Min(0)
    private BigDecimal amount;

    @NotNull
    private Boolean isPaid = false;
}

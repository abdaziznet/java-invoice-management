package net.abdaziz.javainvoicemanagement.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.abdaziz.javainvoicemanagement.entity.InvoiceType;

@SpringBootTest
public class InvoiceTypeDaoTests {

    @Autowired
    InvoiceTypeDao invoiceTypeDao;

    @Test
    public void testInsertInvoiceType() {
        InvoiceType invoiceType = new InvoiceType();
        invoiceType.setCode("IT-001");
        invoiceType.setName("Invoice Type 1");
        Assertions.assertNull(invoiceType.getId());
        invoiceTypeDao.save(invoiceType);
        Assertions.assertNotNull(invoiceType.getId());
        Assertions.assertNotNull(invoiceType.getCreatedDate());
        Assertions.assertNotNull(invoiceType.getLastModifiedDate());

        System.out.println("Invoice Type Id: " + invoiceType.getId());
        System.out.println("Created Time: " + invoiceType.getCreatedDate());
        System.out.println("last Updated Time: " + invoiceType.getLastModifiedDate());
    }
}

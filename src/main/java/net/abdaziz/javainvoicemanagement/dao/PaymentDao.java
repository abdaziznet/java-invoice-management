package net.abdaziz.javainvoicemanagement.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import net.abdaziz.javainvoicemanagement.entity.Payment;

public interface PaymentDao extends PagingAndSortingRepository<Payment, String> {

}

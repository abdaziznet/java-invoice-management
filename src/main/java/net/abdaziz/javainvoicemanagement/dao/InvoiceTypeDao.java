package net.abdaziz.javainvoicemanagement.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import net.abdaziz.javainvoicemanagement.entity.InvoiceType;

public interface InvoiceTypeDao extends PagingAndSortingRepository<InvoiceType, String> {

}

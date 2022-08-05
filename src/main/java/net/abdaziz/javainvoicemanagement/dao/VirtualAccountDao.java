package net.abdaziz.javainvoicemanagement.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import net.abdaziz.javainvoicemanagement.entity.VirtualAccount;

public interface VirtualAccountDao extends PagingAndSortingRepository<VirtualAccount, String> {

    
}

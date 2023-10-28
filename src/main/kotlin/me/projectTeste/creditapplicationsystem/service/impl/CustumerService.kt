package me.projectTeste.creditapplicationsystem.service.impl

import me.projectTeste.creditapplicationsystem.entity.Customer
import me.projectTeste.creditapplicationsystem.repository.CustomerRepository
import me.projectTeste.creditapplicationsystem.service.ICustomerService
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class CustumerService(
    private val customerRepository: CustomerRepository
): ICustomerService {
    override fun save(customer: Customer): Customer =
        this.customerRepository.save(customer)

    override fun findById(id: Long): Customer =
        this.customerRepository.findById(id).orElseThrow{
            throw RuntimeException("Id $id not found")
        }
    override fun delete(id: Long) =
        this.customerRepository.deleteById(id)
}
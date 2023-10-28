package me.projectTeste.creditapplicationsystem.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.FutureOrPresent
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.NotNull
import me.projectTeste.creditapplicationsystem.entity.Credit
import me.projectTeste.creditapplicationsystem.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field:NotNull(message = "Invalid input")
    val creditValue: BigDecimal,

    @field:FutureOrPresent()
    val dayFirstOfInstallment: LocalDate,

    @field:Max(48, message = "Limit exceeded")
    val numberOfInstallments: Int,

    @field:NotNull(message = "Invalid input")
    val customerId: Long
) {

    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)
    )
}

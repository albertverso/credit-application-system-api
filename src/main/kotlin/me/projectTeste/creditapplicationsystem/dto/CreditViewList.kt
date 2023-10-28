package me.projectTeste.creditapplicationsystem.dto

import me.projectTeste.creditapplicationsystem.entity.Credit
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

data class CreditViewList(
    val creditCode: UUID,
    val creditValue: BigDecimal,
    val numberOfInstallments: Int,
) {
    constructor(credit: Credit) : this(
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallments = credit.numberOfInstallments
    )
}

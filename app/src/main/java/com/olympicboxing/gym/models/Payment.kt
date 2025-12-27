package com.olympicboxing.gym.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "payments")
data class Payment(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    @ColumnInfo(name = "member_id")
    val memberId: Long,

    @ColumnInfo(name = "amount")
    val amount: Double,

    @ColumnInfo(name = "payment_method")
    val paymentMethod: String, // e.g., "CASH", "CARD", "BANK_TRANSFER"

    @ColumnInfo(name = "payment_date")
    val paymentDate: Long, // Unix timestamp

    @ColumnInfo(name = "description")
    val description: String? = null,

    @ColumnInfo(name = "receipt_number")
    val receiptNumber: String? = null,

    @ColumnInfo(name = "status")
    val status: String = "COMPLETED", // e.g., "COMPLETED", "PENDING", "FAILED"

    @ColumnInfo(name = "created_at")
    val createdAt: Long = System.currentTimeMillis(),

    @ColumnInfo(name = "updated_at")
    val updatedAt: Long = System.currentTimeMillis()
) {
    companion object {
        const val PAYMENT_METHOD_CASH = "CASH"
        const val PAYMENT_METHOD_CARD = "CARD"
        const val PAYMENT_METHOD_BANK_TRANSFER = "BANK_TRANSFER"

        const val STATUS_COMPLETED = "COMPLETED"
        const val STATUS_PENDING = "PENDING"
        const val STATUS_FAILED = "FAILED"
    }
}

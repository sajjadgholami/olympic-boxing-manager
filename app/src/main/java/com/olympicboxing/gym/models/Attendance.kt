package com.olympicboxing.gym.models

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(
    tableName = "attendance",
    foreignKeys = [
        ForeignKey(
            entity = Member::class,
            parentColumns = ["id"],
            childColumns = ["memberId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Attendance(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    
    val memberId: Long,
    
    val date: String,
    
    val checkInTime: String? = null,
    
    val checkOutTime: String? = null,
    
    val duration: Long = 0, // Duration in minutes
    
    val notes: String = "",
    
    val createdAt: String = LocalDateTime.now().toString(),
    
    val updatedAt: String = LocalDateTime.now().toString()
)

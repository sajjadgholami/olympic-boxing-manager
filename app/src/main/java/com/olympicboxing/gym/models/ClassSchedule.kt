package com.olympicboxing.gym.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "class_schedule")
data class ClassSchedule(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    
    val className: String,
    
    val instructorName: String,
    
    val description: String? = null,
    
    val startTime: Long, // Unix timestamp
    
    val endTime: Long, // Unix timestamp
    
    val maxCapacity: Int,
    
    val currentEnrollment: Int = 0,
    
    val location: String,
    
    val isActive: Boolean = true,
    
    val createdAt: Long = System.currentTimeMillis(),
    
    val updatedAt: Long = System.currentTimeMillis()
)

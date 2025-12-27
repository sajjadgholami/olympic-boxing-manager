package com.olympicboxing.gym.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "members")
data class Member(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    
    val firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    val dateOfBirth: String,
    
    val membershipStartDate: String,
    val membershipEndDate: String?,
    val membershipStatus: String, // ACTIVE, INACTIVE, SUSPENDED
    
    val weight: Float?, // in kg
    val height: Float?, // in cm
    val boxingLevel: String, // BEGINNER, INTERMEDIATE, ADVANCED, PROFESSIONAL
    
    val emergencyContactName: String?,
    val emergencyContactPhone: String?,
    
    val createdAt: String,
    val updatedAt: String
)

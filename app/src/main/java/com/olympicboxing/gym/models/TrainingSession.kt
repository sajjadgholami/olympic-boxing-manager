package com.olympicboxing.gym.models

import java.util.Date

/**
 * Data class representing a training session record for boxers.
 *
 * @property id Unique identifier for the training session
 * @property boxerId ID of the boxer participating in this session
 * @property sessionDate Date and time when the training session took place
 * @property durationMinutes Duration of the training session in minutes
 * @property sessionType Type of training (e.g., "Sparring", "Bag Work", "Conditioning", "Technique")
 * @property intensity Intensity level of the session (e.g., "Low", "Medium", "High")
 * @property coachId ID of the coach who led the session (optional)
 * @property notes Additional notes or observations about the session
 * @property caloriesBurned Estimated calories burned during the session
 * @property punchesThrown Total number of punches thrown during the session
 * @property createdAt Timestamp when this record was created
 * @property updatedAt Timestamp when this record was last updated
 */
data class TrainingSession(
    val id: String = "",
    val boxerId: String = "",
    val sessionDate: Date = Date(),
    val durationMinutes: Int = 0,
    val sessionType: String = "",
    val intensity: String = "",
    val coachId: String? = null,
    val notes: String = "",
    val caloriesBurned: Int = 0,
    val punchesThrown: Int = 0,
    val createdAt: Date = Date(),
    val updatedAt: Date = Date()
)

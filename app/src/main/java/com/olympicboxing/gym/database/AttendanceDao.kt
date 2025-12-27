package com.olympicboxing.gym.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.olympicboxing.gym.models.Attendance
import kotlinx.coroutines.flow.Flow

@Dao
interface AttendanceDao {

    @Insert
    suspend fun insertAttendance(attendance: Attendance): Long

    @Update
    suspend fun updateAttendance(attendance: Attendance)

    @Delete
    suspend fun deleteAttendance(attendance: Attendance)

    @Query("SELECT * FROM attendance WHERE id = :id")
    suspend fun getAttendanceById(id: Long): Attendance?

    @Query("SELECT * FROM attendance WHERE memberId = :memberId ORDER BY date DESC")
    fun getAttendanceByMember(memberId: Long): Flow<List<Attendance>>

    @Query("SELECT COUNT(*) FROM attendance WHERE memberId = :memberId AND date = :date")
    suspend fun checkAttendanceExists(memberId: Long, date: String): Int

    @Query("SELECT * FROM attendance WHERE date = :date ORDER BY date DESC")
    fun getAttendanceByDate(date: String): Flow<List<Attendance>>

    @Query("SELECT COUNT(*) FROM attendance WHERE memberId = :memberId")
    fun getTotalAttendance(memberId: Long): Flow<Int>

    @Query("SELECT * FROM attendance WHERE memberId = :memberId ORDER BY date DESC LIMIT :limit")
    fun getRecentAttendance(memberId: Long, limit: Int): Flow<List<Attendance>>

    @Query("DELETE FROM attendance WHERE memberId = :memberId")
    suspend fun deleteAttendanceByMemberId(memberId: Long)
}
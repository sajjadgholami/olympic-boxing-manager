package com.olympicboxing.gym.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.olympicboxing.gym.models.Member
import kotlinx.coroutines.flow.Flow

@Dao
interface MemberDao {

    @Insert
    suspend fun insertMember(member: Member): Long

    @Update
    suspend fun updateMember(member: Member)

    @Delete
    suspend fun deleteMember(member: Member)

    @Query("SELECT * FROM members WHERE id = :id")
    suspend fun getMemberById(id: Int): Member?

    @Query("SELECT * FROM members WHERE membershipStatus = 'ACTIVE' ORDER BY firstName ASC")
    fun getAllActiveMembers(): Flow<List<Member>>

    @Query("SELECT * FROM members ORDER BY firstName ASC")
    fun getAllMembers(): Flow<List<Member>>

    @Query("SELECT COUNT(*) FROM members WHERE membershipStatus = 'ACTIVE'")
    fun getActiveMembersCount(): Flow<Int>

    @Query("SELECT * FROM members WHERE firstName LIKE :query OR lastName LIKE :query OR email LIKE :query OR phoneNumber LIKE :query")
    fun searchMembers(query: String): Flow<List<Member>>

    @Query("DELETE FROM members WHERE id = :memberId")
    suspend fun deleteMemberById(memberId: Int)
}
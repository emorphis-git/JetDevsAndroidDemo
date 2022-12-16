package com.imaginato.homeworkmvvm.data.local.login

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "user_table")
@Parcelize
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val userId: String?,
    val userName: String?,
    val isDeleted: Boolean?,
    val xAccToken: String?
) : Parcelable
package com.imaginato.homeworkmvvm.data.local.login

class UserDataRepository constructor(
    private val userDatabase: UserDatabase
) {
    fun insertUser(user1: User) = userDatabase.userDao.insertDemo(user1)
}
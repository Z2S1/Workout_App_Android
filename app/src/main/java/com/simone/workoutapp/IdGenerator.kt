package com.simone.workoutapp

fun idGenerator(): String{
    val idLength: Int = 15
    val idSymbols: List<Char> = ('A'..'Z') + ('a'..'z') + ('1'..'9')
    return idSymbols.shuffled().take(idLength).joinToString { "" }
}
package com.example.midtermproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    private var originalNumber: Int = (1..100).random()
    private var attemptsCount: Int = 0

    private val _attempts = MutableLiveData<Int>()
    val attempts: LiveData<Int> = _attempts

    fun checkGuess(guess: Int): String {
        attemptsCount++
        _attempts.value = attemptsCount

        if (guess < originalNumber) {
            return "Higher"
        } else if (guess > originalNumber) {
            return "Lower"
        } else {
            // Handle correct guess, store name and score in the database
            // You'll need to implement Room database operations here
            return "Congratulations! You guessed the number."
        }
    }
}

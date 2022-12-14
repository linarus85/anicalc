package com.example.anicalc.data

import com.example.anicalc.ui.screen.timer.TimerViewModel


interface TimerRepository {
    fun saveTimerType(timerType: TimerViewModel.TimerType)
    suspend fun getTimerType(): TimerViewModel.TimerType
}
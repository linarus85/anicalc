package com.example.anicalc.data

import com.example.anicalc.util.TimerState


interface StopwatchRepository {
    fun saveStopwatch(
        timeInMillis: Long,
        timerState: TimerState,
        lapList: List<Pair<Long, Long>>
    )

    suspend fun getStopwatchTime(): Long
    suspend fun getStopwatchState(): TimerState
    suspend fun getStopwatchLapList(): List<Pair<Long, Long>>
    suspend fun getStopwatchLastSystemTime(): Long
}
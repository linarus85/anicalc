package com.example.anicalc.data

import com.example.anicalc.ui.screen.calculator.CalculatorViewModel


interface CalculatorRepository {
    fun saveCalculator(
        operationsList: List<Pair<String, String>>,
        resultText: String,
        isExpanded: Boolean,
        isSecondary: Boolean,
        angleType: CalculatorViewModel.AngleType
    )

    suspend fun getOperationsList(): List<Pair<String, String>>
    suspend fun getResultText(): String
    suspend fun getIsExpanded(): Boolean
    suspend fun getIsSecondary(): Boolean
    suspend fun getAngleType(): CalculatorViewModel.AngleType
}
package com.mracipayam.calculatorwithjetpackcompose

data class CalculatorState(
    val number1 : String = "",
    val number2 : String = "",
    val operation: CalculationOperation? = null
)

package com.chriscanodev.romansarabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        romanToArabic("DIV")


    }

    private fun romanToArabic(s: String): Int {

        val userInput = s.uppercase()
        val result =  3

        val romanNumbArray = userInput.toCharArray()

        val arabicNumbArray: Array<Int> = arrayOf()
        // arabicNumbArray[romanNumbArray.size]

        println(romanNumbArray)
        println(arabicNumbArray)

        for (x in romanNumbArray) {

            val tempValue: Int = when (x) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> break
            }
            var arrayIndex = 0
            arabicNumbArray[arrayIndex] = tempValue
            arrayIndex++

            println(arabicNumbArray)

        }




        return result
    }



}
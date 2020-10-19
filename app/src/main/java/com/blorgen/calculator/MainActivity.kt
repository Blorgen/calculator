package com.blorgen.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var start = "0"
    var operator = "+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var resultNumber: Int = result.text.toString().toInt()

        button_plus.setOnClickListener {
            resultNumber += start.toInt()
            result.text = resultNumber.toString()
            start = "0"
            edit_text.text = start
            the_operator.text = "+"
        }
        button_minus.setOnClickListener {
            resultNumber -= start.toInt()
            result.text = resultNumber.toString()
            start = "0"
            edit_text.text = start
            the_operator.text = "-"
        }
        button_multiply.setOnClickListener {
            if(result.text == "0") {
                resultNumber = start.toInt()
            } else {
                resultNumber *= start.toInt()
            }
            result.text = resultNumber.toString()
            start = "0"
            edit_text.text = start
            the_operator.text = "*"
        }
        button_divide.setOnClickListener {
            if(result.text == "0") {
                resultNumber = start.toInt()
            } else {
                resultNumber /= start.toInt()
            }
            result.text = resultNumber.toString()
            start = "0"
            edit_text.text = start
            the_operator.text = "/"
        }
        button_0.setOnClickListener{
            addNum(0)
        }

        button_1.setOnClickListener{
            addNum(1)

        }
        button_2.setOnClickListener{
            addNum(2)

        }
        button_3.setOnClickListener{
            addNum(3)

        }
        button_4.setOnClickListener{
            addNum(4)

        }
        button_5.setOnClickListener{
            addNum(5)

        }
        button_6.setOnClickListener{
            addNum(6)

        }
        button_7.setOnClickListener{
            addNum(7)

        }
        button_8.setOnClickListener{
            addNum(8)

        }
        button_9.setOnClickListener{
            addNum(9)
        }
        button_clear.setOnClickListener{
            start = "0"
            edit_text.text = start
            resultNumber = 0
            result.text = resultNumber.toString()
        }
        button_del.setOnClickListener{
            if (start.length > 1){
                start = start.subSequence(0,start.length - 1).toString()
                edit_text.text = start
            } else {
                start = "0"
                edit_text.text = start
            }
        }
    }


    private fun addNum(number: Int) {
        if (start.length < 17){
            if (start[0].toString() == "0"){
                start = number.toString()
                edit_text.text = start
            } else {
                start = start.plus(number.toString())
                edit_text.text = start
            }
        }
    }

}
package com.example.android.testactivity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        summary.setOnClickListener {
            val cifra_1 = operand_1.text.toString()
            val cifra_2 = operand_2.text.toString()

            if ((cifra_1 == "" && cifra_2 == "") || (cifra_1 == "" || cifra_2 == ""))
                Snackbar.make(root_layout, "Данные не введены ", Snackbar.LENGTH_SHORT).show()
            else {
                val sum: Double = cifra_1.toDouble() + cifra_2.toDouble()

                result.text = sum.toString()
            }
        }

        subtraction.setOnClickListener {
            val cifra_1 = operand_1.text.toString()
            val cifra_2 = operand_2.text.toString()

            if ((cifra_1 == "" && cifra_2 == "") || (cifra_1 == "" || cifra_2 == ""))
                Snackbar.make(root_layout, "Данные не введены ", Snackbar.LENGTH_SHORT).show()
            else {
                val sum: Double = cifra_1.toDouble() - cifra_2.toDouble()

                result.text = sum.toString()
            }
        }

        multiplication.setOnClickListener {
            val cifra_1 = operand_1.text.toString()
            val cifra_2 = operand_2.text.toString()

            if ((cifra_1 == "" && cifra_2 == "") || (cifra_1 == "" || cifra_2 == ""))
                Snackbar.make(root_layout, "Данные не введены ", Snackbar.LENGTH_SHORT).show()
            else {
                val sum: Double = cifra_1.toDouble() * cifra_2.toDouble()

                result.text = sum.toString()
            }
        }

        division.setOnClickListener {
            val cifra_1 = operand_1.text.toString()
            val cifra_2 = operand_2.text.toString()

            if ((cifra_1 == "" && cifra_2 == "") || (cifra_1 == "" || cifra_2 == ""))
                Snackbar.make(root_layout, "Данные не введены ", Snackbar.LENGTH_SHORT).show()
            else
                if (cifra_2.toDouble() == 0.0) {
                    Snackbar.make(
                        root_layout,
                        "Второе число не может равняться 0, если вы хотите делить",
                        Snackbar.LENGTH_SHORT
                    ).show()
                } else {
                    val sum: Double = cifra_1.toDouble() / cifra_2.toDouble()
                    result.text = sum.toString()
                }

        }


    }
}


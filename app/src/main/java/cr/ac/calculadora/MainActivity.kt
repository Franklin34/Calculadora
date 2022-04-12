package cr.ac.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    var texto: TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expression = Expression("3*2")
        println(expression.calculate())

        val button0: Button = findViewById(R.id.button0)
        button0.setOnClickListener{buttonClick0()}

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener{buttonClick1()}

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener{buttonClick2()}

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener{buttonClick3()}

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener{buttonClick4()}

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener{buttonClick5()}

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener{buttonClick6()}

        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener{buttonClick7()}

        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener{buttonClick8()}

        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener{buttonClick9()}

        val buttonC: Button = findViewById(R.id.buttonC)
        buttonC.setOnClickListener{buttonClickC()}

        val buttonPorcentaje: Button = findViewById(R.id.buttonPorcentaje)
        buttonPorcentaje.setOnClickListener{buttonClickPorcentaje()}

        val buttonDivide: Button = findViewById(R.id.buttonDivide)
        buttonDivide.setOnClickListener{buttonClickDivide()}

        val buttonMultiplicar: Button = findViewById(R.id.buttonMultiplicar)
        buttonMultiplicar.setOnClickListener{buttonClickMultiplicar()}

        val buttonMenos: Button = findViewById(R.id.buttonMenos)
        buttonMenos.setOnClickListener{buttonClickMenos()}

        val buttonMas: Button = findViewById(R.id.buttonMas)
        buttonMas.setOnClickListener{buttonClickMas()}

        val buttonIgual: Button = findViewById(R.id.buttonIgual)
        buttonIgual.setOnClickListener{buttonClickIgual()}

        val buttonComa: Button = findViewById(R.id.buttonComa)
        buttonComa.setOnClickListener{buttonClickComa()}

        texto = findViewById(R.id.textoInicio)
    }

    private fun buttonClickComa() {
        if(texto?.text.toString() == "0"){
            return
        }
        texto?.setText(texto?.text.toString() + ".")
    }

    private fun buttonClickIgual() {
        val expression = Expression(texto?.text.toString())
        texto?.setText(expression.calculate().toString())
    }

    private fun buttonClickMas() {
        if(texto?.text.toString() == "0"){
            return
        }
        texto?.setText(texto?.text.toString() + "+")
    }

    private fun buttonClickMenos() {
        if(texto?.text.toString() == "0"){
            return
        }
        texto?.setText(texto?.text.toString() + "-")
    }

    private fun buttonClickMultiplicar() {
        if(texto?.text.toString() == "0"){
            return
        }
        texto?.setText(texto?.text.toString() + "*")
    }

    private fun buttonClickDivide() {
        if(texto?.text.toString() == "0"){
            return
        }
        texto?.setText(texto?.text.toString() + "/")
    }

    private fun buttonClickPorcentaje() {
        if(texto?.text.toString() == "0"){
            return
        }
        texto?.setText(texto?.text.toString() + "%")
    }

    private fun buttonClickC() {
        texto?.setText("0")
    }

    private fun buttonClick9() {
        if(texto?.text.toString() == "0"){
            texto?.text = ""
        }
        texto?.setText(texto?.text.toString() + "9")
    }

    private fun buttonClick8() {
        if(texto?.text.toString() == "0"){
            texto?.text = ""
        }
        texto?.setText(texto?.text.toString() + "8")
    }

    private fun buttonClick7() {
        if(texto?.text.toString() == "0"){
            texto?.text = ""
        }
        texto?.setText(texto?.text.toString() + "7")
    }

    private fun buttonClick6() {
        if(texto?.text.toString() == "0"){
            texto?.text = ""
        }
        texto?.setText(texto?.text.toString() + "6")
    }

    private fun buttonClick5() {
        if(texto?.text.toString() == "0"){
            texto?.text = ""
        }
        texto?.setText(texto?.text.toString() + "5")
    }

    private fun buttonClick4() {
        if(texto?.text.toString() == "0"){
            texto?.text = ""
        }
        texto?.setText(texto?.text.toString() + "4")
    }

    private fun buttonClick3() {
        if(texto?.text.toString() == "0"){
            texto?.text = ""
        }
        texto?.setText(texto?.text.toString() + "3")
    }

    private fun buttonClick2() {
        if(texto?.text.toString() == "0"){
            texto?.text = ""
        }
        texto?.setText(texto?.text.toString() + "2")
    }

    private fun buttonClick1() {
        if(texto?.text.toString() == "0"){
            texto?.text = ""
        }
        texto?.setText(texto?.text.toString() + "1")
    }

    private fun buttonClick0() {
        if(texto?.text.toString() == "0"){
            texto?.text = ""
        }
        texto?.setText(texto?.text.toString() + "0")
    }
}
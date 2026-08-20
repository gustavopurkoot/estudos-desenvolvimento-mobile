package com.example.aula5

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.aula5.ui.theme.Aula5Theme
import androidx.compose.foundation.shape.RoundedCornerShape

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Aula5Theme {
                //MinhaTela()
                //Formulario()
                QuatroQuadrados()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!"
    )
}

@Composable
fun GreetingPreview() {
    Aula5Theme {
        Greeting("Mundo!")
    }
}

@Composable
fun MinhaTela() {
    var contador by remember { mutableStateOf(0) }

    Column {
        Text("Contagem: $contador")

        Button(
            onClick = {
                contador++
                Log.d("A", "Apertou o botão - $contador")
            }
        ) {
            Text("APERTE AQUI")
        }
    }
}

@Composable
fun Formulario() {

    var nome by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0A1F44)),
        shape = RoundedCornerShape(100.dp)
    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(" - CADASTRO - ")

            TextField(
                value = nome,
                onValueChange = { nome = it },
                placeholder = {
                    Text("Nome:")
                }
            )

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = email,
                onValueChange = { email = it },
                placeholder = {
                    Text("Email:")
                }
            )

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            TextField(
                value = telefone,
                onValueChange = { telefone = it },
                placeholder = {
                    Text("Telefone:")
                }
            )

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Button(
                onClick = {
                    Log.d("FORMULARIO", "Nome: $nome")
                    Log.d("FORMULARIO", "Email: $email")
                    Log.d("FORMULARIO", "Telefone: $telefone")
                }
            ) {
                Text("Enviar")
            }
        }
    }
}

fun mudarCorETamanho(): Pair<Color, Dp> {

    val cores = listOf(
        Color.Red,
        Color.Blue,
        Color.Green,
        Color.Yellow,
        Color.Magenta,
        Color.Cyan
    )

    val novaCor = cores.random()
    val novoTamanho = (50..150).random().dp

    return Pair(novaCor, novoTamanho)
}

@Composable
fun Quadrado() {

    var cor by remember {
        mutableStateOf(Color.Gray)
    }

    var tamanho by remember {
        mutableStateOf(90.dp)
    }

    Box(
        modifier = Modifier
            .size(tamanho)
            .background(cor)
            .clickable {

                val (novaCor, novoTamanho) = mudarCorETamanho()

                cor = novaCor
                tamanho = novoTamanho
            }
    )
}

@Preview(showBackground = true)
@Composable
fun QuatroQuadrados() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row {

            Quadrado()

            Spacer(
                modifier = Modifier.width(8.dp)
            )

            Quadrado()
        }

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        Row {

            Quadrado()

            Spacer(
                modifier = Modifier.width(8.dp)
            )

            Quadrado()
        }
    }
}
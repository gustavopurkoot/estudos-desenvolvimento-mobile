package com.example.aula4

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.example.aula4.ui.theme.Aula4Theme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Aula4Theme {
                //MinhaTela()
                Formulario()
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aula4Theme {
        Greeting("Mundo!")
    }
}

@Preview(showBackground = true)
@Composable
fun MinhaTela() {
    var contador by remember {mutableStateOf(0)}
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


@Preview(showBackground = true)
@Composable
fun Formulario() {

    var nome by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column {
        Text(" - CADASTRO - ")

        TextField(
            value = nome,
            onValueChange = { nome = it },
            placeholder = { Text("Nome:") }
        )

        TextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Email:") }
        )

        Button(
            onClick = {
                Log.d("FORMULÁRIO", "Nome: $nome")
                Log.d("FORMULARIO", "Email: $email")
            }
        ) {
            Text("Enviar")
        }
    }
}
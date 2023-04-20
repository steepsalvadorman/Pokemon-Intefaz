package com.example.tareaulima.ui.login.uis

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.tareaulima.R


@Preview
@Composable
fun PokemonScreenPreview(){
    PokemonScreen()
}





@OptIn(ExperimentalCoilApi::class)
@Composable
fun PokemonScreen(){

    val customColor = remember { mutableStateOf(Color(0xFFF37021)) }

    Column(
        modifier = Modifier  //Todo empieza desde una columna que ocupa toda la pantalla
            .fillMaxSize()
    ) {
        Row {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(top = 8.dp), //Columna de la pokedex
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,

            ) {
                Image(painter = painterResource(id = R.drawable.pokedex),
                    contentDescription = "Logo Pokedex",
                    modifier = Modifier
                        .size(50.dp)

                )
                Text(
                    modifier = Modifier
                        .padding(top = 8.dp),
                    text = "Pokedex",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    )
                )

            }
            Column(modifier = Modifier
                .weight(1f)
                .padding(top = 8.dp), //Columna de Publicaciones
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,)
            {
                Text(text = "52",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                )

                Text(text = "Publicaciones",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 14.sp
                    )

                )
            }
            Column(modifier = Modifier
                .weight(1f)
                .padding(top = 8.dp), //Columna de seguidos
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,)
            {
                Text(text = "52",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                )

                Text(text = "Seguidos",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                    )
            }
            Column(modifier = Modifier
                .weight(1f)
                .padding(top = 8.dp), //Columna de seguidores
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,)
            {
                Text(text = "52",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                )

                Text(text = "Seguidores",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                    )
            }

            }

        Row(
            modifier = Modifier.fillMaxWidth(), //Columna que ocupa todo el ancho
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Button(
                onClick = {}, //Primer boton Editar perfil
                modifier = Modifier
                    .padding(top = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = customColor.value
                )

            ) {
                Text(text = "Editar Perfil",
                    textAlign = TextAlign.Center,
                    color = if (isSystemInDarkTheme()) Color.White else Color.Black
                )

            }
            Button(
                onClick = {}, //Segundo Boton Compartir Perfil
                modifier = Modifier
                    .padding(top = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = customColor.value
                )

            ) {
                Text(text = "Compartir Perfil",
                    textAlign = TextAlign.Center,
                    color = if (isSystemInDarkTheme()) Color.White else Color.Black)

            }

            Button(
                onClick = {}, // Tercer boton de imagen
                modifier = Modifier
                    .padding(top = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = customColor.value
                )
            ) {

                Box(
                    contentAlignment = Alignment.Center // Lo colocamos en un box para centrar
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.user),
                        contentDescription = "Logo usuario",
                        modifier = Modifier
                            .size(25.dp),
                        colorFilter = ColorFilter.tint(
                            color = if (isSystemInDarkTheme()) Color.White else Color.Black
                        )

                    )

                }
                
            }


        }
        
        Column {
            
            Text(text = "Historias Destacadas",
            modifier = Modifier
                .padding(start = 8.dp, top = 8.dp),
                style = TextStyle(
                    fontWeight = FontWeight.Bold
                ))
            Text(text = "Guarda tus historias favoritas en el perfil",
            modifier = Modifier
                .padding(start = 8.dp))

                }
        
        Row {
            Column( // Columna que va a contener al + y el texto Nueva
                modifier = Modifier
                   .padding(top = 8.dp, start = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(painter = painterResource(id = R.drawable.add),
                    contentDescription = "Logo Agregar",
                    modifier = Modifier
                        .size(80.dp),
                    colorFilter = ColorFilter.tint(
                        color = if (isSystemInDarkTheme()) Color.White else Color.Black
                    )

                )
                Text(modifier = Modifier
                    .padding(top = 8.dp),
                    text = "Nueva")
            }
        }

        Column {
            for (i in 1..5) { //Algoritmo que sirve para poner cinco filas y tres columnas de pokemon
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    for (j in 1..3) {
                        val number = (i - 1) * 3 + j
                        Image(
                            painter = rememberImagePainter(
                                data = String.format("https://pokefanaticos.com/pokedex/assets/images/pokemon_imagenes/%d.png", number)
                            ),
                            contentDescription = "Foto Pokemones",
                            modifier = Modifier
                                .size(80.dp)
                                .padding(end = 10.dp),

                        )
                    }
                }
            }
        }



    }
}
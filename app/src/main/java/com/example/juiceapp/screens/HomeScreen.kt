package com.example.juiceapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.juiceapp.R

@Composable
fun HomeScreen() {
    var input by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            color = Color(0xffF0828B),
            shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp)
                        .padding(vertical = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextField(
                        value = input,
                        onValueChange = { input = it },
                        shape = RoundedCornerShape(15.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White,
                            disabledContainerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                        ),
                        placeholder = {
                            Text("Search juice name")
                        }
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Box(
                        modifier = Modifier
                            .background(
                                shape = RoundedCornerShape(12.dp),
                                color = Color.White.copy(0.5f)
                            )
                    ) {
                        IconButton(
                            onClick = {}
                        ) {
                            Icon(
                                Icons.Default.MoreVert,
                                contentDescription = null,
                                tint = Color.White,
                            )
                        }
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(10.dp)
                            ),
                        contentAlignment = Alignment.Center,

                        ) {
                        Image(
                            painterResource(R.drawable.avocado),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(10.dp)
                            ),
                        contentAlignment = Alignment.Center,

                        ) {
                        Image(
                            painterResource(R.drawable.cherry),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(10.dp)
                            ),
                        contentAlignment = Alignment.Center,

                        ) {
                        Image(
                            painterResource(R.drawable.apple),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(10.dp)
                            ),
                        contentAlignment = Alignment.Center,

                        ) {
                        Image(
                            painterResource(R.drawable.grape),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(10.dp)
                            ),
                        contentAlignment = Alignment.Center,

                        ) {
                        Image(
                            painterResource(R.drawable.banana),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp)
                        )
                    }

                }
            }
        }

        LazyColumn {
            item {

                Spacer(modifier = Modifier.padding(vertical = 12.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            "Monster Juice",
                            color = Color.Black,
                            fontSize = 26.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.padding(vertical = 4.dp))
                        Text(
                            "Apple juice meetha hota hai.",
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.padding(vertical = 4.dp))
                        Text(
                            "Yeh seb se banta hai.",
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(
                                "₹98.69",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = FontFamily.Serif
                            )

                            Box(
                                modifier = Modifier
                                    .height(45.dp)
                                    .width(100.dp)
                                    .background(
                                        color = Color(0xffF0828B),
                                        shape = RoundedCornerShape(12.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    Text(
                                        "-",
                                        fontSize = 40.sp,
                                        color = Color.White,
                                        modifier = Modifier.padding()
                                    )
                                    Text(
                                        "0",
                                        fontSize = 35.sp,
                                        color = Color.White
                                    )
                                    Text(
                                        "+",
                                        fontSize = 40.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }
                    }
                    Card(
                        modifier = Modifier.size(150.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xffF0828B)
                        ),
                        shape = RoundedCornerShape(25.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painterResource(R.drawable.monsterjuice),
                                contentDescription = null,
                                modifier = Modifier.size(100.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.padding(vertical = 10.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            "Lemon Juice",
                            color = Color.Black,
                            fontSize = 26.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.padding(vertical = 4.dp))
                        Text(
                            "Apple juice meetha hota hai.",
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.padding(vertical = 4.dp))
                        Text(
                            "Yeh seb se banta hai.",
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(
                                "₹98.69",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = FontFamily.Serif
                            )

                            Box(
                                modifier = Modifier
                                    .height(45.dp)
                                    .width(100.dp)
                                    .background(
                                        color = Color(0xfff2d1f0),
                                        shape = RoundedCornerShape(12.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    Text(
                                        "-",
                                        fontSize = 40.sp,
                                        color = Color.White,
                                        modifier = Modifier.padding()
                                    )
                                    Text(
                                        "0",
                                        fontSize = 35.sp,
                                        color = Color.White
                                    )
                                    Text(
                                        "+",
                                        fontSize = 40.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }
                    }
                    Card(
                        modifier = Modifier.size(150.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xffE5B8D0)
                        ),
                        shape = RoundedCornerShape(25.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painterResource(R.drawable.lemonjuice),
                                contentDescription = null,
                                modifier = Modifier.size(120.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.padding(vertical = 10.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            "Guava Juice",
                            color = Color.Black,
                            fontSize = 26.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.padding(vertical = 4.dp))
                        Text(
                            "Apple juice meetha hota hai.",
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.padding(vertical = 4.dp))
                        Text(
                            "Yeh seb se banta hai.",
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(
                                "₹98.69",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = FontFamily.Serif
                            )
                            Box(
                                modifier = Modifier
                                    .height(45.dp)
                                    .width(100.dp)
                                    .background(
                                        color = Color(0xffF0828B),
                                        shape = RoundedCornerShape(12.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    Text(
                                        "-",
                                        fontSize = 40.sp,
                                        color = Color.White,
                                        modifier = Modifier.padding()
                                    )
                                    Text(
                                        "0",
                                        fontSize = 35.sp,
                                        color = Color.White
                                    )
                                    Text(
                                        "+",
                                        fontSize = 40.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }
                    }
                    Card(
                        modifier = Modifier.size(150.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xfff2d1f0)
                        ),
                        shape = RoundedCornerShape(25.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painterResource(R.drawable.guavajuice),
                                contentDescription = null,
                                modifier = Modifier.size(120.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.padding(vertical = 10.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            "Pomegranate Juice",
                            color = Color.Black,
                            fontSize = 26.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(modifier = Modifier.padding(vertical = 4.dp))
                        Text(
                            "Apple juice meetha hota hai.",
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.padding(vertical = 4.dp))
                        Text(
                            "Yeh seb se banta hai.",
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(
                                "₹98.69",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = FontFamily.Serif
                            )
                            Box(
                                modifier = Modifier
                                    .height(45.dp)
                                    .width(100.dp)
                                    .background(
                                        color = Color(0xffF0828B),
                                        shape = RoundedCornerShape(12.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    Text(
                                        "-",
                                        fontSize = 40.sp,
                                        color = Color.White,
                                        modifier = Modifier.padding()
                                    )
                                    Text(
                                        "0",
                                        fontSize = 35.sp,
                                        color = Color.White
                                    )
                                    Text(
                                        "+",
                                        fontSize = 40.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }
                    }
                    Card(
                        modifier = Modifier.size(150.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xffFf9ea8)
                        ),
                        shape = RoundedCornerShape(25.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painterResource(R.drawable.pomegranatejuice),
                                contentDescription = null,
                                modifier = Modifier.size(120.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
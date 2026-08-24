package com.astra.studio

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(open:()->Unit){
 Button(onClick=open){ Text("✦ ASTRA Studio Pro - Новый проект") }
}

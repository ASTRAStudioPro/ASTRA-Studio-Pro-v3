package com.astra.studio

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*

@Composable
fun AstraApp(){
 val nav = rememberNavController()
 NavHost(nav, startDestination="home"){
  composable("home"){ HomeScreen{ nav.navigate("editor") } }
  composable("editor"){ EditorScreen() }
 }
}

package com.ajayvamsee.jetpackcompose

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import javax.sql.StatementEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          MessageCard( Meg("Android","data"))
        }
    }
}

data class Meg(val name:String, val name2:String )

@Composable
fun MessageCard(msg :Meg){
    Row (modifier = Modifier.padding(all = 8.dp)){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Image",
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
        )
        
        Spacer(modifier = Modifier.width(8.dp))
    }
    Column {
        Text(text = msg.name)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = msg.name2)
    }

}

@Preview
@Composable
fun MessageCardPreview(){
    MessageCard(msg = Meg("Ajay","Vamsee"))
}


package com.example.firstcompose.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcompose.R


@Preview(heightDp = 700)
@Composable
fun PreviewItem(){
    LazyColumn(content = {
        items(getCategoryList()){item->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    })

}
@Composable
fun BlogCategory(img:Int,title:String,subtitle:String){
    Card (elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(8.dp)) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ){
            Image(painter = painterResource(img),
                contentDescription ="",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle,Modifier.weight(.8f))
        }

    }

}

@Composable
private fun ItemDescription(title: String, subtitle: String,modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodySmall
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold
        )
    }
}

data class Category(val img:Int,val title:String,val subtitle: String)

fun getCategoryList():MutableList<Category>{

    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))
    list.add(Category(R.drawable.man,"Android","Learn JetPeck Compose"))
    list.add(Category(R.drawable.men2,"Technology","News About New Tech"))
    list.add(Category(R.drawable.download,"Full stack Development","From Backend to Frontend"))
    list.add(Category(R.drawable.boy,"DevOps","Deployment, CI, CD etc, "))
    list.add(Category(R.drawable.user,"AI & ML","BAsic Artificial Intelligence"))

    return list
}

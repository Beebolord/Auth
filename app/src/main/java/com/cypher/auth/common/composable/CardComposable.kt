package com.cypher.auth.common.composable

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@ExperimentalMaterialApi
@Composable
fun DangerousCardEditor(
    @StringRes title : Int,
    @DrawableRes icon : Int,
    content : String,
    modifier : Modifier,
    onEditClick : () -> Unit
) {
    CardEditor(title, icon, content, onEditClick, colors.primary, modifier)
}


@ExperimentalMaterialApi
@Composable
fun RegularCardEditor(
    @StringRes title : Int,
    @DrawableRes icon : Int,
    content : String,
    modifier : Modifier,
    onEditClick : () -> Unit
) {
    CardEditor(title, icon, content, onEditClick, colors.onSurface, modifier)
}


@ExperimentalMaterialApi
@Composable
fun CardEditor(
    @StringRes title : Int,
    @DrawableRes icon : Int,
    content : String,
    modifier : Modifier,
    onEditClick : () -> Unit,
    highlightColor : Color,
) {
   Card(backgroundColor = MaterialTheme.colors.onPrimary, modifier = Modifier, onClick = onEditClick) {
       Row(
           verticalAlignment = Alignment.CenterVertically,
           modifier = Modifier.fillMaxSize().padding(16.dp)
       ) {
           Column(modifier = Modifier.weight(1f)) {
               Text(stringResource(title), color = highlightColor)
           }
           if(content.isNotBlank())
           {
           Text(text = content, modifier.padding(16.dp, 0.dp))
           }

           Icon(painter = painterResource(icon),
               contentDescription = "icon",
               tint = highlightColor
           )
       }
   }
}


@Composable
@ExperimentalMaterialApi
fun CardSelector(
    @StringRes label : Int,
    options : List<String>,
    selection : String,
    modifier : Modifier,
    onNewValue : (String) -> Unit
) {
    Card(backgroundColor = MaterialTheme.colors.onPrimary, modifier = Modifier) {
        DropdownSelector(label, options, selection, modifier.dropdownSelector())
    }
}
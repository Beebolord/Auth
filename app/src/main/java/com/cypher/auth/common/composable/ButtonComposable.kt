package com.cypher.auth.common.composable

import androidx.annotation.StringRes
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp

@Composable
fun BasicTextButton(@StringRes text : Int, modifier: Modifier, action : () ->Unit) {
    TextButton(onClick = action, modifier = modifier) {
        Text(text = stringResource(text))
    }
}

@Composable
fun BasicButton(@StringRes text: Int, modifier : Modifier, action:() -> Unit) {
    Button(
        onClick = action,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = androidx.compose.material.MaterialTheme.colors.primary,
            contentColor = MaterialTheme.colors.onPrimary
        )
    ) {
        Text(text = stringResource(text), fontSize = 16.sp)
    }
}

@Composable
fun DialogComfirmButton(@StringRes text : Int, action:() -> Unit) {
    Button(
        onClick = action,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = androidx.compose.material.MaterialTheme.colors.primary,
            contentColor = androidx.compose.material.MaterialTheme.colors.onPrimary
        )
    ) {
        Text(text = stringResource(text))
    }
}


@Composable
fun DialogCancelButton(@StringRes text : Int, action:() -> Unit) {
    Button(
        onClick = action,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = androidx.compose.material.MaterialTheme.colors.primary,
            contentColor = androidx.compose.material.MaterialTheme.colors.onPrimary
        )
    ) {
        Text(text = stringResource(text))
    }
}
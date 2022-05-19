package com.cypher.auth.common.composable

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun BasicToolBar(@StringRes title :Int) {
    TopAppBar(
        title = {Text(stringResource(id = title))},
        backgroundColor = toolbarColor()
    )
}


@Composable
fun ActionToolBar(
    @StringRes title :Int,
    @DrawableRes endActionIcon :Int,
    modifier : Modifier,
    endAction : () -> Unit) {
    TopAppBar(
        title = {Text(stringResource(id = title))},
        backgroundColor = toolbarColor(),
        actions = {
            Box(modifier) {
                IconButton(onClick = endAction) {
                    Icon(painter = painterResource(endActionIcon), contentDescription = "Action")
                }
            }
        }
    )
}


@Composable
private fun toolbarColor(darkTheme : Boolean = isSystemInDarkTheme()) : Color {
    return if (darkTheme) MaterialTheme.colors.secondary else  MaterialTheme.colors.primaryVariant
}

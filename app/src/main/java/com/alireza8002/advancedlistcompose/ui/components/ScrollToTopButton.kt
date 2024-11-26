package com.alireza8002.advancedlistcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * Scroll to top button.
 * @param onClick is a callback for when the button clicked by user.
 * */

@Composable
fun ScrollToTopButton(onClick: () -> Unit) {
    IconButton(onClick = onClick, modifier = Modifier.background(Color.White, CircleShape)) {
        Icon(
            imageVector = Icons.Filled.KeyboardArrowUp,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary
        )
    }
}
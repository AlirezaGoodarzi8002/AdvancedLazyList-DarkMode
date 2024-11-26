package com.alireza8002.advancedlistcompose.ui.screens

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alireza8002.advancedlistcompose.R
import com.alireza8002.advancedlistcompose.data.model.Product.Companion.getProducts
import com.alireza8002.advancedlistcompose.data.model.Story.Companion.getStories
import com.alireza8002.advancedlistcompose.ui.components.ProductItem
import com.alireza8002.advancedlistcompose.ui.components.ScrollToTopButton
import com.alireza8002.advancedlistcompose.ui.components.StoryItem
import com.alireza8002.advancedlistcompose.ui.theme.AdvancedListComposeTheme
import kotlinx.coroutines.launch

const val TAG = "ProductsScreen"

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductsScreen(isDarkTheme: MutableState<Boolean> = mutableStateOf(false)) {
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.app_name)) },
                colors = TopAppBarDefaults.topAppBarColors()
                    .copy(containerColor = MaterialTheme.colorScheme.inversePrimary),
                actions = {
                    Icon(
                        painter = painterResource(
                            if (isDarkTheme.value) R.drawable.ic_sun else R.drawable.ic_moon
                        ),
                        null,
                        tint = if (isDarkTheme.value) Color.Yellow else Color.Blue,
                        modifier = Modifier
                            .clickable { isDarkTheme.value = !isDarkTheme.value }
                            .size(24.dp)
                    )
                }
            )
        },
        containerColor = MaterialTheme.colorScheme.surface
    ) { contentPadding ->
        Box(modifier = Modifier.padding(contentPadding)) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Stories()

                Spacer(modifier = Modifier.height(4.dp))

                Products(listState)
            }

            val showScrollUpButton by remember {
                derivedStateOf { listState.firstVisibleItemIndex > 0 }
            }
            AnimatedVisibility(
                visible = showScrollUpButton,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 24.dp)
            ) { ScrollToTopButton { coroutineScope.launch { listState.animateScrollToItem(0) } } }
        }
    }
}

/**
 * List of stories composable.
 * */

@Composable
private fun Stories() {
    val stories = remember { getStories() }
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(stories, key = { it.id }) { story -> StoryItem(story = story) }
    }
}

/**
 * List of products composable.
 * */

@Composable
private fun Products(listState: LazyListState) {
    val products = remember { getProducts().sortedBy { it.priority } }
    LazyColumn(state = listState) {
        items(products, key = { it.id }) {
            ProductItem(it) { Log.d(TAG, "clicked on ${it.name}.") }
        }
    }
}

@Preview
@Composable
fun PreviewProductScreen() {
    AdvancedListComposeTheme {
        ProductsScreen()
    }
}
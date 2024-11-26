package com.alireza8002.advancedlistcompose.data.model

import androidx.annotation.DrawableRes
import com.alireza8002.advancedlistcompose.R
import java.util.UUID

data class Story(val name: String, @DrawableRes val image: Int) {

    /**
     * @param id is a unique identifier for each product
     * Id is generated using the UUID library and it defined in class body to avoid initializing
     * value outside the class.
     * */

    val id: String = UUID.randomUUID().toString()

    companion object {
        fun getStories() = listOf(
            Story(name = "Alice", image = R.drawable.image_alice),
            Story(name = "Bob", image = R.drawable.image_bob),
            Story(name = "Charlie", image = R.drawable.image_charlie),
            Story(name = "Diana", image = R.drawable.image_diana),
            Story(name = "Eve", image = R.drawable.image_eve),
            Story(name = "Frank", image = R.drawable.image_frank),
            Story(name = "Grace", image = R.drawable.image_grace),
            Story(name = "Henry", image = R.drawable.image_henry),
            Story(name = "Alice", image = R.drawable.image_alice),
            Story(name = "Bob", image = R.drawable.image_bob),
            Story(name = "Charlie", image = R.drawable.image_charlie),
            Story(name = "Diana", image = R.drawable.image_diana),
            Story(name = "Eve", image = R.drawable.image_eve),
            Story(name = "Frank", image = R.drawable.image_frank),
            Story(name = "Grace", image = R.drawable.image_grace),
            Story(name = "Henry", image = R.drawable.image_henry),
            Story(name = "Alice", image = R.drawable.image_alice),
            Story(name = "Bob", image = R.drawable.image_bob),
            Story(name = "Charlie", image = R.drawable.image_charlie),
            Story(name = "Diana", image = R.drawable.image_diana),
            Story(name = "Eve", image = R.drawable.image_eve),
            Story(name = "Frank", image = R.drawable.image_frank),
            Story(name = "Grace", image = R.drawable.image_grace),
            Story(name = "Henry", image = R.drawable.image_henry),
            Story(name = "Eve", image = R.drawable.image_eve),
            Story(name = "Frank", image = R.drawable.image_frank),
            Story(name = "Grace", image = R.drawable.image_grace),
            Story(name = "Henry", image = R.drawable.image_henry),
            Story(name = "Eve", image = R.drawable.image_eve),
            Story(name = "Frank", image = R.drawable.image_frank),
            Story(name = "Grace", image = R.drawable.image_grace),
            Story(name = "Henry", image = R.drawable.image_henry)
        )
    }
}

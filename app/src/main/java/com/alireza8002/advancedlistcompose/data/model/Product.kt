package com.alireza8002.advancedlistcompose.data.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.alireza8002.advancedlistcompose.R
import java.util.UUID

private var mPriority = Product.getProducts().size

data class Product(
    val name: String, val description: String, val cost: Int, @DrawableRes val image: Int
) {

    /**
     * @param id is a unique identifier for each product
     * Id is generated using the UUID library and it defined in class body to avoid initializing
     * value outside the class.
     * */
    val id: String = UUID.randomUUID().toString()

    /**
     * true if the product is selected, false otherwise.
     * */
    private val _isSelected: MutableState<Boolean> = mutableStateOf(false)
    val isSelected get() = _isSelected.value

    /**
     * The priority of the product.
     * */
    val priority: Int = mPriority--

    /**
     * Opposite the state of the product selection.
     * */
    fun toggle() {
        _isSelected.value = !_isSelected.value
    }

    //fake list object
    companion object {
        fun getProducts() = listOf(
            Product(
                name = "Laptop",
                description = "High-performance laptop for professionals.",
                cost = 1500,
                image = R.drawable.image_laptop
            ),
            Product(
                name = "Smartphone",
                description = "Latest model with stunning features.",
                cost = 999,
                image = R.drawable.image_smartphone
            ),
            Product(
                name = "Tablet",
                description = "Portable and powerful device for multitasking.",
                cost = 700,
                image = R.drawable.image_tablet
            ),
            Product(
                name = "Smartwatch",
                description = "Track your health and stay connected.",
                cost = 250,
                image = R.drawable.image_smartwatch
            ),
            Product(
                name = "Headphones",
                description = "Noise-cancelling wireless headphones.",
                cost = 200,
                image = R.drawable.image_headphone
            ),
            Product(
                name = "Camera",
                description = "Capture your moments with clarity.",
                cost = 1200,
                image = R.drawable.image_camera
            ),
            Product(
                name = "Laptop",
                description = "High-performance laptop for professionals.",
                cost = 1500,
                image = R.drawable.image_laptop
            ),
            Product(
                name = "Smartphone",
                description = "Latest model with stunning features.",
                cost = 999,
                image = R.drawable.image_smartphone
            ),
            Product(
                name = "Tablet",
                description = "Portable and powerful device for multitasking.",
                cost = 700,
                image = R.drawable.image_tablet
            ),
            Product(
                name = "Smartwatch",
                description = "Track your health and stay connected.",
                cost = 250,
                image = R.drawable.image_smartwatch
            ),
            Product(
                name = "Headphones",
                description = "Noise-cancelling wireless headphones.",
                cost = 200,
                image = R.drawable.image_headphone
            ),
            Product(
                name = "Camera",
                description = "Capture your moments with clarity.",
                cost = 1200,
                image = R.drawable.image_camera
            ),
            Product(
                name = "Laptop",
                description = "High-performance laptop for professionals.",
                cost = 1500,
                image = R.drawable.image_laptop
            ),
            Product(
                name = "Smartphone",
                description = "Latest model with stunning features.",
                cost = 999,
                image = R.drawable.image_smartphone
            ),
            Product(
                name = "Tablet",
                description = "Portable and powerful device for multitasking.",
                cost = 700,
                image = R.drawable.image_tablet
            ),
            Product(
                name = "Smartwatch",
                description = "Track your health and stay connected.",
                cost = 250,
                image = R.drawable.image_smartwatch
            ),
            Product(
                name = "Headphones",
                description = "Noise-cancelling wireless headphones.",
                cost = 200,
                image = R.drawable.image_headphone
            ),
            Product(
                name = "Camera",
                description = "Capture your moments with clarity.",
                cost = 1200,
                image = R.drawable.image_camera
            ),
            Product(
                name = "Laptop",
                description = "High-performance laptop for professionals.",
                cost = 1500,
                image = R.drawable.image_laptop
            ),
            Product(
                name = "Smartphone",
                description = "Latest model with stunning features.",
                cost = 999,
                image = R.drawable.image_smartphone
            ),
            Product(
                name = "Tablet",
                description = "Portable and powerful device for multitasking.",
                cost = 700,
                image = R.drawable.image_tablet
            ),
            Product(
                name = "Smartwatch",
                description = "Track your health and stay connected.",
                cost = 250,
                image = R.drawable.image_smartwatch
            ),
            Product(
                name = "Headphones",
                description = "Noise-cancelling wireless headphones.",
                cost = 200,
                image = R.drawable.image_headphone
            ),
            Product(
                name = "Camera",
                description = "Capture your moments with clarity.",
                cost = 1200,
                image = R.drawable.image_camera
            ),
            Product(
                name = "Laptop",
                description = "High-performance laptop for professionals.",
                cost = 1500,
                image = R.drawable.image_laptop
            ),
            Product(
                name = "Smartphone",
                description = "Latest model with stunning features.",
                cost = 999,
                image = R.drawable.image_smartphone
            ),
            Product(
                name = "Tablet",
                description = "Portable and powerful device for multitasking.",
                cost = 700,
                image = R.drawable.image_tablet
            ),
            Product(
                name = "Smartwatch",
                description = "Track your health and stay connected.",
                cost = 250,
                image = R.drawable.image_smartwatch
            ),
            Product(
                name = "Headphones",
                description = "Noise-cancelling wireless headphones.",
                cost = 200,
                image = R.drawable.image_headphone
            ),
            Product(
                name = "Camera",
                description = "Capture your moments with clarity.",
                cost = 1200,
                image = R.drawable.image_camera
            ),
            Product(
                name = "Laptop",
                description = "High-performance laptop for professionals.",
                cost = 1500,
                image = R.drawable.image_laptop
            ),
            Product(
                name = "Smartphone",
                description = "Latest model with stunning features.",
                cost = 999,
                image = R.drawable.image_smartphone
            ),
            Product(
                name = "Tablet",
                description = "Portable and powerful device for multitasking.",
                cost = 700,
                image = R.drawable.image_tablet
            ),
            Product(
                name = "Smartwatch",
                description = "Track your health and stay connected.",
                cost = 250,
                image = R.drawable.image_smartwatch
            ),
            Product(
                name = "Headphones",
                description = "Noise-cancelling wireless headphones.",
                cost = 200,
                image = R.drawable.image_headphone
            ),
            Product(
                name = "Camera",
                description = "Capture your moments with clarity.",
                cost = 1200,
                image = R.drawable.image_camera
            )
        )
    }
}
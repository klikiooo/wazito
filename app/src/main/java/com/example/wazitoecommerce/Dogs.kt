package com.example.wazitoecommerce

import com.google.firebase.firestore.Exclude

data class Dogs(
    @Exclude var courseID: String? = "",
    var dogName: String? = "",
    var dogBreed: String? = "",
    var dogAge: String? = ""
)

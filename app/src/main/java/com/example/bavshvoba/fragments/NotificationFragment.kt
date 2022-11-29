package com.example.bavshvoba.fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.fragments.R

class NotificationFragment  :Fragment(R.layout.fragment_notification){
    private lateinit var image: ImageView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        image = view.findViewById(R.id.imageView)


    }

}

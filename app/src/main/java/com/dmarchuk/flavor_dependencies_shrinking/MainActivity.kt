package com.dmarchuk.flavor_dependencies_shrinking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SomeApiImpl().loadUsers()
        SomeApiImpl().loadArtists()
        SomeApiImpl().loadPlaylist()
    }
}

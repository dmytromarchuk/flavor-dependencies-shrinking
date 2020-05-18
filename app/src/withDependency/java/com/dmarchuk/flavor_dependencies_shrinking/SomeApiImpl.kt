package com.dmarchuk.flavor_dependencies_shrinking

import com.squareup.picasso.Picasso
import dev.b3nedikt.app_locale.AppLocale
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import java.util.Locale

class SomeApiImpl : SomeApi {
    override fun loadUsers() {
        Observable.just(1, 2, 3)
            .map { it * it }
        Picasso.get()
            .load("google.com")
            .resize(50, 50)
            .centerCrop()
    }

    override fun loadPlaylist() {
        Single.just(listOf(1, 2, 3))
        AppLocale.supportedLocales = listOf(Locale.ENGLISH, Locale.FRENCH)
    }

    override fun loadArtists() {
        Maybe.empty<String>()
    }
}
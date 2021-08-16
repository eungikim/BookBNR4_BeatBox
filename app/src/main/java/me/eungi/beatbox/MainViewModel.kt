package me.eungi.beatbox

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var beatBox: BeatBox? = null

    override fun onCleared() {
        super.onCleared()
        beatBox?.release()
    }
}
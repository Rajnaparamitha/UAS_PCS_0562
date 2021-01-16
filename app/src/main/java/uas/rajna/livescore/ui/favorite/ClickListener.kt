package uas.rajna.livescore.ui.favorite

import uas.rajna.livescore.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}
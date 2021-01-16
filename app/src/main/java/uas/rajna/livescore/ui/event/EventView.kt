package uas.rajna.livescore.ui.event

import uas.rajna.livescore.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}
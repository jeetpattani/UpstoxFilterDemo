package com.reply.ui.manager

interface Passable<in T> {

    fun passData(t: T)

}

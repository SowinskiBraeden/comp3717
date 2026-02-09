package ca.bcit.comp3717.lab04

interface MissionListener
{
    fun missionStart(minion: Minion): Unit
    fun missionProgress(): Unit
    fun missionComplete(minion: Minion, message: String): Unit
}

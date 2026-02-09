package ca.bcit.comp3717.lab04

class MissionManager
{
    fun select(mission: Mission, listener: MissionListener): Unit
    {
        mission.start(listener);
    }

    fun selectRepeatable(mission: Repeatable, i: Int, listener: MissionListener): Unit
    {
        mission.repeat(i, listener);
    }
}
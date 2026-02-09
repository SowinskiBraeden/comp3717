package ca.bcit.comp3717.lab04

class Gather(minion: Minion): Mission(minion), Repeatable
{
    override fun determineMissionTime(): Int
    {
        return (minion.backpackSize + minion.baseSpeed) * (1..4).random();
    }

    override fun reward(time: Int): String
    {
        return when (time)
        {
            in 10..21 -> "bronze"
            in 22..33 -> "silver"
            in 34..50 -> "gold"
            else -> "nothing"
        };
    }

    override fun repeat(times: Int, listener: MissionListener): Unit
    {
        for (i in 1..times)
        {
            start(listener);
        }
    }
}
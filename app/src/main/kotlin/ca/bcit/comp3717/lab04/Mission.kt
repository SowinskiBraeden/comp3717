package ca.bcit.comp3717.lab04

abstract class Mission(protected val minion: Minion)
{
    init
    {
        println(minion.catchphrase);
    }
    
    fun start(listener: MissionListener): Unit
    {
        val time = determineMissionTime();
        val reward = reward(time);

        listener.missionStart(minion)
        for (i in 0..2)
        {
            listener.missionProgress();
            Thread.sleep(1000);
        }

        listener.missionComplete(minion, reward);
    }
    protected abstract fun determineMissionTime(): Int
    protected abstract fun reward(time: Int): String
}

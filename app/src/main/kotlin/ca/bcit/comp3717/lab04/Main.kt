package ca.bcit.comp3717.lab04

fun main()
{
    val thing1 = Dwarf();
    val thing2 = Elf()
    val manager = MissionManager();

    val mission1 = Gather(thing1);
    val mission2 = Hunt(thing2);

    manager.selectRepeatable(mission1, 1, object: MissionListener {
        override fun missionStart(minion: Minion): Unit
        {
            println("A ${minion.race} was sent to gather resources");
        }

        override fun missionProgress(): Unit
        {
            println("...");
        }

        override fun missionComplete(minion: Minion, reward: String): Unit
        {
            println("A ${minion.race} has returned from a gather and found ${reward}!\n");
        }
    });

    manager.select(mission2, object: MissionListener {
        override fun missionStart(minion: Minion): Unit
        {
            println("A ${minion.race} started a hunt!");
        }

        override fun missionProgress(): Unit
        {
            println("...");
        }

        override fun missionComplete(minion: Minion, reward: String): Unit
        {
            println("An ${minion.race} has returned from a hunt, and found ${reward}!\n");
        }
    });
}

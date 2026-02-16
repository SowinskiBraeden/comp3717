package ca.bcit.comp3717.lab05;

import kotlin.system.exitProcess;
import kotlin.properties.Delegates;

class PetSimulator
{
    private var invalidChoiceCount: Int by Delegates.observable(0)
    {_, _, newValue ->
        print("Invalid Option");
        when (newValue) {
            1 -> println("Try again");
            2 -> println("One more incorrect attempt and the program will exit");
            3 -> {
                println("Too many invalid options. exiting...");
                exitProcess(0);
            }
        }
    }

    fun start()
    {
        while(true)
        {
            println("\nChoose pet:")
            println("1. Dog\n2. Fish\n3. Exit")
            when (readln().toIntOrNull()) {
                1 -> {
                    val pet = Dog()
                    adopt(pet)
                }
                2 -> {
                    val behavior = chooseBehaviour();
                    val pet = Fish(behavior)
                    adopt(pet)
                }
                3 -> return
                else -> {
                    invalidChoiceCount++;
                }
            }
        }
    }

    private fun chooseBehaviour() : Playable?
    {
        while(true)
        {
            println("\nChoose Play behaviour:")
            println("1. Drop Tail\n2. Do a trick ")
            when (readln().toIntOrNull()) {
                1 -> {
                    return object : Playable
                    {
                        override fun play()
                        {
                            println("Dropping their tail")
                        }
                    }
                }

                2 -> {
                    return object : Playable
                    {
                        override fun play()
                        {
                            println("Spinning like a beyblade")
                        }
                    }
                }

                else -> {
                    invalidChoiceCount++
                }
            }
        }
        return null;
    }

    private fun adopt(pet: Pet)
    {
        while (true)
        {
            println("\nWhat would you like to do with ${pet.name}?")
            println("1. Play\n2. Feed\n3. Interact\n4. Run\n5. Exit ")
            when (readln().toIntOrNull()) {
                1 -> pet.play()
                2 -> pet.feed()
                3 -> pet.interact()
                4 -> pet.run { println("$name is running, $sound")}
                5 -> return
                else -> {
                    invalidChoiceCount++
                }
            }
        }
    }

    fun Pet.run(action: Pet.() -> Unit)
    {
        this.action();
    };
}


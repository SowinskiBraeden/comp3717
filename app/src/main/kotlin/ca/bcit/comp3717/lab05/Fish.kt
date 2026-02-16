package ca.bcit.comp3717.lab05

class Fish(playable: Playable?): Pet, Playable by playable as Playable
{
    override val name: String
        get() = "Marlin"

    override val sound: String
        get() = "\"Albert Brooks\" voice but underwater"

    override fun play() {
        println("$name is swimming in circles, $sound")
    }

    override fun interact() {
        println("$name is looking for Nemo, $sound")
    }

    override fun feed() {
        println("$name ate some algae")
    }
}
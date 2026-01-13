package ca.bcit.comp3717.lab01

const val VERSION_NUM: Double = 1.2;
const val SLOGAN:      String = "deliver with a smile";

fun main()
{
    val streetNum:  Int    = 12345;
    val streetName: String = "homer simpson street";

    val fullAddress: String? = if (VERSION_NUM >= 1)
    {
        "$streetNum $streetName, Glasgow, Scotland"; // string template, no '+' for concatenation
    }
    else {
        println("Starting Beta Version...\n...\n...\n...\n");
        null;
    }

    val title:          String = "Food Delivery Service v$VERSION_NUM";
    val welcome:        String = "Welcome to Glasgow's finest food delivery service, where we provide you with swift instructions on where to deliver your food.\n";
    val instruction:    String = "\t\tPlease deliver the food to:\n\t\t%s\n".format(fullAddress?.uppercase());
    val sloganDelivery: String = "Your hard work and commitment to delivering food are always appreciated, and never forget...%s.\n".format(SLOGAN.uppercase());

    val message:        String = "$title\n\n$welcome\n\n$instruction\n\n$sloganDelivery\n\n...Thank you.";

    println(message);
}

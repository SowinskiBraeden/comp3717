//package ca.bcit.comp3717.lab02;
//fun main()
//{ val w = arrayOf("The", "Quick", "Brown", "Fox", "Went", "Over", "The", "Lazy", "Dog");
//    val (l, s) = listOf(mutableListOf<String>(), mutableListOf<String>());
//    print("Words: "+w.contentToString()+"\nWord Lengths: "+w.map{it.length}+"\nLongest Word(s): ");
//    val (h,t)=listOf(w.maxByOrNull{it.length}?.length ?:0,w.minByOrNull{it.length}?.length?:0);
//    for (i in 0 until w.size)
//    { if(w[i].length==h)l+=w[i]else if(w[i].length==t)s+=w[i]else continue;};
//    print(l + "\nShortest Word(s): " + s + "\n");
//}

package ca.bcit.comp3717.lab02;

fun main()
{
    val w = arrayOf("The", "Quick", "Brown", "Fox", "Went", "Over", "The", "Lazy", "Dog");
    val (l, s) = listOf(mutableListOf<String>(), mutableListOf<String>());
    val (h, t) = listOf(w.maxBy{ it.length }.length, w.minBy{ it.length }.length);

    for (i in 0 until w.size)
    {
        if (w[i].length == h)
        {
            if (l.contains(w[i])) continue;
            l += w[i]
        }

        if (w[i].length == t)
        {

            if (s.contains(w[i])) continue;
            l += w[i]
        }
    }

    print("Words: [");
    var i = 0;
    while (i < w.size)
    {
        val p = if (i < w.size - 1) ", " else "";
        print(w[i] + p);
        i++;
    }

    print("]\nWord Lengths: [");

    i = 0;
    w.map{ it.length }.forEach{e ->
        val p = if (i < w.size - 1) ", " else "]\n";
        print("" + e + p);
        i++;
    }

    print("Longest Word(s): $l");
    print("\nShortest Word(s): $s\n");
}
package ca.bcit.comp3717.lab03

fun printByKey(k: Int, m: Map<Int, String>) {
    println(m[k]);
}

val printByValue = fun(v: String?)
{
    println(v);
};

val getValue = { m: Map<Int, String>, k: Int -> m[k]; };

fun getAndPrint(g: (m: Map<Int, String>, k: Int) -> String?, m: Map<Int, String>, k: Int)
{
    println(g(m, k));
}

fun consumeValue(action: (String) -> Unit, v: String)
{
    action(v);
}

fun main()
{
    val facts: Map<Int, String> = mapOf(1492 to "Christopher Columbus discovers America",
                                        1601 to "William Shakespear writes Hamlet",
                                        1632 to "Galileo discovered the acceleration of gravity on Earth to be 9.8m/s",
                                        1838 to "Rouphly 9.46 trillion km, the light-year is first used as a measurement in astronomy",
                                        2020 to "Covid 19 Pandemic");

    facts.forEach(::println);

    println()

    printByKey(1492, facts);
    printByValue(facts[1601]);
    println(getValue(facts, 1632))
    getAndPrint(getValue, facts, 1838);
    consumeValue(::println, getValue(facts, 2020).toString());
}

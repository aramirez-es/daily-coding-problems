package dailyproblems

val cons = { a: Int, b: Int ->
    {f: (Int, Int) -> Int -> f(a, b) }
}

fun car(cons: ((Int, Int) -> Int) -> Int): Int = cons { a, _ -> a}
fun cdr(cons: ((Int, Int) -> Int) -> Int): Int = cons { _, b -> b}


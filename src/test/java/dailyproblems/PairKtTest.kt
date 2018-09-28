package dailyproblems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 *
 * Given this implementation of cons:
 *
 * def cons(a, b):
 *   def pair(f):
 *     return f(a, b)
 *   return pair
 *
 * Implement car and cdr.
 */
class PairKtTest {
    @Test
    internal fun it_should_return_the_first_element() {
        assertEquals(3, car(cons(3, 4)))
        assertEquals(4, car(cons(4, 3)))
    }

    @Test
    internal fun it_should_return_the_last_element() {
        assertEquals(4, cdr(cons(3, 4)))
        assertEquals(3, cdr(cons(4, 3)))
    }
}

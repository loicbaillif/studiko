package oop.classHiearchy.inheritance

/**
 * Book:
 * pages: Number of pages for original edition
 * author: who wrote it
 * cost: price, in cents
 */

open class BookTh(val title: String, val pages: Int, val author: String, var cost: Int = 0) {
    fun getFullInfo(): String = "$title, written by $author ($pages pages), " +
            "costs ${cost / 100} euros and ${cost % 100} cents"

}
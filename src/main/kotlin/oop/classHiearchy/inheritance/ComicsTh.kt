package oop.classHiearchy.inheritance

class ComicsTh(title: String, pages: Int, author: String, cost: Int) : BookTh(title, pages, author, cost) {
    fun getEurCost(): String {
        return "${cost / 100}€${cost % 100}"
    }

    fun getUsdCost(): String {
        val rateEurUsd = 1.21
        val usCost = cost * rateEurUsd
        return "${usCost / 100}$${usCost % 100}"
    }
}
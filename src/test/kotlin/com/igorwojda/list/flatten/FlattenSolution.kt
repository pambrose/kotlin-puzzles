package com.igorwojda.list.flatten

private object Solution {
    fun flatten(list: List<*>): List<*> {
        val result = mutableListOf<Any?>()

        list.forEach {
            if (it is List<*>) {
                result.addAll(flatten(it))
            } else {
                result.add(it)
            }
        }

        return result.filter { it != null }
    }
}

private object KtLintWillNotComplain

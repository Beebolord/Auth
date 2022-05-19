package com.cypher.auth.common.ext


fun Task?.hasDueDate() : Boolean {
    return this?.dueDate.orEmpty().isNotBlank()
}

fun Task?.hasDueTime() : Boolean {
    return this?.dueTime.orEmpty().isNotBlank()
}
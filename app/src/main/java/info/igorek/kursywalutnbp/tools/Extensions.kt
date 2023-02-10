package info.igorek.kursywalutnbp.tools

import java.util.Locale

fun String.uppercaseFirstChars(): String {
    return this
        .split(EMPTY_STRING)
        .joinToString(
            separator = EMPTY_STRING,
            transform = { substring ->
                substring.replaceFirstChar { char ->
                    if (char.isLowerCase()) {
                        char.titlecase(Locale.ROOT)
                    } else {
                        char.toString()
                    }
                }
            },
        )
}

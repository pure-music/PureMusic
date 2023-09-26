package com.caij.puremusic.util

object WorkMathUtil {

    fun findClosestMatch(wordList: List<String>, targetWord: String): Int {
        var minDistance = Int.MAX_VALUE
        var closestIndex = -1

        try {
            for (index in wordList.indices) {
                val word = wordList[index]
                val distance = calculateLevenshteinDistance(word, targetWord)
                if (distance < minDistance) {
                    minDistance = distance
                    closestIndex = index
                }
            }
        } catch (ignore: Exception) {

        }

        return closestIndex
    }

    private fun calculateLevenshteinDistance(word1: String, word2: String): Int {
        val m = word1.length
        val n = word2.length
        val dp = Array(m + 1) { IntArray(n + 1) }

        for (i in 0..m) {
            dp[i][0] = i
        }

        for (j in 0..n) {
            dp[0][j] = j
        }

        for (i in 1..m) {
            for (j in 1..n) {
                if (word1[i - 1] == word2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1]
                } else {
                    dp[i][j] = 1 + minOf(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1])
                }
            }
        }

        return dp[m][n]
    }
}
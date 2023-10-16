class Solution0119 {
    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0) {
            return listOf(1)
        }

        val triangle = mutableListOf(listOf(1))

        for (i in 0..<rowIndex) {
            val lastRow = triangle.last()
            val newRow = mutableListOf(1)

            for (j in 1..<lastRow.size) {
                newRow.add(lastRow[j - 1] + lastRow[j])
            }

            newRow.add(1)
            triangle.add(newRow)
        }

        return triangle.last()
    }
}
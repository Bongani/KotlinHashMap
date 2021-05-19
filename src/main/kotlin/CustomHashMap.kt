class CustomHashMap<Key, Value> {

    private data class Entry<Key, Value>(val key: Key, val value: Value)

    private val arraySize = 64
    private val entries: Array<Entry<Key,Value>?> = arrayOfNulls(arraySize)

    /**
     * Given a key value pair put it in the hash map
     *
     * @param key
     * @param value
     */
    fun put(key: Key, value: Value){
        val index = calculateHashCode(key)
        entries[index] = Entry(key, value)
    }

    /**
     * Get value if the key exists in hashmap, else return null
     *
     * @param key
     * @return
     */
    fun get(key: Key): Value? {
        val index = calculateHashCode(key)
        return entries[index]?.value
    }

    /**
     * Remove key-value pair from hashmap
     *
     * @param key
     */
    fun remove(key: Key) {
        val index = calculateHashCode(key)
        entries[index] = null
    }

    /**
     * Calculate hash code
     *
     * @param key
     * @return
     */
    private fun calculateHashCode(key: Key): Int {
        return key.hashCode() % arraySize
    }
}
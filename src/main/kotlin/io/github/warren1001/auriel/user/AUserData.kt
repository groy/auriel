package io.github.warren1001.auriel.user

data class AUserData(val _id: String) {
	
	val userData = mutableMapOf<String, Any>()
	val vouches = mutableListOf<Vouch>()
	var lastVouch = 0L
	
	fun set(key: String, value: Any): Boolean {
		if (userData[key] == value) return false
		userData[key] = value
		return true
	}
	
	fun setDefault(key: String, value: Any) {
		if (!userData.containsKey(key)) {
			userData[key] = value
		}
	}
	
	fun has(key: String) = userData.containsKey(key)
	fun get(key: String) = userData[key]
	fun getOrDefault(key: String, default: Any) = userData.getOrDefault(key, default)
	fun getAsString(key: String) = get(key) as String
	fun getAsNumber(key: String) = get(key) as Number
	fun getAsBoolean(key: String) = get(key) as Boolean

}

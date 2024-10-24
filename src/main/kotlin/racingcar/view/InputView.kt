package racingcar.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun getNameOfCar(): MutableMap<String, Int> {
        val input = Console.readLine()
        require(input.isNotEmpty()) {ERROR_EMPTY_STRING}
        val nameList = input.split(",")
        for (name in nameList) {
            require(name.isNotEmpty()) {ERROR_EMPTY_NAME}
            require(name.all{ it.isLetter() }) {ERROR_INVALID_NAME}
            require(name.length <= 5) {ERROR_NAME_LENGTH}
        }
        return nameList.associateWith { 0 }.toMutableMap()
    }

    fun getCount(): Int {
        try {
            val count = Console.readLine().toInt()
            require(count > 0) {ERROR_COUNT_SIZE}
            return count
        } catch (e:NumberFormatException){
            throw IllegalArgumentException(ERROR_ONLY_DIGIT)
        }
    }

    companion object {
        private const val ERROR_EMPTY_STRING = "[경고] 이름을 입력해야 합니다."
        private const val ERROR_EMPTY_NAME = "[경고] 비어있는 이름이 있습니다."
        private const val ERROR_INVALID_NAME = "[경고] 알파벳으로 이뤄진 이름만 입력 가능합니다."
        private const val ERROR_NAME_LENGTH = "[경고] 이름은 5글자를 초과할 수 없습니다."
        private const val ERROR_COUNT_SIZE = "[경고] 1이상이어야 합니다."
        private const val ERROR_ONLY_DIGIT = "[경고] 숫자만 입력 가능합니다."
    }
}
package racingcar.view

class OutputView {
    fun printGetNameOfCar() {
        println(GET_NAME_OF_CAR_MESSAGE)
    }

    fun printGetCount() {
        println(GET_COUNT_MESSAGE)
    }

    fun printResultMessage() {
        printLineFeed()
        println(RESULT_MESSAGE)
    }

    fun printStatusOfName(name: String) {
        print("$name$NAME_DELIMITER")
    }

    fun printStatusOfMove() {
        print(MOVE_SYMBOL)
    }

    fun printLineFeed() {
        print(LINE_FEED)
    }

    companion object {
        private const val GET_NAME_OF_CAR_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
        private const val GET_COUNT_MESSAGE = "시도할 횟수는 몇 회인가요?"
        private const val RESULT_MESSAGE = "실행 결과"
        private const val NAME_DELIMITER = " : "
        private const val MOVE_SYMBOL = "-"
        private const val LINE_FEED = "\n"
    }
}
object Constant {
    // kegnaannya untuk kumpulan constant
    const val MENU = ""

    // bisa ga objek dalam objek??
    // bisa
    object NAVIGATION {
        const val HOME = "home"
        const val history = "history"
        const val Inbox = "inbox"

        fun navigateToInbox () {
            Inbox
        }

        fun navigationTo(navigate: String) {

        }
    }

    // convention name-nya bagaimana ? kembali ke sepakatan bersama
    // bisa PascalCase, camelCase, snake_case, UPPERCASE, lowercase

}
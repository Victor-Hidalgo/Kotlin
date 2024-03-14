fun main() {
    val aliceAccount = Account("Alice")
    aliceAccount.deposit(1000)
    aliceAccount.withdraw(500)
    aliceAccount.deposit(-20)
    aliceAccount.withdraw(-100)

    val balance = aliceAccount.calculateBalance()
    println("Balance is $balance")
}

class Account(val accountName: String) {
    private var balance = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance}")
        } else {
            println("Cannot deposit negative sums")
        }
    }

    fun withdraw(withdrawal: Int) {
        if (-withdrawal < 0) {
            transactions.add(-withdrawal)
            this.balance += -withdrawal
            println("$withdrawal withdrawn. Balance is now ${this.balance}")
        } else {
            println("Cannot withdraw negative sums")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for (transaction in transactions) {
            this.balance += transaction
        }
        return this.balance
    }
}
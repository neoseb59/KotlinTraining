package meta_introduction_to_kotlin_capstone

// Step 1: Create constants and variables
var accountBalance = (1..1000).random()
val money = (0..1000).random()

fun withdraw(amount: Int): Int {
    accountBalance = accountBalance - amount
    println("The amount you withdraw is $amount dollars.")
    return amount
}

fun debitWithdraw(amount: Int): Int {
    return if (accountBalance == 0) {
        println("Can't withdraw, no money on this account!")
        accountBalance
    } else if (amount > accountBalance) {
        println("Not enough money on this account! The checking balance is ${accountBalance} dollars.")
        0
    } else {
        withdraw(amount)
    }
}

fun deposit(amount: Int): Int {
    accountBalance += amount
    println("The amount you deposit is $amount dollars.")
    return amount
}

fun creditDeposit(amount: Int): Int {
    return if (accountBalance == 0) {
        println("You do not need to deposit anything since it has already been paid off")
        accountBalance
    } else if (accountBalance + amount > 0) {
        println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is $accountBalance dollars.")
        0
    } else if (amount == - accountBalance) {
        println("You have paid off this account!")
        amount
    } else {
        deposit(amount)
    }
}

fun main() {
    println("The current balance is $accountBalance dollars.")
    println("The amount you try to withdraw is $money dollars.")
    // Step 2
    var output: Int

    // Step 4
    output = withdraw(money)
    println("The amount you withdrew is $output dollars.")

    // Step 6
    output = debitWithdraw(money)
    println("The amount you withdrew is $output dollars.")

    // Step 8
    output = deposit(money)
    println("The amount you deposited is $output dollars.")

    // Step 10
    output = creditDeposit(money)
    println("The amount you deposited is $output dollars.")
}
# JUnitTesting
You have been provided with a Java BankAccount class that emulates the behavior of a typical bank account. The class is designed to do the following (ideally):
1. Create an account. The constructor takes in three arguments: initial balance (type float) (user will only enter positive values), a username and password (both of type char[]).
2. Add money (user will only enter positive values) to the balance.
3. Withdraw money (assume the user will only enter positive values) from the balance. You can only withdraw when the account balance is more than withdrawal amount.
4. Call “mergeAccounts” to merge two bank accounts (make sure the accounts objects cannot be null, otherwise throw NullPointerException). On merge, the balances must add up.

Write a JUnit 4 tester for the above class that tests the following use cases. Each test weighs 10 points
1. Test to confirm (the method is behaving as expected) the ability to create an account.
2. Test to confirm the ability to login into the account.
3. Test to confirm that the amount deposited is adding up.
4. Test to confirm the amount withdrawal from the balance. You can only make a withdrawal if you have sufficient balance. If not, return “0” (zero). You should also test this condition.
5. Test to confirm the balances added up when you merge two valid accounts. Also, test if the expected exception is thrown when an account is null. 

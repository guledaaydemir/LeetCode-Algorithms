func fib(_ n: Int) -> Int {

    // Solution 1
    if n == 0 || n == 1 {
        return n
    } else if n > 1 {
        return fib(n-1) + fib(n-2)
    } else {
        return -1
    }

    // Solution 2
    //return n>1 ? fib(n-1) + fib(n-2) : n
}

print(fib(4))
print(fib(0))

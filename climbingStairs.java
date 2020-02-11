int climbingStairs(int n) {
    // return fib(n + 1);
    if (n < 2) return 1;

    int a = 1;
    int b = 1;
    int c = 1;

    for (int i = 2; i <= n; i++){
        c = b;
        b = a + b;
        a = c;
    }
    return b;
}

// int fib(int n) {
//     if (n <= 1) {
//         return n; 
//     }
//     return fib(n-1) + fib(n-2); 
// }

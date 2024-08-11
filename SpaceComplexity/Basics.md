1. for (i = 0; i < n; i++) {

} - `O(n)`

2. for (i = 0; i < n; i=i*2) {
    
} - `O(log(n))`
    Step by step explanation of `O(log(n))`
    first step: i = 1;
    second step: i = 2;
    third step: i = 4;
    fourth step: i = 8;
    fifth step: i = 16; which means value of i after k jumps is i = 2 ^ k

    when the loop has to terminate the value of i will be  i >= n and k  will be 2^k >= n

3. for (i = 0; i < n; i++) {
    for (j = 0; j < n; j++) {
        
    }
} - `O(n^2)`

4. for (i = 0; i < n; i = i/2) {
    
} - `O(1)`


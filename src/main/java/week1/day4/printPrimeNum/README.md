
### Print Prime Num
You are given a list of numbers. Print prime numbers whose index corresponds to the sum of the digits in a given number. 
The prime number with index 1 is 2.

1. Взяти 1-ше число
2. порахувати суму його цифр = потрібний індекс
3. йти по всіх числах
   4. рахувати поточний індекс кожного знайденого простого числа
   5. вивести число, якщо воно пройде перевірку, чи воно просте + чи воно знаходиться на тому індексі, який ми шукаємо



### 
1009 - prime?

1. divide by 2 (remember that we divided by 2, and it did not work -> [2])
2. next number - 3 - can it be factorized into smaller factors? No
3. divide by 3 (also remember that we divided by 3, and it did not work -> [2,3])
4. next number - 4 - can it be factorized into smaller factors? Yes 
5. skip dividing by 4 
6. next number - 5 - can it be factorized into smaller factors? No 
7. divide by 5 (also remember that we divided by 3, and it did not work -> [2,3,5])
8. next number - 6 - can it be factorized into smaller factors? Yes 
9. skip dividing by 6 
10. next number - 7 - can it be factorized into smaller factors? No 
11. divide by 7 (also remember that we divided by 7, and it did not work -> [2,3,5,7])
12. next number - 8 - can it be factorized into smaller factors? Yes 
13. skip dividing by 8 
14. next number - 9 - can it be factorized into smaller factors? Yes
15. skip dividing by 9
16. next number - 10 - can it be factorized into smaller factors? Yes
17. skip dividing by 10
18. next number - 11 - can it be factorized into smaller factors? No
19. divide by 11 (also remember that we divided by 11, and it did not work -> [2,3,5,7,11])
20. next number - 12 - can it be factorized into smaller factors? Yes
21. skip dividing by 12
22. next number - 13 - can it be factorized into smaller factors? No 
23. divide by 13 (also remember that we divided by 13, and it did not work -> [2,3,5,7,11,13])
24. next number - 14 - can it be factorized into smaller factors? Yes 
25. skip dividing by 14
26. next number - 15 - can it be factorized into smaller factors? Yes 
27. skip dividing by 15
28. next number - 16 - can it be factorized into smaller factors? Yes 
29. skip dividing by 16
30. next number - 17 - can it be factorized into smaller factors? No
31. divide by 17 (also remember that we divided by 17, and it did not work -> [2,3,5,7,11,13,17])
32. next number - 18 - can it be factorized into smaller factors? Yes
33. skip dividing by 18
34. next number - 19 - can it be factorized into smaller factors? No 
35. divide by 19 (also remember that we divided by 19, and it did not work -> [2,3,5,7,11,13,17,19])
36. next number - 20 - can it be factorized into smaller factors? Yes 
37. skip dividing by 20
38. next number - 21 - can it be factorized into smaller factors? Yes 
39. skip dividing by 21
40. next number - 22 - can it be factorized into smaller factors? Yes 
41. skip dividing by 22
42. next number - 23 - can it be factorized into smaller factors? No 
43. divide by 23 (also remember that we divided by 23, and it did not work -> [2,3,5,7,11,13,17,19,23])
44. next number - 24 - can it be factorized into smaller factors? Yes 
45. skip dividing by 24
46. next number - 25 - can it be factorized into smaller factors? Yes 
--- try dividing 25 by each number 2, 3, 5 ---
47. skip dividing by 25
48. next number - 26 - can it be factorized into smaller factors? Yes 
49. skip dividing by 26
50. next number - 27 - can it be factorized into smaller factors? Yes 
51. skip dividing by 27
52. next number - 28 - can it be factorized into smaller factors? Yes 
53. skip dividing by 28 
54. next number - 29 - can it be factorized into smaller factors? No 
55. divide by 29 (also remember that we divided by 29, and it did not work -> [2,3,5,7,11,13,17,19,23,29])
56. next number - 30 - can it be factorized into smaller factors? Yes
57. skip dividing by 30
58. next number - 31 - can it be factorized into smaller factors? No
59. divide by 31 (also remember that we divided by 31, and it did not work -> [2,3,5,7,11,13,17,19,23,29,31])_
59. divide by 31 (also remember that we divided by 31, and it did not work -> [2,3,5,7,11,13,17,19,23,29,31,37,41])

--------



 create list PrimeNumbers[2...]

                           1.   divide TARGET NUMBER by 2   
                                          |
                                   2.   divisible?
                                       /      \
                                    YES        NO
                                    /            \
     3.    targetNumber is NOT prime            4.  take the following number (after 2 in first iteration, afterwards +1) 
                                                               |
                                                       5.    divide taken number by numbers in the list of primeNumbers 
                                                               |
                                                 6.          divisible?
                                                            /      \
                                                          YES        NO
                                                          /            \
                                                   skip dividing        add that number to list of primeNumbers
                                                        /                  \
                                                 go to step 4               divide TARGET NUMBER by number just added to the list of prime numbers 
                                                                              \
                                                                              divisible?
                                                                               /      \
                                                                            YES        NO
                                                                            /            \
                                                       targetNumber is NOT prime          limit of divisors reached?
                                                                                            /      \
                                                                                          YES        NO
                                                                                         /             \
                                                                   TARGET NUMBER is PRIME            go to Step 4


TARGET NUMBER - number that we are defining if it's prime
divisors limit - square root of the TARGET NUMBER rounded down (e.g. for number 293 divisors limit is 17) 






## ALGORITHMS

![algorithm](../../../../resources/images/week1/day3/.......png)
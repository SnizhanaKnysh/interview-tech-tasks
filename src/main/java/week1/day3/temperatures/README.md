
### TEMPERATURES

Print the num closest to 0 out of input numbers.

range of nums = -273...5000
if 2 opposite nums are equally close to 0 -> print positive one
if no input is provided -> print 0

N - number of temperatures
0 <= N <=10000


[-20, 12, -100, 4, -12]

1. read input temperatures
2. save them to the list
3. find abs value of each int
4. loop over list of abs values to find the smallest 
   a. compare current value with the min value to identify smaller one
   b. remember smaller one as min value

## ALGORITHMS

![algorithm](../../../../resources/images/week1/day3/temperatures.png)
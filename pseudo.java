//--------------------------------
i = 1
while(i <= 5)
{
   print i
   i = i + 1
}


Answer: 1 2 3 4 5
//----------------------------------

for(i = 1; i <= 5; i = i + 2)
{
   print i
}


Answer: 1 3 5

Q3
for(i = 5; i > 0; i = i - 1)
{
   print i
}


Answer: 5 4 3 2 1

Q4
n = 4
for(i = 1; i <= n; i = i + 1)
{
   if(i % 2 == 0)
      print "even"
   else
      print "odd"
}


Answer:
odd even odd even

Q5
sum = 0
for(i = 1; i <= 5; i = i + 1)
{
   sum = sum + i
}
print sum


Answer: 15

Q6
i = 1
while(i <= 3)
{
   j = 1
   while(j <= i)
   {
      print "*"
      j = j + 1
   }
   i = i + 1
}


Answer:
* ** ***

Q7
for(i = 1; i <= 5; i = i + 1)
{
   if(i == 3)
      continue
   print i
}


Answer: 1 2 4 5

Q8
for(i = 1; i <= 5; i = i + 1)
{
   if(i == 4)
      break
   print i
}


Answer: 1 2 3

Q9
n = 3
for(i = 1; i <= n; i = i + 1)
{
   for(j = 1; j <= n; j = j + 1)
   {
      print i * j
   }
}


Answer: 1 2 3 2 4 6 3 6 9

Q10
i = 1
do
{
   print i
   i = i + 2
} while(i <= 6)


Answer: 1 3 5

Q11
i = 1
while(i < 5)
{
   print i
   i = i + 2
}


Answer: 1 3

Q12
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= i; j = j + 1)
   {
      print j
   }
}


Answer: 1 12 123

Q13
n = 5
fact = 1
for(i = 1; i <= n; i = i + 1)
{
   fact = fact * i
}
print fact


Answer: 120

Q14
n = 153
sum = 0
temp = n
while(temp > 0)
{
   d = temp % 10
   sum = sum + d*d*d
   temp = temp / 10
}
if(sum == n)
   print "Armstrong"
else
   print "Not Armstrong"


Answer: Armstrong

Q15
for(i = 1; i <= 5; i = i + 1)
{
   if(i % 2 == 0)
      print i * i
   else
      print i
}


Answer: 1 4 3 16 5

Q16
n = 7
if(n % 2 == 0)
   print "Even"
else
   print "Odd"


Answer: Odd

Q17
i = 0
while(i < 10)
{
   i = i + 3
   print i
}


Answer: 3 6 9

Q18
for(i = 5; i >= 1; i = i - 1)
{
   for(j = 1; j <= i; j = j + 1)
   {
      print "*"
   }
}


Answer:
***** **** *** ** *

Q19
sum = 0
i = 1
while(i <= 10)
{
   if(i % 2 == 0)
      sum = sum + i
   i = i + 1
}
print sum


Answer: 30

Q20
n = 5
for(i = 1; i <= n; i = i + 1)
{
   print i*i
}


Answer: 1 4 9 16 25

Q21
n = 29
isPrime = true
for(i = 2; i <= n/2; i = i + 1)
{
   if(n % i == 0)
   {
      isPrime = false
      break
   }
}
if(isPrime)
   print "Prime"
else
   print "Not Prime"


Answer: Prime

Q22
i = 1
while(i <= 5)
{
   print i*2
   i = i + 1
}


Answer: 2 4 6 8 10

Q23
n = 10
a = 0
b = 1
print a
print b
for(i = 3; i <= n; i = i + 1)
{
   c = a + b
   print c
   a = b
   b = c
}


Answer: Fibonacci series up to 10 terms → 0 1 1 2 3 5 8 13 21 34

Q24
x = 15
if(x % 3 == 0 and x % 5 == 0)
   print "FizzBuzz"
else if(x % 3 == 0)
   print "Fizz"
else if(x % 5 == 0)
   print "Buzz"


Answer: FizzBuzz

Q25
for(i = 1; i <= 4; i = i + 1)
{
   for(j = 1; j <= i; j = j + 1)
   {
      print i+j
   }
}


Answer:
2 3 4 3 4 5 4 5 6 5 6 7

👉 That’s the first 25 Q&A.

Would you like me to continue with the next 25 (Part 2) in the same format until we complete 200 pseudo-questions?

You said:
Continue 
ChatGPT said:

Perfect 👍 Let’s continue with Part 2 (Q26 – Q50) of pseudo-code questions on loops & conditionals, styled like Capgemini FAQs.

🚀 Pseudo-Code Questions – Loops & Conditionals (Part 2)
Q26
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= 3; j = j + 1)
   {
      if(i == j)
         print "#"
      else
         print "*"
   }
}


Answer:
#** *#* **#

Q27
n = 1234
sum = 0
while(n > 0)
{
   sum = sum + (n % 10)
   n = n / 10
}
print sum


Answer: 10

Q28
for(i = 1; i <= 4; i = i + 1)
{
   for(j = 1; j <= i; j = j + 1)
      print i
}


Answer:
1 22 333 4444

Q29
x = 0
for(i = 1; i <= 5; i = i + 1)
{
   x = x + i*i
}
print x


Answer: 55

Q30
count = 0
for(i = 1; i <= 20; i = i + 1)
{
   if(i % 3 == 0 and i % 5 == 0)
      count = count + 1
}
print count


Answer: 1 (only 15)

Q31
i = 1
while(i <= 4)
{
   print i
   i = i + 2
}


Answer: 1 3

Q32
x = 10
while(x > 0)
{
   print x
   x = x - 4
}


Answer: 10 6 2

Q33
for(i = 1; i <= 5; i = i + 1)
{
   if(i == 2 or i == 4)
      print "skip"
   else
      print i
}


Answer: 1 skip 3 skip 5

Q34
i = 1
sum = 0
while(i <= 5)
{
   if(i % 2 == 1)
      sum = sum + i
   i = i + 1
}
print sum


Answer: 9

Q35
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= 3; j = j + 1)
   {
      if((i+j) % 2 == 0)
         print "X"
      else
         print "O"
   }
}


Answer:
X O X O X O X O X

Q36
n = 6
fact = 1
for(i = n; i >= 1; i = i - 1)
{
   fact = fact * i
}
print fact


Answer: 720

Q37
for(i = 1; i <= 5; i = i + 1)
{
   for(j = 1; j <= i; j = j + 1)
   {
      print "*"
   }
   print " "
}


Answer:
* ** *** **** *****

Q38
n = 145
sum = 0
temp = n
while(temp > 0)
{
   d = temp % 10
   f = 1
   for(i = 1; i <= d; i = i + 1)
      f = f * i
   sum = sum + f
   temp = temp / 10
}
if(sum == n)
   print "Strong"
else
   print "Not Strong"


Answer: Strong

Q39
for(i = 2; i <= 10; i = i + 2)
{
   print i*i
}


Answer: 4 16 36 64 100

Q40
i = 1
while(i <= 10)
{
   if(i % 3 == 0)
      print i
   i = i + 1
}


Answer: 3 6 9

Q41
for(i = 5; i >= 1; i = i - 1)
{
   for(j = i; j >= 1; j = j - 1)
   {
      print j
   }
}


Answer:
54321 4321 321 21 1

Q42
n = 9
if(n % 2 == 0)
   print n/2
else
   print n*2


Answer: 18

Q43
for(i = 1; i <= 5; i = i + 1)
{
   for(j = 1; j <= 5; j = j + 1)
   {
      if(i == 1 or i == 5 or j == 1 or j == 5)
         print "*"
      else
         print " "
   }
}


Answer: Square pattern border

*****
*   *
*   *
*   *
*****

Q44
n = 8
count = 0
for(i = 1; i <= n; i = i + 1)
{
   if(n % i == 0)
      count = count + 1
}
if(count == 2)
   print "Prime"
else
   print "Not Prime"


Answer: Not Prime

Q45
for(i = 1; i <= 4; i = i + 1)
{
   for(j = 1; j <= i; j = j + 1)
      print j*j
}


Answer:
1 14 149 14916

Q46
n = 6
a = 1
for(i = 1; i <= n; i = i + 1)
{
   a = a * 2
   print a
}


Answer: 2 4 8 16 32 64

Q47
for(i = 1; i <= 4; i = i + 1)
{
   for(j = 1; j <= 4; j = j + 1)
   {
      if(i < j)
         print "-"
      else
         print "+"
   }
}


Answer:
+--- ++-- +++- ++++

Q48
i = 1
count = 0
while(i <= 20)
{
   if(i % 4 == 0)
      count = count + 1
   i = i + 1
}
print count


Answer: 5

Q49
n = 12321
rev = 0
temp = n
while(temp > 0)
{
   d = temp % 10
   rev = rev*10 + d
   temp = temp / 10
}
if(rev == n)
   print "Palindrome"
else
   print "Not Palindrome"


Answer: Palindrome

Q50
x = 1
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= 3; j = j + 1)
   {
      print x
      x = x + 1
   }
}


Answer:
1 2 3 4 5 6 7 8 9

✅ That’s 50 done (Part 1 + Part 2).
Would you like me to continue with Q51–Q75 (Part 3) in the same structured way until we reach 200?

You said:
Continue 
ChatGPT said:

Alright 👍 Let’s move on with Part 3 (Q51 – Q75) of pseudo-code FAQ on loops & conditionals.

🚀 Pseudo-Code Questions – Loops & Conditionals (Part 3)
Q51
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= i; j = j + 1)
   {
      print i*j
   }
}


Answer:
1 2 4 3 6 9

Q52
i = 5
while(i > 0)
{
   print i
   i = i - 2
}


Answer: 5 3 1

Q53
for(i = 1; i <= 4; i = i + 1)
{
   if(i % 2 == 0)
      print i*10
   else
      print i
}


Answer: 1 20 3 40

Q54
x = 1
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= 2; j = j + 1)
   {
      print x
      x = x + 1
   }
}


Answer: 1 2 3 4 5 6

Q55
n = 4
for(i = 1; i <= n; i = i + 1)
{
   for(j = 1; j <= n; j = j + 1)
   {
      if(i == j)
         print i
      else
         print 0
   }
}


Answer:

1 0 0 0
0 2 0 0
0 0 3 0
0 0 0 4

Q56
n = 10
sum = 0
for(i = 1; i <= n; i = i + 1)
{
   if(i % 2 == 0)
      sum = sum + i
}
print sum


Answer: 30

Q57
for(i = 1; i <= 4; i = i + 1)
{
   for(j = i; j <= 4; j = j + 1)
      print j
}


Answer:
1234 234 34 4

Q58
i = 1
while(i <= 4)
{
   j = 1
   while(j <= i)
   {
      print "#"
      j = j + 1
   }
   i = i + 1
}


Answer:
# ## ### ####

Q59
n = 5
p = 1
for(i = 1; i <= n; i = i + 1)
{
   p = p * i
   print p
}


Answer: 1 2 6 24 120

Q60
x = 2
for(i = 1; i <= 5; i = i + 1)
{
   print x
   x = x * 2
}


Answer: 2 4 8 16 32

Q61
for(i = 1; i <= 5; i = i + 1)
{
   if(i % 3 == 0)
      print "Yes"
   else
      print "No"
}


Answer: No No Yes No No

Q62
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= 3; j = j + 1)
   {
      if(i < j)
         print "+"
      else if(i == j)
         print "="
      else
         print "-"
   }
}


Answer:
= + + - = + - - =

Q63
n = 123
rev = 0
while(n > 0)
{
   rev = rev*10 + (n % 10)
   n = n / 10
}
print rev


Answer: 321

Q64
n = 12
if(n % 3 == 0 and n % 4 == 0)
   print "Divisible"
else
   print "Not Divisible"


Answer: Divisible

Q65
sum = 0
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= 2; j = j + 1)
   {
      sum = sum + i + j
   }
}
print sum


Answer: 21

Q66
i = 0
count = 0
while(i <= 20)
{
   if(i % 5 == 0)
      count = count + 1
   i = i + 1
}
print count


Answer: 5

Q67
for(i = 1; i <= 4; i = i + 1)
{
   for(j = 1; j <= 4; j = j + 1)
   {
      if(i+j == 5)
         print "#"
      else
         print "."
   }
}


Answer:

...#
..#.
.#..
#...

Q68
n = 7
for(i = 1; i <= n; i = i + 2)
{
   print i
}


Answer: 1 3 5 7

Q69
n = 20
count = 0
for(i = 1; i <= n; i = i + 1)
{
   if(i % 2 == 0 and i % 5 == 0)
      count = count + 1
}
print count


Answer: 2 (10 and 20)

Q70
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= i; j = j + 1)
      print i+j
}


Answer: 2 34 456

Q71
x = 0
for(i = 1; i <= 4; i = i + 1)
{
   x = x + (i*i)
}
print x


Answer: 30

Q72
i = 10
while(i >= 2)
{
   print i
   i = i - 2
}


Answer: 10 8 6 4 2

Q73
n = 6
sum = 0
for(i = 1; i <= n; i = i + 1)
{
   if(i % 3 == 0)
      sum = sum + i
}
print sum


Answer: 9

Q74
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= 2; j = j + 1)
   {
      if((i+j) % 2 == 0)
         print "@"
      else
         print "$"
   }
}


Answer: @$ $@ @$

Q75
x = 1
for(i = 1; i <= 4; i = i + 1)
{
   print x
   x = x + i
}


Answer: 1 2 4 7

✅ That’s Q51–Q75 completed.

Do you want me to go ahead with Part 4 (Q76–Q100) right now so we’ll complete the first 100 pseudo-code FAQs?

You said:
Continue 
ChatGPT said:

Great 👍 Let’s push forward with Part 4 (Q76 – Q100) of pseudo-code FAQs on loops & conditional statements.

🚀 Pseudo-Code Questions – Loops & Conditionals (Part 4)
Q76
for(i = 1; i <= 5; i = i + 1)
{
   for(j = 1; j <= i; j = j + 1)
      print j
}


Answer:
1 12 123 1234 12345

Q77
i = 1
while(i <= 10)
{
   if(i % 2 == 0)
      print i
   i = i + 1
}


Answer: 2 4 6 8 10

Q78
n = 15
if(n % 5 == 0)
   print "Yes"
else
   print "No"


Answer: Yes

Q79
for(i = 5; i >= 1; i = i - 1)
{
   for(j = 1; j <= i; j = j + 1)
      print "*"
}


Answer:
***** **** *** ** *

Q80
n = 4
sum = 0
for(i = 1; i <= n; i = i + 1)
{
   for(j = 1; j <= i; j = j + 1)
      sum = sum + 1
}
print sum


Answer: 10

Q81
i = 0
while(i < 5)
{
   print i*i
   i = i + 1
}


Answer: 0 1 4 9 16

Q82
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= 3; j = j + 1)
      print i+j
}


Answer:
2 3 4 3 4 5 4 5 6

Q83
n = 371
sum = 0
temp = n
while(temp > 0)
{
   d = temp % 10
   sum = sum + d*d*d
   temp = temp / 10
}
if(sum == n)
   print "Armstrong"
else
   print "Not Armstrong"


Answer: Armstrong

Q84
for(i = 1; i <= 4; i = i + 1)
{
   if(i == 2 or i == 3)
      continue
   print i
}


Answer: 1 4

Q85
n = 20
for(i = 1; i <= n; i = i + 1)
{
   if(i % 7 == 0)
      print i
}


Answer: 7 14

Q86
i = 2
while(i <= 16)
{
   print i
   i = i * 2
}


Answer: 2 4 8 16

Q87
n = 29
isPrime = true
for(i = 2; i <= n/2; i = i + 1)
{
   if(n % i == 0)
   {
      isPrime = false
      break
   }
}
if(isPrime)
   print "Prime"
else
   print "Not Prime"


Answer: Prime

Q88
for(i = 1; i <= 5; i = i + 1)
{
   print i*i*i
}


Answer: 1 8 27 64 125

Q89
i = 1
sum = 0
while(i <= 5)
{
   sum = sum + (i*2)
   i = i + 1
}
print sum


Answer: 30

Q90
n = 10
for(i = 1; i <= n; i = i + 1)
{
   if(i % 2 == 1)
      print i
}


Answer: 1 3 5 7 9

Q91
for(i = 1; i <= 3; i = i + 1)
{
   for(j = 1; j <= i; j = j + 1)
   {
      print i+j
   }
}


Answer:
2 34 456

Q92
i = 5
while(i >= 1)
{
   print i
   i = i - 1
}


Answer: 5 4 3 2 1

Q93
n = 5
a = 0
b = 1
for(i = 1; i <= n; i = i + 1)
{
   print a
   c = a + b
   a = b
   b = c
}


Answer: 0 1 1 2 3

Q94
n = 9
if(n % 2 == 0)
   print "Even"
else
   print "Odd"


Answer: Odd

Q95
for(i = 1; i <= 4; i = i + 1)
{
   for(j = 1; j <= 4; j = j + 1)
   {
      if(i == j)
         print "@"
      else
         print "."
   }
}


Answer:

@...
.@..
..@.
...@

Q96
n = 12345
sum = 0
while(n > 0)
{
   sum = sum + (n % 10)
   n = n / 10
}
print sum


Answer: 15

Q97
for(i = 1; i <= 5; i = i + 1)
{
   if(i == 3)
      break
   print i
}


Answer: 1 2

Q98
x = 1
for(i = 1; i <= 4; i = i + 1)
{
   x = x + i
   print x
}


Answer: 2 4 7 11

Q99
n = 10
count = 0
for(i = 1; i <= n; i = i + 1)
{
   if(i % 3 == 0 or i % 5 == 0)
      count = count + 1
}
print count


Answer: 5 (3, 5, 6, 9, 10)

Q100
i = 1
while(i <= 3)
{
   j = 1
   while(j <= 2)
   {
      print i+j
      j = j + 1
   }
   i = i + 1
}


Answer:
2 3 3 4 4 5
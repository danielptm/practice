import math
import operator
from functools import reduce

from src.problems.project_euler.Util import is_prime_naiive, sum_nums_div_3


class ProjectEuler:
    '''
    https://projecteuler.net/problem=1
    <p>If we list all the natural numbers below $10$ that are multiples of $3$ or $5$, we get $3, 5, 6$ and $9$. The sum of these multiples is $23$.</p>
    <p>Find the sum of all the multiples of $3$ or $5$ below $1000$.</p>
    '''

    def problem1(self, limit):
        nums = []
        for i in range(limit):
            if i % 3 == 0:
                if i not in nums:
                    nums.append(i)
            if i % 5 == 0:
                if i not in nums:
                    nums.append(i)
        res = reduce(operator.add, nums)
        return res

    '''
    https://projecteuler.net/problem=2
    <p>Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with $1$ and $2$, the first $10$ terms will be:
    $$1, 2, 3, 5, 8, 13, 21, 34, 55, 89, \dots$$</p>
    <p>By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.</p>
    '''
    def problem2(self):
        return 1


    def problem3(self, num):
        '''
        https://projecteuler.net/problem=3
        <p>The prime factors of $13195$ are $5, 7, 13$ and $29$.</p>
        <p>What is the largest prime factor of the number $600851475143$?</p>
        Use sieve of erathosthenes algorithm.
        https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
        '''
        pass




    '''
    https://projecteuler.net/minimal=4
    <p>A palindromic number reads the same both ways. The largest palindrome made from the product of two $2$-digit numbers is $9009 = 91 \times 99$.</p>
    <p>Find the largest palindrome made from the product of two $3$-digit numbers.</p>
    '''

    def problem4(self):
        return 1
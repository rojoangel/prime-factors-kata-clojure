(ns factors.core-test
  (:use midje.sweet)
  (:use [factors.core]))

(facts "about prime factors"
       (fact "one has no prime factors"
             (prime 1) => [])
       (fact "two has two as prime factor"
             (prime 2) => [2])
       (fact "three has three as prime factor"
             (prime 3) => [3])
       (fact "four has two & two as prime factors"
             (prime 4) => [2 2])
       (fact "six has two & three as prime factors"
             (prime 6) => [2 3])
       (facts "eight has two, two & two as prime factors"
              (prime 8) => [2 2 2])
       (facts "nine has three & three as prime factors"
              (prime 9) => [3 3]))

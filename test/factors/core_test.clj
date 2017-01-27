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
             (prime 4) => [2 2]))

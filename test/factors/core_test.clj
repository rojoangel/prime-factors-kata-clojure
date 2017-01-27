(ns factors.core-test
  (:use midje.sweet)
  (:use [factors.core]))

(facts "about prime factors"
       (fact "one has no prime factors"
             (prime 1) => [])
       (fact "two has two as prime factor"
             (prime 2) => [2]))

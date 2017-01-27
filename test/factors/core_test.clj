(ns factors.core-test
  (:use midje.sweet)
  (:use [factors.core]))

(facts "about prime factors"
       (fact "one has no prime factors"
             (prime 1) => []))
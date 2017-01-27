(ns factors.core)

(defn prime [int]
  (loop [int int
         divisor 2
         factors []]
    (if (< int divisor)
      factors
      (if (= 0 (mod int divisor))
        (recur (quot int divisor) divisor (conj factors divisor))
        (conj factors int)))))

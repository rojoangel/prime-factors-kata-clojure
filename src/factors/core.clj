(ns factors.core)

(defn prime [int]
  (loop [int int factors []]
    (if (< int 2)
      factors
      (if (= 0 (mod int 2))
        (recur (quot int 2) (conj factors 2))
        (conj factors int)))))

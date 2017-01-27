(ns factors.core)

(defn prime
  ([int]
    (prime int []))
  ([int factors]
   (if (> int 1)
     (if (= 0 (mod int 2))
       (prime (quot int 2) (conj factors 2))
       (conj factors int))
     factors)))

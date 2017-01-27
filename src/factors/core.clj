(ns factors.core)

(defn prime
  ([int]
    (prime int []))
  ([int factors]
   (if (> int 1)
     (if (= 0 (mod int 2))
       (let [new-int (quot int 2)]
         (if (> new-int 1)
           (conj (conj factors 2) new-int)
           (conj factors 2)))
       (conj factors int))
     factors)))

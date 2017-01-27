(ns factors.core)

(defn prime [int]
  (if (> int 1)
    (conj [] 2)
    []))

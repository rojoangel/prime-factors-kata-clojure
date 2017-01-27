(ns factors.core)

(defn prime [int]
  (if (> int 1)
    (if (= 0 (mod int 2))
      (let [new-int (quot int 2)]
        (if (> new-int 1)
          (conj (conj [] 2) new-int)
          (conj [] 2)))
      (conj [] int))
    []))

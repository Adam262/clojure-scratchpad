(ns alphabet-cipher.core
  (:gen-class)
  (:require [clojure.string :as string])
  )

(def alphabet "abcdef")
(defn idx [character] (string/index-of alphabet character))
(defn make-grid [memo char] (assoc memo char (str (subs alphabet (idx char)) (subs alphabet 0 (idx char)))))
(def grid (reduce make-grid {} alphabet))
(defn encode [keyword message] ())

(defn -main
  [& args]

  (println alphabet)
  (println (idx "c"))
  (println grid)
)

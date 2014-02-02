(ns foreclojureall
  (:require [clojure.test :refer :all]))

(load "lt_report")

;;  Nth Element
;;  Write a function which returns the Nth element from a sequence.

(def __ "TODO")

(with-lt-output
  (is (= (__ '(4 5 6 7) 2) 6)
))

(with-lt-output
  (is (= (__ [:a :b :c] 0) :a)
))

(with-lt-output
  (is (= (__ [1 2 3 4] 1) 2)
))

(with-lt-output
  (is (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
))


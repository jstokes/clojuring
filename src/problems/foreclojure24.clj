(ns foreclojureall
  (:require [clojure.test :refer :all]))

(load "lt_report")

;;  Sum It All Up
;;  Write a function which returns the sum of a sequence of numbers.

(def __ "TODO")
(with-lt-output
  (is (= (__ [1 2 3]) 6)
))

(with-lt-output
  (is (= (__ (list 0 -2 5 5)) 8)
))

(with-lt-output
  (is (= (__ #{4 2 1}) 7)
))

(with-lt-output
  (is (= (__ '(0 0 -1)) -1)
))

(with-lt-output
  (is (= (__ '(1 10 3)) 14)
))


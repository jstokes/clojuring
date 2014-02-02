(ns foreclojureall
  (:require [clojure.test :refer :all]))

(load "lt_report")

;;  Reverse a Sequence
;;  Write a function which reverses a sequence.

(def __ "TODO")

(with-lt-output
  (is (= (__ [1 2 3 4 5]) [5 4 3 2 1])
))

(with-lt-output
  (is (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
))

(with-lt-output
  (is (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
))


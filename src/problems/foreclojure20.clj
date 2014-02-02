(ns foreclojureall
  (:require [clojure.test :refer :all]))

(load "lt_report")

;;  Penultimate Element
;;  Write a function which returns the second to last element from a sequence.

(def __ "TODO")

(with-lt-output
  (is (= (__ (list 1 2 3 4 5)) 4)
))

(with-lt-output
  (is (= (__ ["a" "b" "c"]) "b")
))

(with-lt-output
  (is (= (__ [[1 2] [3 4]]) [1 2])
))


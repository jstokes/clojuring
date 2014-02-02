(ns foreclojureall
  (:require [clojure.test :refer :all]))

(load "lt_report")

;;  Last Element
;;  Write a function which returns the last element in a sequence.

(def __ "TODO")

(with-lt-output
  (is (= (__ [1 2 3 4 5]) 5)
))

(with-lt-output
  (is (= (__ '(5 4 3)) 3)
))

(with-lt-output
  (is (= (__ ["b" "c" "d"]) "d")
))


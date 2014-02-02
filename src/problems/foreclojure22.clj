(ns foreclojureall
  (:require [clojure.test :refer :all]))

(load "lt_report")

;;  Count a Sequence
;;  Write a function which returns the total number of elements in a sequence.

(def __ "TODO")

(with-lt-output
  (is (= (__ '(1 2 3 3 1)) 5)
))

(with-lt-output
  (is (= (__ "Hello World") 11)
))

(with-lt-output
  (is (= (__ [[1 2] [3 4] [5 6]]) 3)
))

(with-lt-output
  (is (= (__ '(13)) 1)
))

(with-lt-output
  (is (= (__ '(:a :b :c)) 3)
))


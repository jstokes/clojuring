(ns foreclojureall
  (:require [clojure.test :refer :all]))

(load "lt_report")

;;  Sequences: filter
;;  The filter function takes two arguments: a predicate function (f) and a sequence (s).  Filter returns a new sequence consisting of all the items of s for which (f item) returns true.

(def __ "TODO")

(with-lt-output
  (is (= __ (filter #(> % 5) '(3 4 5 6 7)))
))


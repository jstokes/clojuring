(ns foreclojureall
  (:require [clojure.test :refer :all]))

(load "lt_report")

;;  Sequences: map
;;  The map function takes two arguments: a function (f) and a sequence (s).  Map returns a new sequence consisting of the result of applying f to each item of s.  Do not confuse the map function with the map data structure.

(def __ "TODO")

(with-lt-output
  (is (= __ (map #(+ % 5) '(1 2 3)))
))


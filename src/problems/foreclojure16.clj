(ns foreclojureall
  (:require [clojure.test :refer :all]))

(load "lt_report")

;;  Hello World
;;  Write a function which returns a personalized greeting.

(def __ "TODO")

(with-lt-output
  (is (= (__ "Dave") "Hello, Dave!")
))

(with-lt-output
  (is (= (__ "Jenn") "Hello, Jenn!")
))

(with-lt-output
  (is (= (__ "Rhea") "Hello, Rhea!")
))


(ns foreclojure6
  (:require [clojure.test :refer :all]))

(def __ "TODO")

  (is (= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))

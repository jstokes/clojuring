(ns foreclojure10
  (:require [clojure.test :refer :all]))

(def __ "TODO")

  (is (= __ ((hash-map :a 10, :b 20, :c 30) :b)))
    (is (= __ (:b {:a 10, :b 20, :c 30})))

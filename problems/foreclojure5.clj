(ns foreclojure5
  (:require [clojure.test :refer :all]))

(def __ "TODO")

  (is (= '(1 2 3 4) (conj '(2 3 4) 1)))
  (is (= '(1 2 3 4) (conj '(3 4) 2 1)))

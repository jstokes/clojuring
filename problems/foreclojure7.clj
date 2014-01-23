(ns foreclojure7
  (:require [clojure.test :refer :all]))

(def __ "TODO")

  (is (= [1 2 3 4] (conj [1 2 3] 4)))
  (is (= [1 2 3 4] (conj [1 2] 3 4)))

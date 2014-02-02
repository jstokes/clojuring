(ns foreclojure15
  (:require [clojure.test :refer :all]))

(def __ "TODO")

  (is (= ((fn [x] (* 2 x)) 2) 4))
    (is (= (multiply-by-two 3) 6))
    (is (= (#(* % 2) 11) 22))
    (is (= ((partial * 2 ) 7) 14))


    (defn multiply-by-two
      [x]
      (* 2 x))


    (defn add-some-numbers
      [x y]
      (+ x y))

    (add-some-numbers 3 4)

    (def add-two
      (partial add-some-numbers 2))

      (add-two 4)
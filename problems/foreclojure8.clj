(ns foreclojure8
  (:require [clojure.test :refer :all]))

(def __ "TODO")

  (is (= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d))))
  (is (= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d})))

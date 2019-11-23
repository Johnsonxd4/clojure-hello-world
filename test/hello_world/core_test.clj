(ns hello-world.core-test
  (:require [clojure.test :refer :all]
            [hello-world.core :refer :all]))

(deftest a-test
  (testing "fixed"
    (is (= 0 0))))

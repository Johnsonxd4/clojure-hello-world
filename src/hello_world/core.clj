(ns hello-world.core
  (:require
   [hello-world.mystrings :refer :all])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def my-splitted-string-as-array (split-string "I'm Johnson. I'm learning clujure, it's really fun."))
  (println "My resulting array => " my-splitted-string-as-array)
  (println "My last item of array => " (last my-splitted-string-as-array))  
  (println "My first item of array => " (first my-splitted-string-as-array))
  (println "Get item by index => " (nth my-splitted-string-as-array 4))
  (println "only odd number ?" (filter odd? (range 10)))
  (println "only even number ?" (filter even? (range 10)))
)


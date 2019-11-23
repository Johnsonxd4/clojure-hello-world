(ns hello-world.core
  (:require
   [hello-world.mystrings :refer :all]
   [hello-world.mymathfn :refer :all]
  [hello-world.age :refer :all]
   )
  (:gen-class))
(require 'clojure.tools.trace)
(def my-splitted-string-as-array (split-string "I'm Johnson. I'm learning clujure, it's really fun."))
(defn ^:dynamic fib[n] (if (< n 2) n (+ (fib (- n 1)) (fib (- n 2)))))
(defn ^:dynamic runeverything []
  (println "My resulting array => " my-splitted-string-as-array)
  (println "My last item of array => " (last my-splitted-string-as-array))  
  (println "My first item of array => " (first my-splitted-string-as-array))
  (println "Get item by index => " (nth my-splitted-string-as-array 4))
  (println "only odd number ?" (filter odd? (range 10)))
  (println "only even number ?" (filter even? (range 10)))
  (println "triplicate the number 10" (triplicate 10))
  ;;(println "can drive" (can-drive 1995 8 5))
  (println "something is doing pretty good")
  (println "Executando a função fibonacci => "(fib 10))
   
)
(defn -main
  [& args]
  (runeverything)
  (println "Visualizando o trace de funções chamadas => " (clojure.tools.trace/dotrace [fib] (fib 10)))
  )




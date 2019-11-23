;;namespaces must match with filename (AFAIK)
(ns hello-world.mystrings)
;; with this 'require', i'm able to access all the string functions 
(require '[clojure.string :as str])
(defn split-string [x] (str/split x #" "))
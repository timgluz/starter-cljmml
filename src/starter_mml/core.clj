(ns starter-mml.core
  (:require [clj-mml.recommenders.itemrecommendation :as itemrecommendation])
  (:use [clj-mml.recommenders.core])
  )

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main [& args]
  (apply println "Received args:" args)
  (let [oracle (itemrecommendation/init :MostPopular)]
    (println (to-string oracle)))
  )

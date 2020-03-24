(ns tutorial.Exceptions)

(defn ExHandling
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println "Caught Exception" (.getMessage e )))
    (catch Exception e (println "Caught Generic Exception"))
    (finally (println "cleanup and move on"))
    )

  )
(ExHandling "hello")

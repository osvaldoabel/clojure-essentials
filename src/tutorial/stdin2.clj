(ns tutorial.stdin2)

(defn -main
  "Read from STDIN"
  [& args]
  (println "Enter text:")

  (loop [input (read-line)]
    (when-not (= ":done" input)
      (println (str "You entered: >>" input "<<"))
      (recur (read-line))))

  (println "End"))

(-main)
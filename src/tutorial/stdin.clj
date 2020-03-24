(ns tutorial.stdin)

(defn do-something-cool [v]
  (println v))

(defn -main
  "Read from STDIN"
  [& args]
  (println "Enter text:")

  (loop [input (read-line) acc []]
    (if (= ":done" input)
      (do-something-cool acc)
      (recur (read-line) (conj acc input))))

  (println "End"))

(-main)

(ns tutorial.stdin3)

;; read from STDIN
(line-seq (java.io.BufferedReader. *in*))
(map #(Integer/parseInt %) (line-seq (java.io.BufferedReader. *in*)))

;; write elements of a sequence, line by line, to STDOUT
(doseq [elm result] (print (str elm "\n")))

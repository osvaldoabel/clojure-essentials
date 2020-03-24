(ns tutorial.Loops)

; tipo um WHILE
(defn Loop
  []
  (println "Loop: ")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x)))
    )
  )
(Loop)

; tipo um FOR
(defn Dotimes
  []
  (println "DoTimes")
  (dotimes [x 10]
    (println x)
    )
  )
(Dotimes)

; tipo um WHILE DO
(defn WhileDo
  [count]
  (println "WhileDo: ")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc)
      )
    )
  )
(WhileDo 10)

;sequence
(defn DoSeq
  [seq]
  (println "DoSeq:")
  (doseq [x seq]
    (println (inc x))
    )
  )
(DoSeq [6 3 5 8 4 2 6])
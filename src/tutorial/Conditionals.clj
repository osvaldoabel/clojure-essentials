(ns tutorial.Conditionals)
; simples IF
(defn CondIf
  [],
  (println "Condif: ")
  (if (= 5 6)
    (println "Equals")
    (println "Not equals")
    ))
(CondIf)

;simple if - com varias linhas dentro de cada condição
(defn CondIfDo
  [],
  (println "CondifDO:")
  (if (= 9 5)
    (do (println "Equal first statment")
        (println "second Statment"))
    (do (println "Not Equal first statement")
        (println "second statement"))
    )
  )
(CondIfDo)

;if aninhado
(defn CondNestedIf
  [],
  (println "NestedIF: ")
  (if (and (= 5 5) (or (= 2 2) (not true)))
    (println "True")
    (println "false")
    ))

(CondNestedIf)

; CondCase
(defn CondCase
  [pet]
  (println "CondCase:")
  (case pet
    "cat" (println "I have a cat ")
    "dog" (println "I have a Dog ")
    "goldfish" (println "I have a goldfish")
    ))
(CondCase "dog")


;cond
(defn CondCond
  [amount]
  (println "CondCond: ")
  (cond
    (<= amount 2) (println "Few")
    (<= amount 10) (println "Several")
    (<= amount 100) (println "Many")
    :else (println "Loads")

    ))
(CondCond 5)
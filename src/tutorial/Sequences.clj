(ns tutorial.Sequences)

(defn Seq
  []
  (def colors (seq ["red" "green" "blue"]))
  (println colors)

  ;adiciona um elemento no começo de uma sequence
  ; se o segundo parametro nao for sequence ele transforma em sequence
  (println (cons "yellow" colors))
  (println (cons colors "yellow"))

  ; é mais inteligente. mantem a estrutura e adiciona o elemento de um jeito que
  ;faça mais sentido.
  (println (conj colors "yellow" ))
  (println (conj ["red" "green" "blue"] "yellow" ))

  ; junta 2 estruturas (ou concatena)
  (println (concat colors (seq ["black" "white"]) ))

  ;distinct retorna/pega apenas os que nao estao repetidos
  (println (distinct (seq [1 2 3 5 3 5 2 4]) ))

  ; reverse apenas inverte a ordem
  (println (reverse colors))
  (println colors)

  (println (first colors))
  (println (rest colors))
  (println (last colors))
  (println (sort (seq [1 2 3 5 3 5 2 4])))

  )
(Seq)
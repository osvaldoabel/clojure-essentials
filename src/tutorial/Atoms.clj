(ns tutorial.Atoms)

(defn Atoms
  []
  (def amount (atom 100))
  (println @amount)

  ; swap! altera o valor do atom garantindo que
  ; apenas essa thread altere esse valor nesse momento
  (swap! amount inc )
  (println @amount)

  ; thread safe way to update this atom
  ; altera o valor do atom
  (reset! amount 110)
  (println @amount )

  ; compare-and-set basicamente funciona como um replace. aonde estiver X coloca Y
  ; do contrario nao faz nada.
  (compare-and-set! amount 110 120)
  (println @amount )

  (compare-and-set! amount 110 150)
  (println @amount )


  )
(Atoms)
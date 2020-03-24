(ns tutorial.BankTransactions)


(def buyerAccount (ref 100))
(def merchantAccount (ref 0))
(def prices {'pen 1, 'notebook 5, 'backpack 90} )
(def items (ref []))


(defn printInfo
  []
  (println "\nPrintInfo:")
  (println "\nBuyer Account:" @buyerAccount)
  (println "\nMerchant Account:" @merchantAccount)
  (println "Items: " @items)
  )

(defn buy
  [item]
  (def itemPrice (get prices item))

  (if (<= itemPrice @buyerAccount )
    (dosync
      (ref-set merchantAccount (+ @merchantAccount itemPrice))
      (ref-set buyerAccount (- @buyerAccount itemPrice))
      ;;depois tenho que refatorar
      (def newItems (cons item @items))
      (ref-set items newItems)
      )
    (println "Insuficient funds")
    )
  (printInfo)
  )

(buy 'pen )
(buy 'notebook )
(buy 'backpack )
(buy 'backpack )
(buy 'backpack )
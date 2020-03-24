(ns tutorial.Destructuring)

(defn Destruct
  [],
  (def myVect [1 2 3 4 5 6 7 8 9])
  (let [[a b c d] myVect] (println a b c d))
  (let [[a b c & rest] myVect] (println a b c rest))


  (def myMap {'name "john" 'lastname "Smith"})
  (let [{a 'name b 'lastname} myMap] (println a b))
  (let [{a 'name b 'lastname c 'noname} myMap] (println a b c))
  )
(Destruct)
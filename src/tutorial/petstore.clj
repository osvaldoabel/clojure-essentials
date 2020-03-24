(ns tutorial.petstore
  (:gen-class))

(defn petToHumanAge
  "This function return the age of a pet in human years"
  [x]
  (def petstore {'dog 7, 'cat 5, 'goldfish 10})
  (get petstore x)
  )

(defn age
  "this function returns the age of a pet"
  [petName petType petAge]
  (def ratio (petToHumanAge petType))
  (println petName "is " (* ratio petAge) "years old in human years")
  )

(age "fido" 'dog 4)
(age "fifi" 'cat 2)
(age "Bubbles" 'goldfish 10)


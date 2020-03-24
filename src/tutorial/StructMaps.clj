(ns tutorial.StructMaps)

(defn Pets
  []
  (defstruct pet :PetType :PetName)
  (def myPet (struct pet "dog" "fido"))
  (println myPet)

  (def myOtherPet (struct-map pet :PetName "Fifi" :PetType "cat"))
  (println myOtherPet)
  (println (:PetName myPet))
  (println (:PetType myOtherPet))

  ; update attributes of the struct
  (def myNewPet (assoc myPet :PetName "Max"))
  (println (:PetName myNewPet))

  (def myNewOtherPet (assoc myOtherPet :PetAge 42))
  (println myNewOtherPet)
  )

(Pets)
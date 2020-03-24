(ns tutorial.CarDealership)

(defn isCodeValid
  [code]
  (defstruct coupon :Name :Discount)
  (def validCoupon (struct coupon "20Percent" 0.8))
  (if (= (:Name validCoupon) code )
    true
    false
    )
  )

(defn getCarPrices
  [budget code]
  (def cars {"bmw" 60000, "ferrari" 100000, "fiat" 20000})

  (if (isCodeValid code)
    ; primeira condição
    (do
      (println "the code is valid")
      (def discount (:Discount validCoupon))
      (doseq [car cars]
        (def carType (first car))
        (def price (last car))
        (def priceDiscount (* price discount))
        (if (<= priceDiscount budget)
          (println "the " carType "costs" priceDiscount)
          )
        )
      )
    ; outra condição
    (do
      (println "the code is Invalid")
      (doseq [car cars]
        (def carType (first car))
        (def price (last car))
        (if (<= price budget)
          (println "the " carType "costs" price)
          )
        )
      )
    )

    )

(getCarPrices 50000 "20Percent")


(ns tutorial.Console)

(require '[lanterna.terminal :as t])

(def term (t/get-terminal :swing))

(def put-character-to-term (partial t/put-character term))
(def write #(dorun (map put-character-to-term %)))

(write " My name is Steve!")

(t/start term)

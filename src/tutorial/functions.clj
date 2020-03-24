(ns tutorial.functions
  (:gen-class))

(defn -main
  "First Function"
  []
  (println "My name is osvaldo abel")
  (println "Loving Clojure so far")
  (+ 2 4))

(#(println "hello" %1 "you are the best One") "Abel - Software Engineer at Nubank")

(def increment (fn [x] (+ x 1)))

(defn increment_set
  [x]
  (map increment x))


; ate  aqui eu entendi  que
; usamos 'def' para criar funcções que serão chamadas por
; outras funções (tipo funções anonimas)
;
; e usamos defn para criar funções normais que podem ser chamadas num nivel mais
;alto ou por nos pelo console.
;


; ALGUNS dos tipos de daos em clojure
(defn DataTypes []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12) ; float cientifico
  (def d 0xfbfc)   ; hexadecimal
  (def e nil)   ; hexadecimal
  (def f true)   ; boolean
  (def f "hello")   ; string
  (def h 'thanks)

  (def status true)
  (def STATUS false)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println h)

  (println status)
  (println STATUS)
  )


; SET #{}, #{1, 2, "hello world} SET é imutável, baseado em árvore. (muito eficiente)
; e pode ter valores com diferentes tipos de dados

; MAP () {}
; - imutabel
; - baseado em HASH , HASH TABLES
; tbm é eficiente
; #{:chave "valor"}
; tbm pode ter valores com diferentes tipos de dados

; VECTOR (sao como arrays normal)
; - Arrays
; eficiente
; pode ter valores com diferentes tipos de dados
; []

; LIST
; (1 2 3 4) pode ter qualquer tipo de dados
; inclusive dentro de uma lista pode ter várias listas ( ())

(DataTypes)


; CHALLENGE:
; FUNCTION THAT GIVES US THE AGE OF A PÉT IN HUMAN YEARS
*(defn petToHumanAge
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
(age "Bubbles" 'goldfish 10)*
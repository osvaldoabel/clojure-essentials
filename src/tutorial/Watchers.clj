(ns tutorial.Watchers)

(defn Watch
  [],
  (def x (atom 5))
  (add-watch x :watcher
             (fn [key, atom old-state new-state]
               (println key)
               (println atom)
               (println old-state)
               (println new-state)
               ))
  (reset! x 10 )
  (remove-watch x :watcher)
  (reset! x 15)
  )

(Watch)
(ns hello-world.age)
(require '[tick.alpha.api :as t])
(require '[tick.core])
(defn can-drive [year month day]
    (.until (t/now ) (t/new-date year month day) (tick.core/unit-map :years))
)
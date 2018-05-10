(ns com.ar.fiuba.tdd.clojure.template
 (:require
  [com.ar.fiuba.tdd.clojure.processor.data_processor :refer :all]
  [clojure.data.json :as json])
 (:import
   [com.ar.fiuba.tdd.clojure.processor.state State])
 (:gen-class
 :name com.ar.fiuba.tdd.clojure.template
 :methods [
  #^{:static true} [initializeProcessor [String] Object]
  #^{:static true} [processData [String String] Object]
  #^{:static true} [queryCount [String String String] Long]
  ])
)

(defn stateToString [s]
  (str
    {:state {:rules (:rules  s), :counters (:counters s), :history (:history s)}}
  )
)

(defn -initializeProcessor [rules]
    (def s (initialize-processor (first (rest (read-string rules))) ))
    (stateToString s)
)

(defn -processData [state data]
    (def s (read-string state))
    (let [[st sg]
      (process-data
        (new State (:rules s) (:counters s) (:history s))
        (read-string data)
      )]
      [(stateToString st) sg]
    )

)

(defn -queryCount [state counter-name counter-args]
    (def s (read-string state))
    (let [s0 (new State (:rules s) (:counters s) (:history s))]
      (query-counter s0 (read-string counter-name) (read-string counter-args))
    )
)

(defn -main []
  (println "Hello, World!"))

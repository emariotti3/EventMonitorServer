(ns com.ar.fiuba.tdd.clojure.processor.data_processor
  (:require [com.ar.fiuba.tdd.clojure.processor.state :refer :all])
  (:require [com.ar.fiuba.tdd.clojure.protocols.protocols])
  (:import [com.ar.fiuba.tdd.clojure.protocols.protocols Evaluable])
  (:import [com.ar.fiuba.tdd.clojure.protocols.protocols Countable])
)

; Initialice the processor with rules
;
; @params : Rules list of rules
;
; @returns : State of an empty system
(defn initialize-processor [rules]
  (get-init-state rules)
)

; Processes the data given a current state
;
; @params : state     the current state of the system
;           new-data  A data input
;
; @returns :  [new-state generated-data]
;             new-state       the state of the systen given the process of the data
;             generated-data  the data output
(defn process-data [state new-data]
  (com.ar.fiuba.tdd.clojure.protocols.protocols/evaluate state new-data)
)

; Returns the numerical ammount of a counter given some parámeters
;
; @params : state         the current state of the system
;           counter-name  name of counter to evaluate
;           counter-args  arguments given to the parámeters
;
; @returns : numerical value of the counter with the parámeters
(defn query-counter [state counter-name counter-args]
  (com.ar.fiuba.tdd.clojure.protocols.protocols/get-count state counter-name counter-args)
)

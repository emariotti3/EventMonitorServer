(ns com.ar.fiuba.tdd.clojure.protocols.protocols)

; Signature of thata that may be evaluable
(defprotocol Evaluable
  (evaluate [this data])
)

; Signature
(defprotocol Countable
  (get-count [this counter-name counter-args])
)


(defprotocol Initialize
  (initialize [this])
)

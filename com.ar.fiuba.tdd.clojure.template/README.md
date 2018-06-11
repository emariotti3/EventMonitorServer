# com.ar.fiuba.tdd.clojure.template

A Clojure library designed to serve as a rule engine.

## Usage

There are three basic functions that can be invoked:

* -initializeProcessor[rules] : initialize the processor with a set of rules.
* -processData[state data] : given a current processor state and some new input data, produce a new state.
* -queryCount[state counter-name counter-args] : given a state and a counter's name and arguments, return the current count for that counter.

## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

(defproject alphabet-cipher "0.1.0-SNAPSHOT"
  :description "an alphabet cipher from wonderland-clojure-katas"
  :url "https://github.com/Adam262/wonderland-clojure-katas/tree/master/alphabet-cipher"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot alphabet-cipher.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

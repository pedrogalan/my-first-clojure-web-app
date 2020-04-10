(ns my-first-clojure-web-app.core
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn handler [_]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello world"})

(defn -main []
  (run-jetty handler {:port 3000}))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

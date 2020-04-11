(ns my-first-clojure-web-app.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [clojure.pprint     :refer [pprint]]
            [compojure.core     :refer [routes GET]]
            [compojure.route    :refer [not-found]]))

(def my-routes
  (routes
    (GET "/endpoint-a"  [] "<h1>Hello endpoint A</h1>")
    (GET "/endpoint-b"  [] "<h1>Hello endpoint B</h1>")
    (not-found "<h1>Page not found</h1>")))

(defn handler [request]
  (clojure.pprint/pprint request)
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello world!"})

(defn -main []
  (run-jetty my-routes {:port 3000}))

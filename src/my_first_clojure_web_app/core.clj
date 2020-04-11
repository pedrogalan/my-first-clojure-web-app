(ns my-first-clojure-web-app.core
  (:require [ring.adapter.jetty   :refer [run-jetty]]
            [clojure.pprint       :refer [pprint]]
            [compojure.core       :refer [routes GET POST]]
            [compojure.route      :refer [not-found]]
            [ring.middleware.json :refer [wrap-json-response wrap-json-body]]
            [ring.util.response   :refer [response]]))

(def my-routes
  (routes
    (GET  "/endpoint-a" []      (response {:endpoint "A"}))
    (GET  "/endpoint-b" []      (response {:endpoint "B"}))
    (POST "/debug"      request (response (with-out-str (clojure.pprint/pprint request))))
    (not-found "<h1>Page not found</h1>")))

(def app
  ; Regular notation
  ;(wrap-json-response (wrap-json-body my-routes)))

  ; Using "->" is arguably clearer. The result is the same.
  (-> my-routes
       wrap-json-body
       wrap-json-response))

(defn -main []
  (run-jetty app {:port 3000}))

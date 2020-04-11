(defproject my-first-clojure-web-app "0.1.0-SNAPSHOT"
  :description "Simple web app to get started with Clojure."
  :url "http://pedrogalan.es"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring "1.7.1"]
                 [compojure "1.6.1"]
                 [ring/ring-json "0.5.0"]]
  :repl-options {:init-ns my-first-clojure-web-app.core}
  :main my-first-clojure-web-app.core)

(defproject blog-compojure "0.1.0-SNAPSHOT"
  :description "A trial Clojure project for a blog post about Compojure."
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.0"]
                 [ring/ring-defaults "0.3.1"]]
  :plugins [[lein-ring "0.12.1"]]
  :ring {:handler blog-compojure.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.1"]]}})

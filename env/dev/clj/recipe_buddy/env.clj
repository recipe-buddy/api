(ns recipe-buddy.env
  (:require
   [selmer.parser :as parser]
   [clojure.tools.logging :as log]
   [recipe-buddy.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[recipe-buddy started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[recipe-buddy has shut down successfully]=-"))
   :middleware wrap-dev})

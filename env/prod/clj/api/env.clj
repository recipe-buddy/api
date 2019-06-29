(ns api.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[api started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[api has shut down successfully]=-"))
   :middleware identity})

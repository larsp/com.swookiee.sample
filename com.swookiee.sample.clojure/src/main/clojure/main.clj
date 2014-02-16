(ns main
  (:use
    (clojure.osgi core services)
  )
  (:import 
    (org.osgi.service.http HttpService)
    (org.osgi.util.tracker ServiceTrackerCustomizer)
	)
)


(defn- bundle-start [context]
  (println "Tracking HttpService")

  (track-service HttpService
    (reify ServiceTrackerCustomizer
      (addingService [_ reference]
        (let [service (.getService context reference)]
          ; register servlet
          ; http://www.osgi.org/javadoc/r4v42/org/osgi/service/http/HttpService.html
          (println "HttpService found")
        )
      )

      (removedService [_ reference service]
        (println "HttpService unregistered")
        (.ungetService context reference)
      )

      (modifiedService [_ reference service]
      )
    )
  )
)

(defn- bundle-stop[context]
  ; TODO:
  ; stop bundle tracker
)
## Deploy and run clojure sample

Before executing following statemenbts, make sure a swookiee instance is up and running (with default credentials)

```shell
cd com.swookiee.sample.clojure
mvn clean install -Pdeploy
```

The output in the swookiee console should look like this:
```
17:52:16.453 INFO  Bundle:com.swookiee.sample.clojure[:64] - BundleEvent INSTALLED
17:52:16.454 INFO  Bundle:com.swookiee.sample.clojure[:64] - BundleEvent RESOLVED
17:52:16.455 DEBUG Bundle:clojure.osgi[:61] - requiring main from bundle com.swookiee.sample.clojure_1.0.0.SNAPSHOT [69]
Tracking HttpService
17:52:16.938 DEBUG Bundle:clojure.osgi[:61] - invoking function main/bundle-start for bundle: com.swookiee.sample.clojure_1.0.0.SNAPSHOT [69]
HttpService found
17:52:16.941 INFO  Bundle:com.swookiee.sample.clojure[:64] - BundleEvent STARTED
```

## Life cycle issues
I sometimes (honestly most of the time) I had to restart the swookiee runtime completely in order to make sure that changes take any effect.

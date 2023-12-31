(ns main
  (:require [clojure.java.data :as j]))

(defn this-call-throws [_]
  ;; j/from-java-deep throws StackOverflowError
  (println "(j/from-java-deep Class) ;=> " (j/from-java-deep Class {})))


(defn this-call-works [_]
  (defmethod j/from-java-deep Class [clazz _] {:class clazz})
  (println "(j/from-java-deep Class) ;=> " (j/from-java-deep Class {})))



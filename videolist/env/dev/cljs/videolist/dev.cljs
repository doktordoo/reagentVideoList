(ns ^:figwheel-no-load videolist.dev
  (:require
    [videolist.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)

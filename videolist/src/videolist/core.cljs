(ns videolist.core
    (:require
      [reagent.core :as r]))

(defonce videos (r/atom (sorted-map)))      

;; -------------------------
;; Views

(defn videoitems []
  [:li.list-group-item
  [:div.video-list.media "video1" ]])

(defn videolist []
  [:ul.col-md-4.list-group [videoitems]])

(defn search-bar []
  [:div.search-bar [:input ]])

(defn home-page []
  [:div [:h2 "Welcome to videolist"]
  [search-bar]
  [videolist]]
  )
;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))

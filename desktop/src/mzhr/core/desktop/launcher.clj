(ns mzhr.core.desktop.launcher
  (:require [mzhr.core.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main []
  (LwjglApplication. (mzhr.core.core.Game.) "demo" 800 600)
  (Keyboard/enableRepeatEvents true))

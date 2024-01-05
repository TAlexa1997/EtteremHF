Készítette: Tóth Alexandra

# Bevezetés
Az Étterem Kezelő Program egy Java alkalmazás, amely egy virtuális étterem. Az alkalmazás lehetővé teszi az ételek megrendelését, elkészítését és fogyasztását. Az alkalmazás a MVC (Model-View-Controller) alapú.

## Modell
A modellban található osztályok a program modell részét alkotják. Ezek az osztályok reprezentálják az ételeket, desszerteket és az ételek állapotát.

Allapotok.java: Enum osztály az ételek állapotainak reprezentálására, például "FRISS", "KÉSZ", "ELFOGYOTT", "FOGYASZTHATÓ".
Desszert.java: Absztrakt osztály, amelyből a desszerteket örököli. Megvalósítja az étel elkészítését és fogyasztását.
DesszertTipus.java: Enum osztály a desszert típusok reprezentálására, például "PALACSINTA".
Etel.java: Absztrakt osztály, amelyből az ételeket örököli. Megvalósítja az étel megrendelését.
EtelTipus.java: Enum osztály az étel típusok reprezentálására, például "LEVES", "FOETEL".
Foetel.java: Az étterem főételét reprezentáló osztály, kiegészítve a fűszerezési információval.
Leves.java: Az étterem levesét reprezentáló osztály, kiegészítve a csípős opcióval.

## View
A viewban található osztályok a program nézet részét alkotják. Ezek az osztályok felelősek az információk megjelenítéséért a felhasználói felületen.
EtteremView.java: Osztály, amely a rendelt ételek és desszertek részleteinek kijelzését végzi a konzolon.
## Controller
A controllerben található osztályok a program vezérlő részét alkotják. Ezek az osztályok kezelik a felhasználói inputokat, és irányítják az alkalmazást.
EtteremController.java: Osztály, amely a felhasználói inputok kezelését végzi, és összekapcsolja a modellt és a nézetet.
## Main Program
A Main csomagban található EtteremProgram.java fájl tartalmazza a program belépési pontját. Itt példákat találunk arra, hogyan használjuk az étterem programot. 
Az étterem objektumok létrehozása, ételek és desszertek rendelése történik itt.

Figyelem: A fő belépési pont a EtteremProgram osztályban található!


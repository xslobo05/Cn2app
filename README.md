# Cn2app

This Eclipse Java project is a part of my bachelor thesis. Although this README is in English, the theses is written in Czech.

GUI app accesses Openweathermap API and Apify API to download weather data, which it uses to calculate refractive index structure parameter Cn2.

App was build using Eclipse IDE with WindowBuilder extension. Is works in symbiosis with a group of scripts and datasets in Apify cloud. Paid plans were used both for Apify and Openweathermap services.

User can display predicted values, generate charts of predicted values, past values and compare them. App allows adding new locations to the system.

Code has been exported into a runnable JAR file. Due to heap size limitations encoutered, the JAR has been further packaged to runnable EXE file with JVM argument -Xmx1024m to ensure enough memory has been allocated.

Tested on Windows 10 with Java 8 release 281.

[Main code](https://github.com/xslobo05/Cn2app/blob/master/src/app/views/appGui.java)

## Authors

- [@xslobo05](https://www.github.com/xslobo05)

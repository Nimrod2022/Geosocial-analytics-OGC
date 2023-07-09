### Mapping tweets on Google Earth Pro

The program uses GeoTools (modular open-source development toolkit used to implement
the OGC specifications to create a connection to a WMS) and OpenCSV (lightweight opensource library used to read and parse the CSV file) as external libraries.

Upon execution, the program completes the following tasks:
1. Downloads and parses a CSV file containing tweets and metadata;
2. Connects to a WMS and downloads an image showing OpenStreetMaps;
3. Writes the image and selected data from the CSV file into a KML (Keyhole Markup
Language) file; and
4. Opens the KML file with Google Earth.

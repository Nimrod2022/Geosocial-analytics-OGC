# Google Earth Tweet Mapper

## Introduction

Geosocial analytics has proved increasingly significant as a real-time data collection mechanism in recent years. It involves collecting, analyzing, and interpreting data from social media platforms to gain insights into geographic trends and patterns of user behavior. The goal of geosocial analytics is to identify and understand how social media users are discussing and engaging with specific topics, events, or issues in a particular geographic region.

Once the data has been collected, geospatial analysis can also be used to identify the geographic distribution of social media activity around particular topics or events. This can involve mapping the location of social media users who are discussing a particular topic or event or analyzing the distribution of activity across different geographic regions. 

During the COVID-19 pandemic, geosocial analytics was used to identify trending issues related to the spread of the virus. One of the main applications was tracking the spread of the virus and identifying hotspots or areas with a high concentration of cases. Additionally, it has significant contributions in disaster events to aid in response and management, providing real-time information on the location and extent of damage, the needs and concerns of affected communities, and the effectiveness of relief efforts.

Geoinformatics provides tools and techniques for collecting, processing, analyzing, and visualizing spatial data, while geosocial analytics focuses on analyzing social media data to gain insights into human behavior and societal trends. Coupling the two approaches allows deeper analysis and a comprehensive understanding of social phenomena and their spatial dimensions.

## Project Description

The **GoogleEarthTweetMapper** demonstrates one approach to geosocial analytics. This project uses a Java package called **GeoTools** to connect to a Web Map Service (WMS). GeoTools is a product of the Open Geospatial Consortium (OGC) that allows developers to create, read, write, and manipulate geospatial data in various formats such as shapefile, GeoJSON, KML, GML, and more. GeoTools supports a wide range of geospatial operations such as data visualization, spatial data processing, and analysis. It also supports integration with various geospatial databases and web services and provides APIs for developing geospatial applications.

The project is split into six classes to make the project more modular. Upon execution, the program completes the following tasks:

1. Downloads and parses a CSV file containing tweets and metadata.
2. Connects to a WMS and downloads an image showing OpenStreetMaps.
3. Writes the image and selected data from the CSV file into a KML (Keyhole Markup Language) file.
4. Opens the KML file with Google Earth.



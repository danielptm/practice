-- Query all columns for all American cities in CITY with populations larger than 100000. The CountryCode for America is USA.
--
-- See Input Format
--
-- The CITY table is described as follows:

SELECT * FROM CITY WHERE population > 100000 AND COUNTRYCODE='USA';

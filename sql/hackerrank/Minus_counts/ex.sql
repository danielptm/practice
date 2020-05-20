-- Select 2 counts which are distinct and return their difference.

SELECT (SELECT COUNT(*) FROM STATION) - (SELECT COUNT(DISTINCT CITY) FROM STATION)

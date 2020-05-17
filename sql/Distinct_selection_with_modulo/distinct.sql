-- Selects all cities from the station table that has an even number,
-- and dedups the result.

SELECT DISTINCT CITY FROM STATION WHERE (ID % 2) = 0

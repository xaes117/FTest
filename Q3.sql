SELECT b.name, COUNT(b.name) FROM country a, continent b WHERE a.continent_id = b.id GROUP BY b.name ORDER BY COUNT(b.name) DESC;

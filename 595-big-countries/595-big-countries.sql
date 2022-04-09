# Write your MySQL query statement below
# Below is mine written first query here in SQL on LeetCode :)
# Select name,population,area from World WHERE area>=3000000 OR population>=25000000;

# trying leetcode approach for faster results
SELECT name, population, area FROM world WHERE area >= 3000000 UNION
SELECT name, population, area FROM world WHERE population >= 25000000;
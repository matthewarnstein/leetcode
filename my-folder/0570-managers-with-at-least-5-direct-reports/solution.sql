SELECT
    E.name
FROM
    Employee E
JOIN
    (SELECT
        managerId,
        COUNT(id) AS reports
     FROM
        Employee
     GROUP BY
        managerId
     HAVING
        COUNT(id) >= 5) AS MgrReports ON E.id = MgrReports.managerId


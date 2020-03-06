<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Test</title>
</head>
<body>
    <ul>
    <#list techs as tech>
        <li>${tech.framework} (${tech.lang})</li>
    <#else>
    <li class="text-center">Список технологий пока пуст...</li>
    </#list>
    </ul>
</body>
</html>
<!DOCTYPE html>
<html>
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1>
<h4>Товары по всей Европе</h4>
<#list product as product>
    <div>
        <p><b>${product.title}</b> ${product.price} | <a href="/product/"${product.id}> Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать товар</h3>
<form action = "product/create" method="post">
    Название обьявления <input type="text" name = "title" >
    Описание обьявления <input type="text" name = "description" >
    Цена обьявления <input type="text" name = "price" >
    Город обьявления <input type="text" name = "city" >
    Имя пользователя <input type="text" name = "author" >
    <input type="submit" value="Добавить товар" />
</form>
</body>
</html>
# weatherapi

Тестовое приложение

При запросе на URL http://localhost:8080/getweather отправляется запрос на API Weatherbit
http://api.weatherbit.io/v2.0/forecast/daily?key=368f56f6fdcb4ed68776b6c43b080540&city=novosibirsk
(url зашит в src\main\java\ru\vkopyl\test\weatherapp\controller\WeatherController.java)

После получения данных от API происходит расчет значений из прогноза на 5 дней:
1) Средняя максимальная температура
2) Средняя температура
3) Средняя минимальная температура
4) Максимальная скорость ветра

Данные после расчета возвращаются в виде json
{
    "maxAvgTemp": 16.1875,
    "avgTemp": 13.106250000000001,
    "minAvgTemp": 8.5,
    "maxWindSpeed": 11.136309999999998
}

И записываются в БД PostgreSQL.

DDL для создания таблицы: 

CREATE TABLE WEATHER_DATA(
	
	id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
	maxAvgTemp double,
	avgTemp double,
	minAvgTemp double,
	maxWindSpeed double	
);

Параметры подключения к БД указываются в \weatherapi\src\main\resources\application.properties

Для запуска приложения запустить командную строку из корневой директории проекта (там, где pom.xml) и выполнить:
mvn spring-boot:run
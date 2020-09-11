package ru.vkopyl.test.weatherapp.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.vkopyl.test.weatherapp.model.ResponseData;

@Repository
public class ResponseDataDaoImpl implements ResponseDataDao {

    private final JdbcTemplate jdbcTemplate;

    public ResponseDataDaoImpl(JdbcTemplate jdbcTemplate){

        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(ResponseData responseData){

        String sql = "INSERT INTO weather_data (maxAvgTemp, avgTemp, minAvgTemp, MaxWindSpeed) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, responseData.getMaxAvgTemp(),
                                    responseData.getAvgTemp(),
                                    responseData.getMinAvgTemp(),
                                    responseData.getMaxWindSpeed());

    }

}

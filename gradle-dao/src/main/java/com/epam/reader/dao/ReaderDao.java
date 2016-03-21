package com.epam.reader.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by admin
 * on 20.03.2016.
 */
public class ReaderDao {
    private static final Logger logger = LoggerFactory.getLogger(ReaderDao.class);

    public String parseMsg() {
        String everything = "This is default message: file for parsing not found";
        try (InputStream inputStream =
                     getClass().getClassLoader().getResourceAsStream("msg.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            everything = reader.readLine();

        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }

        return everything;
    }
}

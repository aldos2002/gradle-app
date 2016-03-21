package com.epam.reader.dao;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by admin
 * on 20.03.2016.
 */
public class ReaderDaoTest {
    @Test
    public void parseMsgShouldGetCorrectMessageFromFile() throws IOException {
        //GIVEN
        ReaderDao readerDao = new ReaderDao();
        //THEN
        String msg = readerDao.parseMsg();
        //THEN
        assertThat(msg, equalTo("This is the text from \"message.txt\" file to check gradle functionality."));
    }
}

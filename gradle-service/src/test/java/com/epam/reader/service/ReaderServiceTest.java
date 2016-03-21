package com.epam.reader.service;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by admin
 * on 20.03.2016.
 */
public class ReaderServiceTest {
    @Test
    public void readMsgShouldGetCorrectMessageFromFile() throws IOException {
        //GIVEN
        ReaderService service = new ReaderService();
        //WHEN
        String msg = service.readMsg();
        //THEN
        Assert.assertThat(msg, IsEqual.equalTo("This is the text from \"message.txt\" file to check gradle functionality."));
    }
}

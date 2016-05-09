package com.epam.reader.web;

import com.epam.reader.service.ReaderService;

/**
 * Created by admin
 * on 20.03.2016.
 */
public class ReaderBean {
    ReaderService readerService = new ReaderService();

    public String read(){
        return readerService.readMsg();
    }
}

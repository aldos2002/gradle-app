package com.epam.reader.service;

import com.epam.reader.dao.ReaderDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ReaderService {

	private static final Logger logger = LoggerFactory.getLogger(ReaderService.class);

	public String readMsg() {
		ReaderDao readerDao = new ReaderDao();
		String msg = readerDao.parseMsg();
		logger.debug("readMsg() is executed! Message is: {}", msg);
		return msg;
	}
}
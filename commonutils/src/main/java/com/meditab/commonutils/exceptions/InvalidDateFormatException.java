/*
 * Copyright (c) 2016.
 *  Nirav Tukadiya
 *  Programmer Analyst ( Android)
 *  Meditab Software Inc.
 */

package com.meditab.commonutils.exceptions;

/**
 * @author niravt (Nirav Tukadiya)
 *         <p>
 *         Created on 9/6/16 7:25 PM.
 */

public class InvalidDateFormatException extends Exception {
    public InvalidDateFormatException(String detailMessage) {
        super(detailMessage);
    }

    public InvalidDateFormatException() {
        super("InvalidDateFormatException");
    }
}

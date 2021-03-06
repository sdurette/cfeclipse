/*
 * Created on Mar 21, 2004
 *
 * The MIT License
 * Copyright (c) 2004 Oliver Tupman
 *
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software 
 * is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 * SOFTWARE.
 */
package org.cfeclipse.cfml.parser.exception;

/**
 * @author Oliver Tupman
 *
 */
public class ParseException extends java.lang.Exception {
	public int lineNumber;
	public int docOffset = 0;
	/**
	 * 
	 */
	public ParseException() {
		super();
		// 
	}
	/**
	 * @param arg0
	 */
	public ParseException(String arg0) {
		super(arg0);
		// 
	}
	/**
	 * @param arg0
	 */
	public ParseException(Throwable arg0) {
		super(arg0);
		// 
	}
	/**
	 * @param arg0
	 * @param arg1
	 */
	public ParseException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// 
	}
	public ParseException(String arg0, int pLineNum) {
		super(arg0);
		lineNumber = pLineNum;
	}
	public ParseException(String arg0, int pLineNum, int pDocOffset)
	{
		super(arg0);
		lineNumber = pLineNum;
		docOffset = pDocOffset;
	}
	
	public ParseException(int pLineNum, int pDocOffset)
	{
		super();
		lineNumber = pLineNum;
		docOffset = pDocOffset;
	}
	
	public ParseException(int pLineNum)
	{
		super();
		lineNumber = pLineNum;
	}
}

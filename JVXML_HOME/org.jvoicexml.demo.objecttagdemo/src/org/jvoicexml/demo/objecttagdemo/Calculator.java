/*
 * File:    $HeadURL: https://svn.code.sf.net/p/jvoicexml/code/trunk/org.jvoicexml.demo.objecttagdemo/src/org/jvoicexml/demo/objecttagdemo/Calculator.java $
 * Version: $LastChangedRevision: 2440 $
 * Date:    $Date: 2010-12-23 09:18:46 +0100 (Thu, 23 Dec 2010) $
 * Author:  $LastChangedBy: schnelle $
 *
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2007-2010 JVoiceXML group - http://jvoicexml.sourceforge.net
 * The JVoiceXML group hereby disclaims all copyright interest in the
 * library `JVoiceXML' (a free VoiceXML implementation).
 * JVoiceXML group, $Date: 2010-12-23 09:18:46 +0100 (Thu, 23 Dec 2010) $, Dirk Schnelle-Walka, project lead
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Library General Public
 *  License as published by the Free Software Foundation; either
 *  version 2 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Library General Public License for more details.
 *
 *  You should have received a copy of the GNU Library General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
package org.jvoicexml.demo.objecttagdemo;

/**
 * A simple calculator to demo the object execution.
 *
 * @author Dirk Schnelle-Walka
 * @version $Revision: 2440 $
 * @since 0.6
 */
public final class Calculator {
    /** The overall sum. */
    private static int overallSum;

    /**
     * Adds the given numbers.
     * @param a first number to add.
     * @param b second number to add.
     * @return <code>a+b</code>
     */
    public int add(final Integer a, final Integer b) {
        overallSum += a + b;;
        return a + b;
    }

    /**
     * Retrieves the overall sum
     * @return <code>the overall sum</code>
     */
    public int getOverallSum() {
        return overallSum;
    }
}

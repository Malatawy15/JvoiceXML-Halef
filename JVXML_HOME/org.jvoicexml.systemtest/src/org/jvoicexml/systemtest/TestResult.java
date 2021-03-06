/*
 * File:    $HeadURL: https://svn.code.sf.net/p/jvoicexml/code/trunk/org.jvoicexml.systemtest/src/org/jvoicexml/systemtest/TestResult.java $
 * Version: $LastChangedRevision: 2324 $
 * Date:    $Date: 2010-08-24 13:15:39 +0200 (Tue, 24 Aug 2010) $
 * Author:  $LastChangedBy: schnelle $
 *
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2009-2010 JVoiceXML group - http://jvoicexml.sourceforge.net
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
package org.jvoicexml.systemtest;

/**
 * Result of a test.
 * @author Dirk Schnelle-Walka
 * @version $Revision: 2324 $
 * @since 0.7.3
 */
public enum TestResult {
    /**
     * A passed test.
     */
    PASS,
    /**
     * A failed test.
     */
    FAIL,
    /**
     * A skipped test.
     */
    SKIP,
    /**
     * A neutral test.
     */
    NEUTRAL;
}

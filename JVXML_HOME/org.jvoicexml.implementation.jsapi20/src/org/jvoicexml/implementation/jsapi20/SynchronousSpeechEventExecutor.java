/*
 * File:    $HeadURL: https://svn.code.sf.net/p/jvoicexml/code/trunk/org.jvoicexml.implementation.jsapi20/src/org/jvoicexml/implementation/jsapi20/SynchronousSpeechEventExecutor.java $
 * Version: $LastChangedRevision: 2355 $
 * Date:    $Date: 2010-10-07 20:28:03 +0200 (Thu, 07 Oct 2010) $
 * Author:  $LastChangedBy: schnelle $
 *
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2007-2009 JVoiceXML group - http://jvoicexml.sourceforge.net
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

package org.jvoicexml.implementation.jsapi20;

import javax.speech.SpeechEventExecutor;

/**
 * A {@link SpeechEventExecutor} that executes synchronously.
 * @author Renato Cassaca
 * @version $Revision: 2355 $
 * @since 0.6
 */
public final class SynchronousSpeechEventExecutor
    implements SpeechEventExecutor {
    /**
     * Constructs a new object.
     */
    public SynchronousSpeechEventExecutor() {
    }

    /**
     * {@inheritDoc}
     */
    public void execute(final Runnable command) {
        command.run();
    }
}

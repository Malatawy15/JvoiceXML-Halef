/*
 * File:    $HeadURL: https://svn.code.sf.net/p/jvoicexml/code/trunk/org.jvoicexml.implementation.jsapi10/src/org/jvoicexml/implementation/jsapi10/speakstrategy/EmphasisSpeakStrategy.java $
 * Version: $LastChangedRevision: 2583 $
 * Date:    $Date: 2011-02-16 17:02:39 +0100 (Wed, 16 Feb 2011) $
 * Author:  $LastChangedBy: schnelle $
 *
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2008-2011 JVoiceXML group - http://jvoicexml.sourceforge.net
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

package org.jvoicexml.implementation.jsapi10.speakstrategy;

import org.apache.log4j.Logger;
import org.jvoicexml.event.error.BadFetchError;
import org.jvoicexml.event.error.NoresourceError;
import org.jvoicexml.implementation.jsapi10.Jsapi10SynthesizedOutput;
import org.jvoicexml.xml.SsmlNode;

/**
 * SSML strategy to play back a <code>&lt;emphasis&gt;</code> node.
 * @author Dirk Schnelle-Walka
 * @version $Revision: 2583 $
 * @since 0.7.2
 */
final class EmphasisSpeakStrategy extends SpeakStrategyBase {
    /** Logger for this class. */
    private static final Logger LOGGER =
        Logger.getLogger(EmphasisSpeakStrategy.class);
    /**
     * {@inheritDoc}
     */
    public void speak(final Jsapi10SynthesizedOutput output,
            final SsmlNode node)
        throws NoresourceError, BadFetchError {
        LOGGER.warn("JSAPI 1.0 does not support emphasis: ignoring");
        speakChildNodes(output, node);
    }

}

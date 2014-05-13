/*
 * File:    $HeadURL: https://svn.code.sf.net/p/jvoicexml/code/trunk/org.jvoicexml.implementation.jsapi20/src/org/jvoicexml/implementation/jsapi20/Jsapi20SynthesisResult.java $
 * Version: $LastChangedRevision: 2682 $
 * Date:    $Date: 2011-05-30 09:39:56 +0200 (Mon, 30 May 2011) $
 * Author:  $LastChangedBy: schnelle $
 *
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2011 JVoiceXML group - http://jvoicexml.sourceforge.net
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

package org.jvoicexml.implementation.jsapi20;

import org.jvoicexml.SpeakablePhoneInfo;
import org.jvoicexml.SpeakableText;
import org.jvoicexml.SynthesisResult;

/**
 * Implementation of a {@link SynthesisResult} for the JSAPI 20 platform.
 *
 * @author Renato Cassaca
 * @author Dirk Schnelle-Walka
 * @version $Revision: 2682 $
 * @since 0.6
 */
public final class Jsapi20SynthesisResult implements SynthesisResult {
    /** The spoken text. */
    private final SpeakableText speakableText;

    /** Associated phone info. */
    private final SpeakablePhoneInfo[] speakablePhoneInfos;

    /**
     * Constructs a new object.
     * @param speakable the speakable text.
     * @param phoneInfos related phone infos.
     */
    public Jsapi20SynthesisResult(final SpeakableText speakable,
            final SpeakablePhoneInfo[] phoneInfos) {
        speakableText = speakable;
        speakablePhoneInfos = phoneInfos;
    }

    /**
     * Returns the phones generated.
     *
     * @return PhoneInfo[]
     */
    public SpeakablePhoneInfo[] getPhonesInfo() {
        return speakablePhoneInfos;
    }

    /**
     * Returns the speakable that produced this result.
     *
     * @return SpeakableText
     */
    public SpeakableText getSpeakable() {
        return speakableText;
    }
}
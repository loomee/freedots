/* -*- c-basic-offset: 2; indent-tabs-mode: nil; -*- */
/*
 * FreeDots -- MusicXML to braille music transcription
 *
 * Copyright 2008-2010 Mario Lang  All Rights Reserved.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 3, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * for more details (a copy is included in the LICENSE.txt file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License
 * along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This file is maintained by Mario Lang <mlang@delysid.org>.
 */
package freedots.music;

import freedots.math.Fraction;

/** An Event is something that occurs at a particular time.
 */
public interface Event {
  /** Returns the musical time position of this event.
   */
  Fraction getMoment();

  /** Compares equality without considering {@link #getMoment}.
   * <p>
   * This method is intended for repetition detection algorithms, but it is not
   * fully clear if it is the proper way to go.
   */
   // TODO: Fix classes which implement this, in many cases the current
   //       implementation is faulty.
  boolean equalsIgnoreOffset(Event other);
}


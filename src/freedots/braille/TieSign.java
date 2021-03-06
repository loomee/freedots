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
package freedots.braille;

/** The tie is placed immediately after the first of the two tied notes, or
 *  after any slur, fingering or tremolo indications connected with this note.
 *  It also follows the dot in the case of dotted notes.
 * @see <a href="http://brl.org/music/code/bmb/chap09/index.html">Braille Music
 *      Code 1997: Ties</a>
 */
public class TieSign extends Sign {
  public TieSign() { super(braille(4, 14)); }

  public String getDescription() {
    return "Indicates that the previous and next note are tied";
  }
}

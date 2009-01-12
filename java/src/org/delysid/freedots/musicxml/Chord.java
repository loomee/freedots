package org.delysid.freedots.musicxml;

import java.util.ArrayList;
import java.util.List;

import org.delysid.freedots.Fraction;
import org.delysid.freedots.model.Event;

public class Chord extends ArrayList<Note> implements Event {
  Fraction offset;

  Chord(Fraction offset) {
    super();
    this.offset = offset;
  }
  Chord(Note initialNote) {
    this(initialNote.getOffset());
    add(initialNote);
  }
  public Fraction getOffset() { return offset; }
}
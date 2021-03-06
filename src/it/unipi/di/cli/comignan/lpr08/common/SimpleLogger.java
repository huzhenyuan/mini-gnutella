/* This file is part of Mini-Gnutella.
 * Copyright (C) 2010  Michele Comignano
 *
 * Foobar is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.unipi.di.cli.comignan.lpr08.common;

/**
 * Per comodità in fase di test ho creato questa interfaccia che è implementata
 * da un logArea che estende un area di testo swing. Poi servent e bootstrap server
 * possono segnalare errori tramite la text area in modo trasparente.
 * @author Michele Comignano
 */
public interface SimpleLogger {
  public void appendError(String err);
  public void appendError(String err, Exception e);
  public void appendMessage(String msg);
}

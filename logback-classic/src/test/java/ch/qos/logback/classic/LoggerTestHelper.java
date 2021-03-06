/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2009, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.classic;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import junit.framework.*;

public class LoggerTestHelper extends TestCase {


  static void assertNameEquals(Logger logger, String name)  {
    assertNotNull(logger);
    assertEquals(name, logger.getName());
  }
  static void assertLevels(Level level, Logger logger, Level effectiveLevel)  {
    if(level == null) {
    assertNull(logger.getLevel());
    } else {
      assertEquals(level, logger.getLevel());
    }
    assertEquals(effectiveLevel, logger.getEffectiveLevel());
  }
}
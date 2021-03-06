/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mcm.notification.services.gcm;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Simple implementation of a data store using standard Java collections.
 * <p>
 * This class is neither persistent (it will lost the data when the app is
 * restarted) nor thread safe.
 */
public final class Datastore { 

  private static final List<String> regIds = new ArrayList<String>();
  private static final Logger logger =
      Logger.getLogger(Datastore.class.getName());

  private Datastore() {
    throw new UnsupportedOperationException();
  }

  /**
   * Registers a device.
   *
   * @param regId device's registration id.
   */
  public static void register(String regId) {
    logger.info("Registering " + regId);
    regIds.add(regId);
  }

  /**
   * Unregisters a device.
   *
   * @param regId device's registration id.
   */
  public static void unregister(String regId) {
    logger.info("Unregistering " + regId);
    regIds.remove(regId);
  }

  /**
   * Gets all registered devices.
   */
  public static List<String> getDevices() {
    return regIds;
  }

}

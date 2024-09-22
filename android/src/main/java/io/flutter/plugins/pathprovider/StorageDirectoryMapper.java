// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter.plugins.pathprovider;

import android.os.Environment;

/** Helps to map the Dart `StorageDirectory` enum to a Android system constant. */
class StorageDirectoryMapper {
  /**
   * Return a Android Environment constant for a Dart Index.
   *
   * @return The correct Android Environment constant or null, if the index is null.
   * @throws IllegalArgumentException If `dartIndex` is not null but also not matches any known
   *     index.
   */
  static String androidType(Integer dartIndex) throws IllegalArgumentException {
    if (dartIndex == null) {
      return null;
    }

      return switch (dartIndex) {
          case 0 -> Environment.DIRECTORY_MUSIC;
          case 1 -> Environment.DIRECTORY_PODCASTS;
          case 2 -> Environment.DIRECTORY_RINGTONES;
          case 3 -> Environment.DIRECTORY_ALARMS;
          case 4 -> Environment.DIRECTORY_NOTIFICATIONS;
          case 5 -> Environment.DIRECTORY_PICTURES;
          case 6 -> Environment.DIRECTORY_MOVIES;
          case 7 -> Environment.DIRECTORY_DOWNLOADS;
          case 8 -> Environment.DIRECTORY_DCIM;
          case 9 -> Environment.DIRECTORY_DOCUMENTS;
          default -> throw new IllegalArgumentException("Unknown index: " + dartIndex);
      };
  }
}

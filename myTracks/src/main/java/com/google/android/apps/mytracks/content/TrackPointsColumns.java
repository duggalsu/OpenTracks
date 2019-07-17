/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.android.apps.mytracks.content;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Constants for the track points table.
 *
 * @author Leif Hendrik Wilden
 */
public interface TrackPointsColumns extends BaseColumns {

  String TABLE_NAME = "trackpoints";
  Uri CONTENT_URI = Uri.parse("content://com.google.android.maps.mytracks/trackpoints");
  String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.trackpoint";
  String CONTENT_ITEMTYPE = "vnd.android.cursor.item/vnd.google.trackpoint";
  String DEFAULT_SORT_ORDER = "_id";

  // Columns
  String TRACKID = "trackid";
  String LONGITUDE = "longitude";
  String LATITUDE = "latitude";
  String TIME = "time";
  String ALTITUDE = "elevation";
  String ACCURACY = "accuracy";
  String SPEED = "speed";
  String BEARING = "bearing";
  String SENSOR = "sensor";

  String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
      + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
      + TRACKID + " INTEGER, "
      + LONGITUDE + " INTEGER, "
      + LATITUDE + " INTEGER, "
      + TIME + " INTEGER, "
      + ALTITUDE + " FLOAT, "
      + ACCURACY + " FLOAT, "
      + SPEED + " FLOAT, "
      + BEARING + " FLOAT, "
      + SENSOR + " BLOB" 
      + ");";
}
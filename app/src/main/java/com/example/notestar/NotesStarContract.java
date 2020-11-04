package com.example.notestar;

import android.provider.BaseColumns;

public class NotesStarContract {
    public static final class NotesEntry implements BaseColumns {
        public static final String TABLE_NAME = "notes_star";

        public static final String COLUMN_POSITION = "position";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_IMAGE_RESOURCE_ID = "image_resource_id";

        public static final String TYPE_TEXT = "TEXT";
        public static final String TYPE_INTEGER = "INTEGER";

        public static final String CREATE_COMMAND = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(" +
                _ID + " " + TYPE_INTEGER + " PRIMARY KEY AUTOINCREMENT, "+
                COLUMN_POSITION + " " + TYPE_INTEGER + ", " +
                COLUMN_NAME + " " + TYPE_TEXT + ", " +
                COLUMN_DESCRIPTION + " " + TYPE_TEXT + ", " +
                COLUMN_IMAGE_RESOURCE_ID + " " + TYPE_INTEGER + ")";

        public static final String DROP_COMMAND = "DROP TABLE IF EXISTS" + TABLE_NAME;

    }


}


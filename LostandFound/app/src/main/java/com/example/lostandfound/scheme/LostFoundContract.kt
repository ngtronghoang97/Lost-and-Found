package com.example.lostandfound.scheme

import android.provider.BaseColumns

object LostFoundContract {
    /**
     * Table contents are grouped together in an anonymous companion object class.
     * A contract class explicitly specifies the layout of your schema in a systematic and
     * self-documenting way.
     */
    object LostFoundEntry : BaseColumns {
        const val TABLE_NAME = "t_lostFoundItems"
        const val COLUMN_NAME_NAME = "name"
        const val COLUMN_NAME_PHONE = "phone"
        const val COLUMN_NAME_DESCRIPTION = "description"
        const val COLUMN_NAME_DATE = "date"
        const val COLUMN_NAME_LOCATION = "location"
    }
}
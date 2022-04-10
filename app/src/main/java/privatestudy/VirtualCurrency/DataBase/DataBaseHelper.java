package privatestudy.VirtualCurrency.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import privatestudy.VirtualCurrency.DataBase.DBContract.*;

public class DataBaseHelper extends SQLiteOpenHelper {
    static final private int VERSION = 1;
    static final private String DBNAME = "VirtualCurrency";

    public DataBaseHelper(Context context) {
        super(context, DBNAME, null, VERSION);
    }

    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL(
            "CREATE TABLE " + DBEntry1.TABLE_NAME + " (" +
            DBEntry1.COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
            DBEntry1.COLUMN_NAME_BNB + " REAL," +
            DBEntry1.COLUMN_NAME_CAKE + " REAL," +
            DBEntry1.COLUMN_NAME_COMMISSION1 + " REAL," +
            DBEntry1.COLUMN_NAME_COMMISSION2 + " REAL);"
        );

        DB.execSQL(
            "CREATE TABLE " + DBEntry2.TABLE_NAME + "(" +
            DBEntry2.COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
            DBEntry2.COLUMN_NAME_INITIAL + " REAL," +
            DBEntry2.COLUMN_NAME_INPUT + " INTEGER," +
            DBEntry2.COLUMN_NAME_INTEREST + " REAL);"
        );

        DB.execSQL(
            "CREATE TABLE " + DBEntry3.TABLE_NAME + "(" +
            DBEntry3.COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
            DBEntry3.COLUMN_NAME_YEAR + " INTEGER," +
            DBEntry3.COLUMN_NAME_MONTH + " INTEGER," +
            DBEntry3.COLUMN_NAME_DAY + " INTEGER," +
            DBEntry3.COLUMN_NAME_RESULT + " REAL);"
        );

        DB.execSQL(
            "INSERT INTO " + DBEntry1.TABLE_NAME + "(" +
            DBEntry1.COLUMN_NAME_BNB + "," +
            DBEntry1.COLUMN_NAME_CAKE + "," +
            DBEntry1.COLUMN_NAME_COMMISSION1  + "," +
            DBEntry1.COLUMN_NAME_COMMISSION2 + ") VALUES (" +
            "53000.0, 1000.0, 0.0005, 0.0005);"
        );

        DB.execSQL(
            "INSERT INTO " + DBEntry2.TABLE_NAME + "(" +
            DBEntry2.COLUMN_NAME_INITIAL + "," +
            DBEntry2.COLUMN_NAME_INPUT + "," +
            DBEntry2.COLUMN_NAME_INTEREST + ") VALUES (" +
            "3.5118, 10000.0, 0.4933)"
        );
    }

    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {

        DB.execSQL("DROP TABLE IF EXISTS " + DBEntry1.TABLE_NAME);
        onCreate(DB);
    }
}

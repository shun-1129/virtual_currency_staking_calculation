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
    }

    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {

        DB.execSQL("DROP TABLE IF EXISTS " + DBEntry1.TABLE_NAME);
        onCreate(DB);
    }
}

package privatestudy.VirtualCurrency.DataBase;

import android.provider.BaseColumns;

public  final class DBContract {
    private DBContract(){}
    public static class DBEntry1 implements BaseColumns {
        public static final String TABLE_NAME =                 "Setting1_tbl";
        public static final String COLUMN_NAME_ID =             "ID";
        public static final String COLUMN_NAME_BNB =            "BNB";
        public static final String COLUMN_NAME_CAKE =           "CAKE";
        public static final String COLUMN_NAME_COMMISSION1 =    "COMMISSION1";
        public static final String COLUMN_NAME_COMMISSION2 =    "COMMISSION2";
    }
    public static class DBEntry2 implements BaseColumns {
        public static final String TABLE_NAME =                 "Setting1_tbl";
        public static final String COLUMN_NAME_ID =             "ID";
        public static final String COLUMN_NAME_INITIAL =        "initial";
        public static final String COLUMN_NAME_INPUT =          "input";
        public static final String COLUMN_NAME_INTEREST =       "interest";
    }
    public static class DBEntry3 implements BaseColumns {
        public static final String TABLE_NAME =                 "VirtualCurrency";
        public static final String COLUMN_NAME_ID =             "ID";
        public static final String COLUMN_NAME_YEAR =           "year";
        public static final String COLUMN_NAME_MONTH =          "month";
        public static final String COLUMN_NAME_DAY =            "day";
        public static final String COLUMN_NAME_RESULT =         "result";
    }
}

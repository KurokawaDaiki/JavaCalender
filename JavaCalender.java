public class JavaCalender {
    public static void main(String[] args) throws Exception {
        int Month = 0;
        int Day = 0;
        char[] Weekday = new char[] { '土', '日', '月', '火', '水', '木', '金' };

        for (int Year = 1998; Year <= 2022; Year++) {
            // 年を表示
            System.out.println(Year + "年");
            // 月を初期化
            Month = 0;
            // 1月から12月までループ
            while (Month <= 12) {
                // 31日までの月
                if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12) {
                    // 何月かを表示
                    System.out.println(Month + "月");
                    // 日曜日から土曜日まで表示
                    System.out.print('日' + "  " + "月" + "  " + "火" + "  " + "水" + "  " + "木" + "  " + "金" + "  " + "土");
                    System.out.println("");
                    while (Day < 31) {
                        Day++;
                        int v = setting_weekday(Year, Month, Day);
                        if (Day == 1 && Weekday[v] == '土') {
                            System.out.print("                        ");
                        }
                        if (Day == 1 && Weekday[v] == '月') {
                            System.out.print("    ");
                        }
                        if (Day == 1 && Weekday[v] == '火') {
                            System.out.print("        ");
                        }
                        if (Day == 1 && Weekday[v] == '水') {
                            System.out.print("            ");
                        }
                        if (Day == 1 && Weekday[v] == '木') {
                            System.out.print("                ");
                        }
                        if (Day == 1 && Weekday[v] == '金') {
                            System.out.print("                    ");
                        }
                        // 日にちを表示
                        if (Day <= 9) {
                            System.out.print(Day + "   ");
                        } else {
                            System.out.print(Day + "  ");
                        }
                        if (v == 0) {
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                }
                // 30日までの月
                if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
                    System.out.println(Month + "月");
                    // 日から土まで表示
                    System.out.print('日' + "  " + "月" + "  " + "火" + "  " + "水" + "  " + "木" + "  " + "金" + "  " + "土");
                    System.out.println("");
                    // 30日まで表示
                    while (Day < 30) {
                        Day++;
                        int v = setting_weekday(Year, Month, Day);
                        if (Day == 1 && Weekday[v] == '土') {
                            System.out.print("                        ");
                        }
                        if (Day == 1 && Weekday[v] == '月') {
                            System.out.print("    ");
                        }
                        if (Day == 1 && Weekday[v] == '火') {
                            System.out.print("        ");
                        }
                        if (Day == 1 && Weekday[v] == '水') {
                            System.out.print("            ");
                        }
                        if (Day == 1 && Weekday[v] == '木') {
                            System.out.print("                ");
                        }
                        if (Day == 1 && Weekday[v] == '金') {
                            System.out.print("                    ");
                        }
                        // 日にち表示
                        if (Day <= 9) {
                            System.out.print(Day + "   ");
                        } else {
                            System.out.print(Day + "  ");
                        }
                        if (v == 0) {
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                }
                // 2月のうるう年
                if (Month == 2 && Year % 4 == 0 || Month == 2 && Year % 100 == 0 || Month == 2 && Year % 400 == 0) {
                    // 29日まで表示
                    System.out.println(Month + "月");
                    while (Day < 29) {
                        Day++;
                        int v = setting_weekday(Year, Month, Day);
                        if (Day == 1 && Weekday[v] == '土') {
                            System.out.print("                        ");
                        }
                        if (Day == 1 && Weekday[v] == '月') {
                            System.out.print("    ");
                        }
                        if (Day == 1 && Weekday[v] == '火') {
                            System.out.print("        ");
                        }
                        if (Day == 1 && Weekday[v] == '水') {
                            System.out.print("            ");
                        }
                        if (Day == 1 && Weekday[v] == '木') {
                            System.out.print("                ");
                        }
                        if (Day == 1 && Weekday[v] == '金') {
                            System.out.print("                    ");
                        }
                        // 日にちを表示
                        if (Day <= 9) {
                            System.out.print(Day + "   ");
                        } else {
                            System.out.print(Day + "  ");
                        }
                        if (v == 0) {
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                }
                // 2月
                if (Month == 2) {
                    System.out.println(Month + "月");
                    // 28日まで表示
                    while (Day < 28) {
                        Day++;
                        int v = setting_weekday(Year, Month, Day);
                        if (Day == 1 && Weekday[v] == '土') {
                            System.out.print("                        ");
                        }
                        if (Day == 1 && Weekday[v] == '月') {
                            System.out.print("    ");
                        }
                        if (Day == 1 && Weekday[v] == '火') {
                            System.out.print("        ");
                        }
                        if (Day == 1 && Weekday[v] == '水') {
                            System.out.print("            ");
                        }
                        if (Day == 1 && Weekday[v] == '木') {
                            System.out.print("                ");
                        }
                        if (Day == 1 && Weekday[v] == '金') {
                            System.out.print("                    ");
                        }
                        // 日にち表示
                        if (Day <= 9) {
                            System.out.print(Day + "   ");
                        } else {
                            System.out.print(Day + "  ");
                        }
                        if (v == 0) {
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                }
                // 日にちを初期化
                Day = 0;
                // 次の月に
                Month++;
            }
        }
    }

    // 曜日を計算で求める関数
    static int setting_weekday(int y, int m, int d) {
        int x = 0;
        if (m == 1 || m == 2) {
            y = y - 1;

        }
        if (y / 100 == 19) {
            x = 1;
        }
        // 月に対応する値
        switch (m) {
            case 1:
                m = 1;
                break;

            case 2:
                m = 4;
                break;

            case 3:
                m = 3;
                break;

            case 4:
                m = 6;
                break;

            case 5:
                m = 1;
                break;

            case 6:
                m = 4;
                break;

            case 7:
                m = 6;
                break;

            case 8:
                m = 2;
                break;

            case 9:
                m = 5;
                break;

            case 10:
                m = 0;
                break;

            case 11:
                m = 3;
                break;

            case 12:
                m = 5;
                break;
        }
        // 曜日を数字にして割り当てる
        int Weekday_number = ((y % 100) + (y % 100) / 4 + m + d + x) % 7;
        return Weekday_number;
    }

}
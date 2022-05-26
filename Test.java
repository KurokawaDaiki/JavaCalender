public class Test {
    public static void main(String[] args) throws Exception {
        int m = 0;
        int d = 0;
        char[] weekday = new char[] { '土', '日', '月', '火', '水', '木', '金' };

        for (int y = 1998; y <= 2022; y++) {
            // 年を表示
            System.out.println(y + "年");
            // 月を初期化
            m = 0;
            // 12月までループ
            while (m <= 12) {
                // 31日まである月
                if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                    // 31日まで表示
                    System.out.println(m + "月");
                    // 日から土まで表示
                    System.out.print('日' + "  " + "月" + "  " + "火" + "  " + "水" + "  " + "木" + "  " + "金" + "  " + "土");
                    System.out.println("");
                    // 日にちを初期化
                    while (d < 31) {
                        d++;
                        int v = WeekdaySetting(y, m, d);
                        if (d == 1 && weekday[v] == '土') {
                            System.out.print("                        ");
                        }
                        if (d == 1 && weekday[v] == '月') {
                            System.out.print("    ");
                        }
                        if (d == 1 && weekday[v] == '火') {
                            System.out.print("        ");
                        }
                        if (d == 1 && weekday[v] == '水') {
                            System.out.print("            ");
                        }
                        if (d == 1 && weekday[v] == '木') {
                            System.out.print("                ");
                        }
                        if (d == 1 && weekday[v] == '金') {
                            System.out.print("                    ");
                        }
                        // 日にち表示
                        if (d <= 9) {
                            System.out.print(d + "   ");
                        } else {
                            System.out.print(d + "  ");
                        }
                        if (v == 0) {
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                }
                if (m == 4 || m == 6 || m == 9 || m == 11) {
                    // 30日まで表示
                    System.out.println(m + "月");
                    // 日から土まで表示
                    System.out.print('日' + "  " + "月" + "  " + "火" + "  " + "水" + "  " + "木" + "  " + "金" + "  " + "土");
                    System.out.println("");
                    while (d < 30) {
                        d++;
                        int v = WeekdaySetting(y, m, d);
                        if (d == 1 && weekday[v] == '土') {
                            System.out.print("                        ");
                        }
                        if (d == 1 && weekday[v] == '月') {
                            System.out.print("    ");
                        }
                        if (d == 1 && weekday[v] == '火') {
                            System.out.print("        ");
                        }
                        if (d == 1 && weekday[v] == '水') {
                            System.out.print("            ");
                        }
                        if (d == 1 && weekday[v] == '木') {
                            System.out.print("                ");
                        }
                        if (d == 1 && weekday[v] == '金') {
                            System.out.print("                    ");
                        }
                        // 日にち表示
                        if (d <= 9) {
                            System.out.print(d + "   ");
                        } else {
                            System.out.print(d + "  ");
                        }
                        if (v == 0) {
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                }
                if (m == 2 && y % 4 == 0 || m == 2 && y % 100 == 0 || m == 2 && y % 400 == 0) {
                    // 29日まで表示
                    System.out.println(m + "月");
                    while (d < 29) {
                        d++;
                        int v = WeekdaySetting(y, m, d);
                        if (d == 1 && weekday[v] == '土') {
                            System.out.print("                        ");
                        }
                        if (d == 1 && weekday[v] == '月') {
                            System.out.print("    ");
                        }
                        if (d == 1 && weekday[v] == '火') {
                            System.out.print("        ");
                        }
                        if (d == 1 && weekday[v] == '水') {
                            System.out.print("            ");
                        }
                        if (d == 1 && weekday[v] == '木') {
                            System.out.print("                ");
                        }
                        if (d == 1 && weekday[v] == '金') {
                            System.out.print("                    ");
                        }
                        // 日にち表示
                        if (d <= 9) {
                            System.out.print(d + "   ");
                        } else {
                            System.out.print(d + "  ");
                        }
                        if (v == 0) {
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                }
                if (m == 2) {
                    System.out.println(m + "月");
                    // 28日まで表示
                    while (d < 28) {
                        d++;

                        int v = WeekdaySetting(y, m, d);
                        if (d == 1 && weekday[v] == '土') {
                            System.out.print("                        ");
                        }
                        if (d == 1 && weekday[v] == '月') {
                            System.out.print("    ");
                        }
                        if (d == 1 && weekday[v] == '火') {
                            System.out.print("        ");
                        }
                        if (d == 1 && weekday[v] == '水') {
                            System.out.print("            ");
                        }
                        if (d == 1 && weekday[v] == '木') {
                            System.out.print("                ");
                        }
                        if (d == 1 && weekday[v] == '金') {
                            System.out.print("                    ");
                        }
                        // 日にち表示
                        if (d <= 9) {
                            System.out.print(d + "   ");
                        } else {
                            System.out.print(d + "  ");
                        }
                        if (v == 0) {
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                }
                d = 0;
                m++;
            }
        }
    }

    static int WeekdaySetting(int a, int b, int c) {
        int x = 0;
        if (b == 1 || b == 2) {
            a = a - 1;

        }
        if (a / 100 == 19) {
            x = 1;
        }

        switch (b) {
            case 1:
                b = 1;
                break;

            case 2:
                b = 4;
                break;

            case 3:
                b = 3;
                break;

            case 4:
                b = 6;
                break;

            case 5:
                b = 1;
                break;

            case 6:
                b = 4;
                break;

            case 7:
                b = 6;
                break;

            case 8:
                b = 2;
                break;

            case 9:
                b = 5;
                break;

            case 10:
                b = 0;
                break;

            case 11:
                b = 3;
                break;

            case 12:
                b = 5;
                break;
        }

        int Youbi = (a % 100) + (a % 100) / 4 + b + c + x;
        int answer = Youbi % 7;
        return answer;
    }

}
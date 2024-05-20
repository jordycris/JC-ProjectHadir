package com.juaracoding.utils;

public enum TestCases {
    T1("Admin dapat berhasil login dengan menggunakan kredensial yang valid"),
    T2("Sistem menangani skenario di mana user mencoba login dengan menggunakan kredensial yang salah"),

    T3("User dapat membuat akun baru untuk absensi"),

    T4("User tidak dapat membuat akun baru untuk absensi")
    ;
    {

    }

    private String testCaseName;

    TestCases(String value) {
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }


}

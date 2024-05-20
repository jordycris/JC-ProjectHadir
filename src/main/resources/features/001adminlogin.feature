Feature: Proses User Login Admin
  # 1
  Scenario: Admin dapat berhasil login dengan menggunakan kredensial yang valid
    Given Admin mengakses halaman login
    When Admin masukan alamat email valid
    And Admin input password valid
    And Admin klik tombol login
    Then Admin berhasil login dan diarahkan ke halaman dashboard

    #2
  Scenario: Sistem menangani skenario di mana user mencoba login dengan menggunakan kredensial yang salah
    Given Admin berada di halaman login
    When Admin memasukan email yang salah
    And Admin memasukan password yang salah
    And Admin klik tombol login
    Then Sistem menampilkan pesan akun tidak ditemukan
Feature: Proses Registrasi Absensi User
    # 1
  Scenario: User dapat membuat akun baru untuk absensi
    Given User2 mengakses website absensi
    When User2 klik daftar akun disini
    When User2 masukan NIK
    And User2 masukan nama lengkap
    And User2 masukan email yang akan digunakan
    And User2 masukan password yang akan digunakan
    And User2 upload selfie
    And User2 klik daftar
    Then User2 berhasil regist dan menunggu approve admin

    #2
  Scenario: User tidak dapat membuat akun baru untuk absensi
    Given User2 berada di website absensi
    When User2 klik daftar disini
    And User2 klik button daftar
    Then User2 gagal membuat akun
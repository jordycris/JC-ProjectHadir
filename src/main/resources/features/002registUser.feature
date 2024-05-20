  Feature: Proses Registrasi Absensi User
    # 1
    Scenario: User dapat membuat akun baru untuk absensi
      Given User mengakses website absensi
      When User klik daftar akun disini
      When User masukan NIK
      And User masukan nama lengkap
      And User masukan email yang akan digunakan
      And User masukan password yang akan digunakan
      And User upload selfie
      And User klik daftar
      Then User berhasil regist dan menunggu approve admin

    #2
  Scenario: User tidak dapat membuat akun baru untuk absensi
    Given User berada di website absensi
    When User klik daftar disini
    And User klik button daftar
    Then User gagal membuat akun
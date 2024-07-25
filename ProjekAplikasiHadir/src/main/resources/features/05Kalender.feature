Feature: Kalender

  Scenario: Memasukkan data kalender dengan nama valid
    Given Login dan buka halaman izin off
    Given Buka halaman kalender
    When Klik tombol tambahkan kalender
    And Input nama kalender
    And Klik tombol tambah
    Then Kalender berhasil ditambahkan

  Scenario: Memasukkan data kalender dengan nama kosong
    Given Buka halaman kalender
    When Klik tombol tambahkan kalender
    And Klik tombol tambah
    Then Pesan nama kalender wajib diisi muncul

  Scenario: Mengedit kalender
    Given Buka halaman kalender
    When Klik tombol titik tiga kalender
    And Klik tombol edit kalender
    And Input edit kalender
    And Klik tombol tambah
    Then Berhasil mengedit kalender

  Scenario: Menghapus data kalender
    Given Buka halaman kalender
    When Klik tombol titik tiga kalender
    And Klik tombol delete kalender
    And Klik tombol ya kalender
    Then Kalender berhasil dihapus
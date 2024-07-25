Feature: Jadwal

  Scenario: Membuat jadwal baru dengan data valid
    Given Login dan buka halaman izin off
    Given Buka halaman jadwal
    When Klik tambahkan jadwal
    And Input data valid
    And Klik simpan jadwal
    Then Jadwal berhasil ditambahkan

  Scenario: Mengedit jadwal yang sudah ada dengan data valid
    Given Buka halaman jadwal
    When Klik tombol titik tiga
    And Klik tombol edit
    And Input data edit valid
    Then Jadwal berhasil diedit

  Scenario: Membuat jadwal baru dengan data tidak lengkap
    Given Buka halaman jadwal
    When Klik tambahkan jadwal
    And Input data tidak lengkap
    And Klik simpan jadwal
    Then Jadwal gagal ditambahkan

  Scenario: Menghapus jadwal
    Given Buka halaman jadwal
    When Klik tombol titik tiga
    And Klik tombol delete
    And Klik tombol ya
    Then Jadwal berhasil dihapus

Feature: Import Status Aktif

  Scenario: Import status aktif dengan dokumen xlsx
    Given Buka halaman import status aktif
    When Pilih file xlsx dari komputer
    And Klik tombol impor
    Then File berhasil diimpor

  Scenario: Import status aktif selain dengan xlsx
    Given Buka halaman import status aktif
    When Pilih file selain xlsx dari komputer
    Then Muncul pesan pemberitahuan file salah
    And Klik tombol impor
    Then File gagal diimpor

  Scenario: Fungsi tombol Download Template
    Given Buka halaman import status aktif
    When Klik tombol download template
    Then File template berhasil di download

  Scenario: Fungsi impor tanpa memilih file
    Given Buka halaman import status aktif
    And Klik tombol impor
    Then Notifikasi wajib input file muncul

  Scenario: Fungsi Impor dengan template yang tidak sesuai
    Given Buka halaman import status aktif
    When Pilih file tidak sesuai template dari komputer
    And Klik tombol impor
    Then File tidak sesuai gagal diimpor
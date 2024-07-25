Feature: Shifting

  Scenario: Search shifting
    Given Login dan buka halaman izin off
    Given Buka halaman shifting
    When Input nama unit pada search box
    And Klik tombol search shifting
    Then Menampilkan nama unit yang dicari

  Scenario: Reset Shifting
    Given Buka halaman shifting
    When Input nama unit pada search box
    And Klik tombol search shifting
    And Klik tombol reset shifting
    Then Menampilkan data default

  Scenario: Tambah Shift
    Given Buka halaman shifting
    When Klik tambah shift
    And Input semua field
    And Klik simpan
    Then Shift baru berhasil ditambahkan

 Scenario: Menambahkan shift baru degan data tidak lengkap
   Given Buka halaman shifting
   When Klik tambah shift
   And Biarkan beberapa shift kosong
   And Klik simpan
   Then Muncul pesan error field wajib diisi

 Scenario: Edit Shift
   Given Buka halaman shifting
   When Pilih shift
   And Klik edit
   And Ubah data shift
   And Klik simpan
   Then Berhasil diedit

 Scenario: Mengedit shift yang ada dengan data tidak valid
   Given Buka halaman shifting
   When Pilih shift
   And Klik edit
   And Masukkan data shift yang tidak valid
   Then Muncul pesan error data yang dimasukkan tidak valid

 Scenario: Menghapus shift yang ada
   Given Buka halaman shifting
   When Pilih shift
   And Klik hapus
   And Konfirmasi penghapusan
   Then Shift dihapus dari daftar





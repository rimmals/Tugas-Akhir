Feature: Izin Off

  Scenario: Filter nama
    Given Login dan buka halaman izin off
    When Input nama pada kolom search
    And Klik tombol search
    Then Menampilkan data nama yang dicari

  Scenario: Reset Filter
    Given Buka halaman izin off
    When Input nama pada kolom search
    And Klik tombol search
    And Klik tombol reset
    Then Menampilkan data izin off default

  Scenario: Filter berdasarkan unit
    Given Buka halaman izin off
    When Klik ikon filter
    And Input nama unit di field unit
    And Klik tombol terapkan
    Then Data izin off ditampilkan sesuai dengan unit yang diimputkan

  Scenario: Filter berdasarkan start date dan end date
    Given Buka halaman izin off
    When Klik ikon start date
    And Masukkan start date dan end date
    And Klik tombol save
    And Klik tombol search date
    Then Menampilkan data sesuai start date dan end date

  Scenario: Tampilan data rows 5 per page
    Given Buka halaman izin off
    When Klik opsi page
    And Pilih opsi page 5
    Then Menampilkan 5 data per page

  Scenario: Tampilan data rows 10 per page
    Given Buka halaman izin off
    When Klik opsi page
    And Pilih opsi page 10
    Then Menampilkan 10 data per page

  Scenario: Tampilan data rows 25 per page
    Given Buka halaman izin off
    When Klik opsi page
    And Pilih opsi page 25
    Then Menampilkan 25 data per page

#  Scenario: Mengubah tampilan data perhalaman menggunakan go to next page
#    Given Buka halaman izin off
#    When Klik tombol go to next page
#    Then Menampilkan data next page
#
#  Scenario: Mengubah tampilan data perhalaman menggunakan go to previous page
#    Given Buka halaman izin off
#    When Klik tombol go to next page
#    When Klik tombol go to previous page
#    Then Menampilkan data previous page
#
#  Scenario: Mengubah tampilan data perhalaman menggunakan go to last page
#    Given Buka halaman izin off
#    When Klik tombol go to last page
#    Then Menampilkan data last page
#
#  Scenario: Mengubah tampilan data perhalaman menggunakan go to first page
#    Given Buka halaman izin off
#    When Klik tombol go to last page
#    When Klik tombol go to first page
#    Then Menampilkan data first page
#
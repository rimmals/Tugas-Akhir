package com.juaracoding.utils;

public enum ScenarioTests {


    T1("Filter nama"),
    T2("Reset Filter"),
    T3("Filter berdasarkan unit"),
    T4("Filter berdasarkan start date dan end date"),
    T5("Tampilan data rows 5 per page"),
    T6("Tampilan data rows 10 per page"),
    T7("Tampilan data rows 25 per page"),
    T8("Import status aktif dengan dokumen xlsx"),
    T9("Import status aktif selain dengan xlsx"),
    T10("Fungsi tombol Download Template"),
    T11("Fungsi impor tanpa memilih file"),
    T12("Fungsi Impor dengan template yang tidak sesuai"),
    T13("Search shifting"),
    T14("Reset Shifting"),
    T15("Tambah Shift"),
    T16("Menambahkan shift baru degan data tidak lengkap"),
    T17("Edit Shift"),
    T18("Mengedit shift yang ada dengan data tidak valid"),
    T19("Menghapus shift yang ada"),
    T20("Membuat jadwal baru dengan data valid"),
    T21("Mengedit jadwal yang sudah ada dengan data valid"),
    T22("Membuat jadwal baru dengan data tidak lengka"),
    T23("Menghapus jadwal"),
    T24("Memasukkan data kalender dengan nama valid"),
    T25("Memasukkan data kalender dengan nama kosong"),
    T26("Mengedit kalender"),
    T27("Menghapus data kalender");


    // T1 ... T100

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }

}
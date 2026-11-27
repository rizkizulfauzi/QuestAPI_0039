package com.example.pertemuan12.modeldata

import kotlinx.serialization.Serializable

@Serializable
data class DataSiswa(
    val id : Int = 0,
    val nama : String ="",
    val alamat : String = "",
    val telpon : String = "",
)
fun DetailSiswa.toDataSiswa() : DataSiswa = DataSiswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)
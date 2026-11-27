package com.example.pertemuan11.repositori

import com.example.pertemuan11.apiservice.ServiceApiSiswa
import com.example.pertemuan11.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
}

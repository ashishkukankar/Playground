package com.almetrix.playgroundtask.modelView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.almetrix.playgroundtask.Pojo.Information
import com.almetrix.playgroundtask.repository.Repository

class KickStartViewModel: ViewModel() {
    val repository = Repository()

    fun getAllInformationList():MutableLiveData<MutableList<Information>>{
        repository.getKistarterData()
        return repository.getValue()
    }
}
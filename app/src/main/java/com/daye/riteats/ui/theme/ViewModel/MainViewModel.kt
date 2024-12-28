package com.daye.riteats.ui.theme.ViewModel

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.daye.riteats.ui.theme.Model.CategoryModel
import com.daye.riteats.ui.theme.Model.FoodModel
import com.daye.riteats.ui.theme.Repository.MainRepository

class MainViewModel : ViewModel() {
    private val repository = MainRepository()

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadPopular(): LiveData<MutableList<FoodModel>> {
        return repository.loadPopular()
    }
}
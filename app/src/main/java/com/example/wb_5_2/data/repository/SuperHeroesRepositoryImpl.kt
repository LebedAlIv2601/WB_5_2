package com.example.wb_5_2.data.repository

import com.example.wb_5_2.data.network.SuperHeroesApiHelper
import com.example.wb_5_2.domain.model.SuperHeroModelDomain
import com.example.wb_5_2.domain.repository.SuperHeroesRepository
import javax.inject.Inject

class SuperHeroesRepositoryImpl @Inject constructor(private val apiHelper: SuperHeroesApiHelper): SuperHeroesRepository {

    override suspend fun getSuperHeroes(): List<SuperHeroModelDomain> {
        return apiHelper.getSuperHeroes()
    }
}
package com.example.wb_5_2.domain.repository

import com.example.wb_5_2.domain.model.SuperHeroModelDomain

interface SuperHeroesRepository {

    suspend fun getSuperHeroes(): List<SuperHeroModelDomain>

}
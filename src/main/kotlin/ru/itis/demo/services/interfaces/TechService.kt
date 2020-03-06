package ru.itis.demo.services.interfaces

import ru.itis.demo.dto.TechDTO
import ru.itis.demo.models.Tech

interface TechService {
    fun getList(): List<TechDTO>
    fun addTech(tech: Tech)
}
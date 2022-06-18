package com.espacosabrina.sistemadecontrole.repositories

import com.espacosabrina.sistemadecontrole.dtos.ClientDTO
import com.espacosabrina.sistemadecontrole.models.ClientModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ClientRepository: JpaRepository<ClientModel, Int> {

     override fun findById(id: Int): Optional<ClientModel>
     fun save(clientModel: ClientModel): ClientModel


     override fun findAll(): MutableList<ClientModel>

     override fun delete(clientModel: ClientModel)
}
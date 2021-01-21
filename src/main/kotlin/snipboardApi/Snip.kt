package snipboardApi

import javax.persistence.*

@Entity
data class Snip(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
                       val Id: Long,
                       var title: String,
                       var contents: String)

//TODO: history records here? have to somewhere in this project if they're gonna be persistent across clients

//TODO: other metadata? user relations?
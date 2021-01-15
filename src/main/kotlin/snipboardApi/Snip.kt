package snipboardApi

import javax.persistence.*

@Entity
data class Snip(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
                       val Id: Long,
                       var title: String,
                       var contents: String)

//TODO: history records here?
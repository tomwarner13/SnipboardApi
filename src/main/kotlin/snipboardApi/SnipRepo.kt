package snipboardApi

import org.springframework.data.repository.CrudRepository

interface SnipRepo : CrudRepository<Snip, Long>
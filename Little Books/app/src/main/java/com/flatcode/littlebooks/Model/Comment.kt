package com.flatcode.littlebooks.Model

class Comment {
    var id: String? = null
    var bookId: String? = null
    var timestamp: String? = null
    var comment: String? = null
    var publisher: String? = null

    constructor() {}
    constructor(
        id: String?,
        bookId: String?,
        timestamp: String?,
        comment: String?,
        publisher: String?
    ) {
        this.id = id
        this.bookId = bookId
        this.timestamp = timestamp
        this.comment = comment
        this.publisher = publisher
    }
}
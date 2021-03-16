package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.data.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document

class GetBookmarksUseCase(
        private val bookmarkRepository: BookmarkRepository
) {

    suspend operator fun invoke(document: Document): List<Bookmark> {
        return bookmarkRepository.getBookmarks(document)
    }

}
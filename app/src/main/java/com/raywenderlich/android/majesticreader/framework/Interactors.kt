package com.raywenderlich.android.majesticreader.framework

import com.raywenderlich.android.majesticreader.interactors.*

data class Interactors(
        val addBookmark: AddBookmarkUseCase,
        val getBookmarks: GetBookmarksUseCase,
        val removeBookmark: RemoveBookmarkUseCase,

        val addDocument: AddDocumentUseCase,
        val getDocuments: GetDocumentsUseCase,
        val removeDocument: RemoveDocumentUseCase,

        val getOpenDocument: GetOpenDocumentUseCase,
        val setOpenDocument: SetOpenDocumentUseCase
)
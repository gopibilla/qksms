package com.moez.QKSMS.domain.interactor

import com.moez.QKSMS.data.repository.MessageRepository
import io.reactivex.Flowable
import javax.inject.Inject

class DeleteConversation @Inject constructor(private val messageRepo: MessageRepository): Interactor<Unit, Long>() {

    override fun buildObservable(params: Long): Flowable<Unit> {
        return Flowable.just(Unit)
                .doOnNext { messageRepo.deleteConversation(params) }
    }

}
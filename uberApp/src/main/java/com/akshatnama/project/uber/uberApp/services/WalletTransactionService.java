package com.akshatnama.project.uber.uberApp.services;

import com.akshatnama.project.uber.uberApp.dto.WalletTransactionDto;
import com.akshatnama.project.uber.uberApp.entities.WalletTransaction;

public interface WalletTransactionService {

    void createNewWalletTransaction(WalletTransaction walletTransaction);

}

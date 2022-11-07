package com.codegym.qltcbe.service.wallet;

import com.codegym.qltcbe.model.entity.Wallet;
import com.codegym.qltcbe.repo.WalletRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;
@Service
public class WalletService  implements IWalletService{
    @Autowired
    private WalletRepo walletRepo;

    @Override
    public Iterable<Wallet> findAll() {
        return walletRepo.findAll();
    }

    @Override
    public Optional<Wallet> findById(Long id) {
        return walletRepo.findById(id);
    }

    @Override
    public Wallet save(Wallet wallet) {
        return walletRepo.save(wallet);
    }

    @Override
    public void remove(Long id) {
        walletRepo.deleteById(id);
    }

    @Override
    public Iterable<Wallet> findWalletsByAppUserIdAndStatus(Long user_id, int status) {
        return walletRepo.findWalletsByAppUserIdAndStatus(user_id,status);
    }

    @Override
    public long sumMoneyWalletByUser(@PathVariable int id) {
        return walletRepo.sumMoneyWalletByUser(id);
    }



    @Override
    public long addMoney(Long id, long money) {
        long moneyWallet=walletRepo.findById(id).get().getMoney();
        long totalMoney=moneyWallet+money;
        return totalMoney;
    }

}

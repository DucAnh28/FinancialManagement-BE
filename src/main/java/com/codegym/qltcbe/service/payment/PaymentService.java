package com.codegym.qltcbe.service.payment;

import com.codegym.qltcbe.model.entity.Payment;
import com.codegym.qltcbe.repo.IPaymentRepository;
import com.codegym.qltcbe.service.payment.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private IPaymentRepository paymentRepository;
    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Iterable<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Optional<Payment> findById(Long id) {
        return paymentRepository.findById(id);
    }


    @Override
    public void remove(Long id) {
         paymentRepository.deleteById(id);
    }


}
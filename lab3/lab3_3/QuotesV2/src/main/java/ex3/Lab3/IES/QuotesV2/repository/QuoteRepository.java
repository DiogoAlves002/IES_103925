package ex3.Lab3.IES.QuotesV2.repository;

import ex3.Lab3.IES.QuotesV2.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote,Integer> {
    Quote findByAvaliacao(String title);
}
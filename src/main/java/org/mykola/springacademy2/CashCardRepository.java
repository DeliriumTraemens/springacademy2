package org.mykola.springacademy2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

//public interface CashCardRepository extends CrudRepository<CashCard,Long> {
public interface CashCardRepository extends PagingAndSortingRepository<CashCard,Long> {

    Optional<CashCard> findById(Long requestedId);

    CashCard save(CashCard newCashCardRequest);
}

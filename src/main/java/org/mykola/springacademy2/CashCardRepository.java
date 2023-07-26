package org.mykola.springacademy2;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

//public interface CashCardRepository extends CrudRepository<CashCard,Long> {
//public interface CashCardRepository extends PagingAndSortingRepository<CashCard,Long> {
public interface CashCardRepository extends CrudRepository<CashCard, Long>, PagingAndSortingRepository<CashCard, Long>{

    CashCard findByIdAndOwner(Long id, String owner);
    Page<CashCard> findByOwner(String owner, PageRequest amount);

    Optional<CashCard> findById(Long requestedId);

    CashCard save(CashCard newCashCardRequest);
}

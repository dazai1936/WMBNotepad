package com.example.memo.repository;

import com.example.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemoRepository extends JpaRepository<Memo, Long> {
    // 작성자로 메모 찾기
    List<Memo> findByAuthor(String author);

    // 제목에 특정 키워드가 포함된 메모 찾기
    List<Memo> findByTitleContaining(String keyword);

    // 내용에 특정 키워드가 포함된 메모 찾기
    List<Memo> findByContentContaining(String keyword);

    // 제목이나 내용에 키워드가 포함된 메모 찾기
    List<Memo> findByTitleContainingOrContentContaining(String titleKeyword, String contentKeyword);
}

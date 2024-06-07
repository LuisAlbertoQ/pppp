package com.example.msgestiontesisprojectotesis.repository;

import com.example.msgestiontesisprojectotesis.entity.TesisDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesisDocumentoRepository extends JpaRepository<TesisDocumento, Long> {
}

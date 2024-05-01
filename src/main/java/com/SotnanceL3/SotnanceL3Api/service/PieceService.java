package com.SotnanceL3.SotnanceL3Api.service;

import java.util.List;
import java.util.Optional;

import com.SotnanceL3.SotnanceL3Api.entity.Piece;
import com.SotnanceL3.SotnanceL3Api.repository.PieceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PieceService {
private final PieceRepository pieceRepository;
@Autowired
public PieceService(PieceRepository pieceRepository) {
    this.pieceRepository = pieceRepository;
}


    public List<Piece> getPiece() {
        return pieceRepository.findAll();
    }

    @SuppressWarnings("null")
    public void addPiece(Piece piece) {
        pieceRepository.save(piece);
    }

    @SuppressWarnings("null")
    public void deleteRoll(Long idPiece) {
     pieceRepository.deleteById(idPiece);
    }

    public void updatePiece(Long id, Piece updatePiece) {
        @SuppressWarnings("null")
        Optional<Piece> optionalPiece = pieceRepository.findById(id);
        if (optionalPiece.isPresent()) {
            Piece existingPiece = optionalPiece.get();

            existingPiece.setIdPiece(updatePiece.getIdPiece());
            existingPiece.setPieceName(updatePiece.getPieceName());
                
            pieceRepository.save(existingPiece);
        } else {
            throw new IllegalArgumentException("Piece with ID " + id + " not found");
        }
    }
}

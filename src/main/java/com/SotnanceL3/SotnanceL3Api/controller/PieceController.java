package com.SotnanceL3.SotnanceL3Api.controller;

import java.util.List;


import com.SotnanceL3.SotnanceL3Api.entity.Piece;
import com.SotnanceL3.SotnanceL3Api.service.PieceService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/piece")
public class PieceController {
private final PieceService pieceService;

public PieceController(PieceService pieceService) {
    this.pieceService = pieceService;
}

@GetMapping
public List<Piece> Getpiece()
{
    return pieceService.getPiece();
}

@PostMapping
public void AddPiece(@RequestBody Piece  piece)
{
    pieceService.addPiece(piece);
}

@DeleteMapping("/{idPiece}")
public void DeletPiece( @PathVariable("idPiece") Long ID)
{
    pieceService.deleteRoll(ID);
}

@PutMapping("/{idPiece}")
public void updatedPiece(@PathVariable("idFacture") Long Id , Piece piece)
{
    pieceService.updatePiece(Id, piece);
}
}

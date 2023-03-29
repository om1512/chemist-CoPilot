package com.example.IMS.convertor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.IMS.dto.BorrowerDto;
import com.example.IMS.model.Borrower;

@Component
public class BorrowerConvertor {

	public BorrowerDto modelToDto(Borrower borrower) {
		BorrowerDto borrowerDto = new BorrowerDto();
		borrowerDto.setFirstName(borrower.getFirstName());
		borrowerDto.setLastName(borrower.getLastName());
		borrowerDto.setEmail(borrower.getEmail());
		return borrowerDto;
	}

	
	public List<BorrowerDto> modelToDto(List<Borrower> borrowerList) {
		List<BorrowerDto> borrowerDtoList = new ArrayList<>();
		for (Borrower item : borrowerList) {
			borrowerDtoList.add(modelToDto(item));
		}
		return borrowerDtoList;
	}

	public Borrower dtoToModel(BorrowerDto itemDto) {
		Borrower item = new Borrower();
		item.setFirstName(itemDto.getFirstName());
		item.setLastName(itemDto.getLastName());
		item.setEmail(itemDto.getEmail());
		return item;
	}
	
}


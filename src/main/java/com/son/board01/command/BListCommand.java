package com.son.board01.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.son.board01.dao.BDao;
import com.son.board01.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		System.out.println(dtos);
		model.addAttribute("list", dtos);
	}
}

package com.son.board01.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.son.board01.command.BCommand;
import com.son.board01.command.BContentCommand;
import com.son.board01.command.BDeleteCommand;
import com.son.board01.command.BListCommand;
import com.son.board01.command.BModifyCommand;
import com.son.board01.command.BReplyCommand;
import com.son.board01.command.BReplyViewCommand;
import com.son.board01.command.BWriteCommand;

@Controller
public class BController {
	BCommand command;

	@RequestMapping("/list.kosc")
	public String list(Model model) {
		command = new BListCommand();
		command.execute(model);

		return "list";
	}

	@RequestMapping("/write_view.kosc")
	public String writeView(Model model) {

		return "write_view";
	}

	@RequestMapping(value = "/write.kosc")
	public String write(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);

		command = new BWriteCommand();
		command.execute(model);

		return "redirect:list";
	}

	@RequestMapping(value = "/content_view.kosc")
	public String contentView(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);

		command = new BContentCommand();
		command.execute(model);

		return "content_view";
	}

	@RequestMapping(value = "/modify.kosc", method = RequestMethod.POST)
	public String modify(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);

		command = new BModifyCommand();
		command.execute(model);

		return "redirect:list";
	}

	@RequestMapping("/reply_view.kosc")
	public String replyView(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);
		command = new BReplyViewCommand();
		command.execute(model);

		return "reply_view";
	}

	@RequestMapping("/reply.kosc")
	public String reply(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);
		command = new BReplyCommand();
		command.execute(model);

		return "redirect:list";
	}

	@RequestMapping("/delete.kosc")
	public String delete(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);
		command = new BDeleteCommand();
		command.execute(model);

		return "redirect:list";
	}
}

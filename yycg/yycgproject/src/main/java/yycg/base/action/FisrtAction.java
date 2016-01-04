package yycg.base.action;

import org.directwebremoting.annotations.RemoteMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yycg.base.pojo.po.User;
import yycg.base.service.UserService;

@Controller
public class FisrtAction {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/first")
	public String first(Model model) throws Exception{
		//User user = userService.findUserByUserid(1);
		//model.addAttribute("user", user);
		return "/base/first";
	}
}

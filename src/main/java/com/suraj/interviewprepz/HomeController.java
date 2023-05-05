package com.suraj.interviewprepz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@RequestMapping("/index")
	public String Home()
	{
		return "index.jsp";
	}
	@RequestMapping("/java")
	public String Java()
	{
		return "java.jsp";
	}
	@RequestMapping("/interviewtips")
	public String InterviewTips()
	{
		return "interviewtips.jsp";
	}
	@RequestMapping("/applyingtips")
	public String ApplyingTips()
	{
		return "applyingtips.jsp";
	}
	@RequestMapping("/aboutus")
	public String AboutUs()
	{
		return "aboutus.jsp";
	}
}


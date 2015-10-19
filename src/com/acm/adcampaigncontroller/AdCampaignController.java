package com.acm.adcampaigncontroller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Controller
public class AdCampaignController {
	
		/*@RequestMapping("/welcome/{countryName}/{userName}")
		public ModelAndView helloWorld(@PathVariable("userName") String name, @PathVariable Map<String, String> pathVars) {

			String nameMap = pathVars.get("userName");
			ModelAndView model = new ModelAndView("AdCampaign");
			model.addObject("msg","Hello " + nameMap + "you are from " + pathVars.get("countryName"));

			return model;
		}*/

	@InitBinder
	public void initBinder(WebDataBinder binder){
		//binder.setDisallowedFields(new String[] {"campaignStartDate"});
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, "campaignStartDate", new CustomDateEditor(sdf, false));		
	}
	
	@RequestMapping(value = "/AdCampaign", method=RequestMethod.GET)
	public ModelAndView getAdCampaign() {
		
		ModelAndView model = new ModelAndView("AdCampaign");		
		return model;
	}
	
	@ModelAttribute 
	public void setCommonObject(ModelAndView model){
		String sMsg = "Welcome to Ad Campaign Managment system!";
		model.addObject("headerMessage", sMsg);
	}
	
	@RequestMapping(value="/submitCampaignForm.html", method=RequestMethod.POST)
	public ModelAndView submitCampaignForm(@ModelAttribute("campaign1") Campaign campaign1, BindingResult result) {
		if (result.hasErrors()){
			ModelAndView model = new ModelAndView("AdCampaign");
			return model;
		}
		ModelAndView model = new ModelAndView("SubmitConfirm");		
		
		return model;
	}
		
	}


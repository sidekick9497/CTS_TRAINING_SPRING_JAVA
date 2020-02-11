package com.cts.training.maven.resources;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.maven.dao.IcarsDao;
import com.cts.training.spring.models.Cars;
import com.cts.training.spring.models.Game;

@Controller
public class MyController {
	
	@Autowired
	private IcarsDao carsDao;
	
		@RequestMapping("/")
		public String home() {
			// add business logics
			
			// must always return view name
			return "home";
			
		}
		@RequestMapping("/game")
		public String game(@ModelAttribute Game game)
		{
			
			return "game";
		}
		@RequestMapping("/start")
		public String start(@ModelAttribute Game game)
		{	
			System.out.println("ENTERED DATA");
			System.out.println("name   " + game.getName());
			System.out.println("genre   "  + game.getGenre());
			
			return "start";
		}
		@RequestMapping("/enterCar")
		public String enterCar(@ModelAttribute Cars cars)
		{
			
						
			return "EnterCars";
		}
		
		@RequestMapping("/addCars")
		public String addCars(Model model,@ModelAttribute Cars car) {
			
			System.out.print(car.toString());
			boolean result = this.carsDao.add(car);
			System.out.println(result);
			System.out.println(car.getName());
			return "addCars";
		}
		@RequestMapping("/showCars")
		public String showCars(Model model)
		{
			List<Cars> cars = this.carsDao.findAll();
			model.addAttribute("cars",cars);
			return "showCars";
		}
		
	}


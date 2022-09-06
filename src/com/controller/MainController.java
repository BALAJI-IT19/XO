package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Player;

@Controller
public class MainController {

	Player gp;

	@RequestMapping("welcome")
	public String index() {
		return "welcome";
	}

	@RequestMapping("play")
	public ModelAndView game(Player p) {
		ModelAndView mav = new ModelAndView();
		if (p.getPlayer1().equals("X"))
			p.setPlayer2("O");
		else
			p.setPlayer2("X");
		if (p.getCp() == null) {
			p.setCp(p.getPlayer1());
		}
		mav.addObject("details", p);
		gp = p;
		mav.setViewName("play");
		return mav;
	}

	@RequestMapping("checkAvail")
	public ModelAndView availability(@RequestParam("cbox") String box) {
		ModelAndView mav = new ModelAndView();
		if (getBox(box).equals(" ")) {
			if (gp.getCp().equals("X")) {
				setBox(box,"X");
				gp.setCp("O");
			} else {
				setBox(box,"O");
				gp.setCp("X");
			}
		}
		mav.addObject("details", gp);
		if (winning("X")) {
			mav.setViewName("result");
		} else if (winning("O")) {
			mav.setViewName("result");
		} else {
			mav.setViewName("play");
		}
		return mav;
	}

	boolean winning(String XO) {
		if (gp.getBox1() == gp.getBox2() && gp.getBox1() == gp.getBox3()) {
			if (gp.getBox1().equals(XO)) {
				gp.setWinner(XO);
				return true;
			}
		} else if (gp.getBox4() == gp.getBox5() && gp.getBox4() == gp.getBox6()) {
			if (gp.getBox4().equals(XO)) {
				gp.setWinner(XO);
				return true;
			}
		} else if (gp.getBox7() == gp.getBox8() && gp.getBox7() == gp.getBox9()) {
			if (gp.getBox7().equals(XO)) {
				gp.setWinner(XO);
				return true;
			}
		} else if (gp.getBox1() == gp.getBox4() && gp.getBox1() == gp.getBox7()) {
			if (gp.getBox1().equals(XO)) {
				gp.setWinner(XO);
				return true;
			}
		} else if (gp.getBox2() == gp.getBox5() && gp.getBox2() == gp.getBox8()) {
			if (gp.getBox2().equals(XO)) {
				gp.setWinner(XO);
				return true;
			}
		} else if (gp.getBox3() == gp.getBox6() && gp.getBox3() == gp.getBox9()) {
			if (gp.getBox3().equals(XO)) {
				gp.setWinner(XO);
				return true;
			}
		} else if (gp.getBox1() == gp.getBox5() && gp.getBox1() == gp.getBox9()) {
			if (gp.getBox1().equals(XO)) {
				gp.setWinner(XO);
				return true;
			}
		} else if (gp.getBox3() == gp.getBox5() && gp.getBox3() == gp.getBox7()) {
			if (gp.getBox3().equals(XO)) {
				gp.setWinner(XO);
				return true;
			}
		}
		return false;
	}

	String getBox(String box) {
		switch (box) {
		case "box1":
			return gp.getBox1();
		case "box2":
			return gp.getBox2();
		case "box3":
			return gp.getBox3();
		case "box4":
			return gp.getBox4();
		case "box5":
			return gp.getBox5();
		case "box6":
			return gp.getBox6();
		case "box7":
			return gp.getBox7();
		case "box8":
			return gp.getBox8();
		case "box9":
			return gp.getBox9();
		}
		return null;
	}
	
	void setBox(String box,String XO) {
		switch (box) {
		case "box1":
			gp.setBox1(XO);break;
		case "box2":
			gp.setBox2(XO);break;
		case "box3":
			gp.setBox3(XO);break;
		case "box4":
			gp.setBox4(XO);break;
		case "box5":
			gp.setBox5(XO);break;
		case "box6":
			gp.setBox6(XO);break;
		case "box7":
			gp.setBox7(XO);break;
		case "box8":
			gp.setBox8(XO);break;
		case "box9":
			gp.setBox9(XO);break;
		}
	}

}

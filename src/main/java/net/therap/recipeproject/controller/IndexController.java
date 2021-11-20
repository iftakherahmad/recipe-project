package net.therap.recipeproject.controller;

import net.therap.recipeproject.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author iftakhar.ahmed
 * @since 11/16/21
 */
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
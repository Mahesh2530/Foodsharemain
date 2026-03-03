package com.klef.sdp.backendproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/categories")
@CrossOrigin("*")
public class CategoryController {
    
    @GetMapping("/food")
    public ResponseEntity<?> getFoodCategories() {
        try {
            List<Map<String, String>> categories = Arrays.asList(
                createCategory("fruits_vegetables", "Fruits & Vegetables"),
                createCategory("grains_cereals", "Grains & Cereals"),
                createCategory("dairy", "Dairy Products"),
                createCategory("bakery", "Bakery Items"),
                createCategory("cooked_meals", "Cooked Meals"),
                createCategory("canned_food", "Canned Food"),
                createCategory("beverages", "Beverages"),
                createCategory("other", "Other")
            );
            return ResponseEntity.ok(categories);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(500).body("Failed to Get Categories: " + e.getMessage());
        }
    }
    
    private Map<String, String> createCategory(String value, String label) {
        Map<String, String> category = new HashMap<>();
        category.put("value", value);
        category.put("label", label);
        return category;
    }
}

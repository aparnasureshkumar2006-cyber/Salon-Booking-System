package com.aparna.controller;

import com.aparna.dto.SalonDTO;
import com.aparna.model.Category;
import com.aparna.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/categories/salon-owener")
public class SalonCategoryController {

    private final CategoryService categoryService;

    @PostMapping()
    public ResponseEntity<Category> createCategory(@RequestBody Category category){
        SalonDTO salonDTO = new SalonDTO();
        salonDTO.setId(1L);

        Category saveCategory = categoryService.saveCategory(category,salonDTO);
        return ResponseEntity.ok(saveCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) throws Exception {
        SalonDTO salonDTO = new SalonDTO();
        salonDTO.setId(1L);
        categoryService.deleteCategoryById(id,salonDTO.getId());
        return ResponseEntity.ok("Category Deleted Successfully");
    }
}

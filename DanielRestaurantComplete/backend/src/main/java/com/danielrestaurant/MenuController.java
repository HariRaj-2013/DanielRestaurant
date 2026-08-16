package com.danielrestaurant;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
class MenuController{
 @GetMapping("/api/dishes")
 public List<Map<String,Object>> dishes(){
  return List.of(
   Map.of("name","Idli","price",40),
   Map.of("name","Dosa","price",80),
   Map.of("name","Chicken Biryani","price",220)
  );
 }
}

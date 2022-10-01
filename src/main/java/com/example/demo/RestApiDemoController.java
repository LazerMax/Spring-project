package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class RestApiDemoController {
    private List<Water_areas> areas = new ArrayList<>();
    private Water_areas area;
    public RestApiDemoController() {
        this.areas.addAll(List.of(
                new Water_areas(1, "Pacific", "ocean", "salty", 178684000, "км²"),
                new Water_areas(2, "Baikal", "lake", "fresh", 31722, "км²"),
                new Water_areas(3, "Neil", "river", "fresh", 3000000, "км²")));
    }

    @RequestMapping(value = "/areas", method = RequestMethod.GET)
    Iterable<Water_areas> getWater_areas() {
        return areas;
    }

    @GetMapping("/areas/{id}")
    Optional<Water_areas> getWater_areasById(@PathVariable int id) {
        for (Water_areas b : areas) {
            if (b.getId() == id) {
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }

    @DeleteMapping("/areas/{id}")
    void deleteWater_areas(@PathVariable int id) {
        areas.removeIf(c -> c.getId() == id);
    }



    @GetMapping("/areas/{title}")
    Optional<Water_areas> getWater_areasByTitle(@PathVariable String title) {
        for (Water_areas d : areas) {
            if (Objects.equals(d.getTitle(), title)) {
                return Optional.of(d);
            }
        }
        return Optional.empty();
    }

    @DeleteMapping("/areas/{title}")
    void deleteWater_areas(@PathVariable String title) {
        areas.removeIf(d -> Objects.equals(d.getTitle(), title));
    }

}


package org.limit.debiting.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/limit")
@RequiredArgsConstructor
public class LimitController {

    @GetMapping("/start")
    public String getProductByUserId() {
        return "Гойда!!!!";
    }
}

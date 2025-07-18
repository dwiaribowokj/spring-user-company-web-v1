package com.company.user.web.v1.controller;

import com.company.user.lib.core.v1.master.company.Company;
import com.company.user.lib.core.v1.master.company.CompanyService;
import com.company.user.lib.core.v1.master.company.dto.CompanyCreateRequest;
import com.company.user.lib.core.v1.master.company.dto.CompanyDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<CompanyDto> create(@Valid @RequestBody CompanyCreateRequest request) {
        return ResponseEntity.ok(companyService.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDto> getDetail(@PathVariable String id) {
        Company company = companyService.findById(id);
        return ResponseEntity.ok(CompanyDto.fromEntity(company));
    }

}
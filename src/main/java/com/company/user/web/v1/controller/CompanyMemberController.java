package com.company.user.web.v1.controller;

import com.company.user.lib.core.v1.master.company.dto.CompanyDto;
import com.company.user.lib.core.v1.referensi.company_member.CompanyMemberService;
import com.company.user.lib.core.v1.referensi.company_member.dto.CompanyMemberAddRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class CompanyMemberController {

    private final CompanyMemberService companyMemberService;

    @PostMapping("")
    public ResponseEntity<?> addMember(
            @PathVariable String companyId,
            @Valid @RequestBody CompanyMemberAddRequest request
    ) {
        // Force set companyId dari path param
        request.setCompanyId(companyId);
        return ResponseEntity.ok(companyMemberService.addMember(request));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<CompanyDto>> getCompaniesByUser(@PathVariable String userId) {
        return ResponseEntity.ok(companyMemberService.getCompaniesByUserId(userId));
    }

    @DeleteMapping("/{companyId}/{userId}")
    public ResponseEntity<Void> removeMember(
            @PathVariable String companyId,
            @PathVariable String userId
    ) {
        companyMemberService.removeMember(userId, companyId);
        return ResponseEntity.noContent().build();
    }
}

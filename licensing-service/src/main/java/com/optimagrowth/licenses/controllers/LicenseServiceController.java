package com.optimagrowth.licenses.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optimagrowth.licenses.services.LicenseService;
import com.optiomagrowth.licenses.domain.License;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

  private final LicenseService licenseService;

  public LicenseServiceController(LicenseService licenseService) {
    this.licenseService = licenseService;
  }

  @GetMapping(value = "/{licenseId}")
  public License getLicense(
      @PathVariable("organizationId") String organizationId,
      @PathVariable("licenseId") String licenseId) {
    return licenseService.getLicense(organizationId, licenseId);
  }

}

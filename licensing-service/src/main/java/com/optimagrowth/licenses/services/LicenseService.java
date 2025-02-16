package com.optimagrowth.licenses.services;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.optiomagrowth.licenses.domain.License;

@Service
public class LicenseService {
  public License getLicense(String organizationId, String licenseId) {
    return new License()
        .withId(new Random().nextInt(1000))
        .withLicenseId(licenseId)
        .withOrganizationId(organizationId)
        .withDescription("Software product")
        .withProductName("ostock")
        .withLicenseType("full");
  }
}

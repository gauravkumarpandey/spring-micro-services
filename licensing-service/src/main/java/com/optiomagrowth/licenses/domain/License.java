package com.optiomagrowth.licenses.domain;

public class License {
  private int id;
  private String productName;
  private String licenseType;
  private String organizationId;
  private String licenseId;
  private String description;

  public License withId(int id) {
    this.id = id;
    return this;
  }

  public License withDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public License withLicenseId(String licenseId) {
    this.licenseId = licenseId;
    return this;
  }

  public String getLicenseId() {
    return licenseId;
  }

  public License withProductName(String productName) {
    this.productName = productName;
    return this;
  }

  public License withLicenseType(String licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  public License withOrganizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  public int getId() {
    return id;
  }

  public String getProductName() {
    return productName;
  }

  public String getLicenseType() {
    return licenseType;
  }

  public String getOrganizationId() {
    return organizationId;
  }

}

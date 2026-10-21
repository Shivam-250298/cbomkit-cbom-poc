# CBOMkit POC

Cryptography Bill of Materials (CBOM) proof of concept using
Jenkins, SonarQube and CBOMkit.

## Contents
- samples/CryptoDemo.java — Sample Java cryptography code
- reports/crypto-demo-cbom.json — Generated CycloneDX CBOM report

## Architecture
Jenkins Controller -> Jenkins Agent -> SonarQube + CBOMkit -> CBOM Report

## Detection
SHA-256 cryptographic asset detected in the sample Java project.

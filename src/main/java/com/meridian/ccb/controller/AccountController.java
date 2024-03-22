package com.meridian.ccb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meridian.ccb.model.Account;
import com.meridian.ccb.service.RestAPIClient;
import com.meridian.ccb.service.TutorialService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Meridian Utilities API for Oracle CCB", description = "Account Management")
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class AccountController {
	@Autowired
	TutorialService tutorialService;

	@Autowired
	RestAPIClient restApiClient;

	@Operation(summary = "This operation handles the Integration Suite API to Get Account\n" + "\n" + "", tags = {
			"retrieve" })
	@GetMapping("/account/{accountId}")
	public ResponseEntity<Account> getAccount(@PathVariable("accountId") String accountId) {
		try {
			Account account = new Account();
			String response = restApiClient.get("/accounts/" + accountId);
			ObjectMapper mapper = new ObjectMapper();
			Object jsonString = mapper.readTree(response).toPrettyString();
			return ResponseEntity.ok(account);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Operation(summary = "This operation handles the Integration Suite API to Update Account\n" + "\n" + "", tags = {
			"create" })
	@ApiResponses({
			@ApiResponse(responseCode = "200", content = {
					@Content(schema = @Schema(implementation = Account.class), mediaType = "application/json") }),
			@ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }),
			@ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }) })
	@PostMapping("/")
	public ResponseEntity<String> createAccount(@RequestBody String accountData) {
		try {
			String response = restApiClient.post("", accountData);
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
		}
	}

	@Operation(summary = "This operation handles the Integration Suite API to Delete Account\n" + "\n" + "", tags = {
			"delete" })
	@ApiResponses({
			@ApiResponse(responseCode = "200", content = {
					@Content(schema = @Schema(implementation = String.class), mediaType = "application/json") }),
			@ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }),
			@ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }) })
	@DeleteMapping("/{accountId}")
	public ResponseEntity<String> deleteAccount(@PathVariable String accountId) {
		try {
			String response = restApiClient.delete(accountId);
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
		}
	}

	@Operation(summary = "This operation handles the Integration Suite API to Update Account\n" + "\n" + "", tags = {
			"update" })
	@ApiResponses({
			@ApiResponse(responseCode = "200", content = {
					@Content(schema = @Schema(implementation = Account.class), mediaType = "application/json") }),
			@ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }),
			@ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }) })
	@PutMapping("/{accountId}")
	public ResponseEntity<Account> updateAccount(@PathVariable String accountId, @RequestBody String accountData) {
		try {
			Account account = new Account();
			String response = restApiClient.put(accountId, accountData);
			return ResponseEntity.ok(account);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

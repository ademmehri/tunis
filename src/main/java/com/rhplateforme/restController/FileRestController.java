package com.rhplateforme.restController;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rhplateforme.entities.File;
import com.rhplateforme.service.FileService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins =  "https://www.tie-job.com")
//@CrossOrigin(origins =  "http://localhost:4200")
public class FileRestController {
@Autowired
FileService fileserv;





}

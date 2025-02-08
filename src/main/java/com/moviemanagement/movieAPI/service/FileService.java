package com.moviemanagement.movieAPI.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface FileService {

    String uploadFile(String path , MultipartFile file) throws IOException; // MultipartFile is used when receiving files from clients.

    InputStream getResourceFile(String path , String name) throws FileNotFoundException; // InputStream is used to read files for downloads or processing.

}

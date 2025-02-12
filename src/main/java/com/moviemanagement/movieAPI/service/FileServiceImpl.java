package com.moviemanagement.movieAPI.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


@Service
public class FileServiceImpl implements FileService{

    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException {

        String fileName = file.getOriginalFilename(); // we will get the name of the file

        String filePath = path + File.separator + fileName; // we will get the path of the file

        File f = new File(path);
        if(!f.exists()){
            f.mkdir();
        }

        // upload file to the path
        Files.copy(file.getInputStream() , Paths.get(filePath) , StandardCopyOption.REPLACE_EXISTING);
        return fileName;
        // this way the file will be uploaded in the backend server
    }

    @Override
    public InputStream getResourceFile(String path, String fileName) throws FileNotFoundException {
        String filePath = path + File.separator + fileName;
        return new FileInputStream(filePath);
    }
}

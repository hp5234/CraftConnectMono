package com.craftconnect.craftconnectmono.app.images.service;

import com.craftconnect.craftconnectmono.app.images.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository imageRepository;
} 
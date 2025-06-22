package com.craftconnect.craftconnectmono.app.images.repository;

import com.craftconnect.craftconnectmono.app.images.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
} 
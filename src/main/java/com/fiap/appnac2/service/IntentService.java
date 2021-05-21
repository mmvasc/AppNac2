package com.fiap.appnac2.service;

import com.fiap.appnac2.dto.Intent;

import java.util.List;

public interface IntentService {

    List<Intent> intentList();
    Intent intentSave(Intent intent);
    Intent editIntent(Long id);
    void deleteIntent(Long id);
}


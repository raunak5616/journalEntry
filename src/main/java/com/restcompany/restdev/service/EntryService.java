package com.restcompany.restdev.service;

import com.restcompany.restdev.entity.Entry;
import com.restcompany.restdev.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EntryService {

    @Autowired
    private JournalRepository journalRepository;

    public void saveEntry(Entry entry) {
        entry.setDate(new Date());
        journalRepository.save(entry);
    }

    public List<Entry> getAll() {
        return journalRepository.findAll();
    }

    public Optional<Entry> findById(String id) {
        return journalRepository.findById(id);
    }
}
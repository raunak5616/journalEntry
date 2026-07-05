package com.restcompany.restdev.controller;

import com.restcompany.restdev.entity.Entry;
import com.restcompany.restdev.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {
    @Autowired
    private EntryService entryService;

    @GetMapping
    public List<Entry> getAll(){
        return entryService.getAll();
    }

    @PostMapping
    public boolean createUser(@RequestBody Entry entries){
        entryService.saveEntry(entries);
     return true;
    }
    @GetMapping("id/{id}")
    public Entry getById(@PathVariable String id){
        return entryService.findById(id).orElse(null);

    }

}

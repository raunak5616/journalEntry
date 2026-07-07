package com.restcompany.restdev.controller;

import com.restcompany.restdev.entity.Entry;
import com.restcompany.restdev.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<?> getById(@PathVariable String id){
        Optional<Entry> entries = entryService.findById(id);
        if(entries.isPresent()){
            return new ResponseEntity<>(entries.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}

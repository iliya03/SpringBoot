package com.technexo.journalApp.controller;

import com.technexo.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

   private Map<Long, JournalEntry> journalEntries =  new HashMap<>();


   @GetMapping
   public List<JournalEntry> getAll(){
      return new ArrayList<>(journalEntries.values());
   }

   @PostMapping
   public boolean createEntry(@RequestBody JournalEntry myentry){
      journalEntries.put(myentry.getId(), myentry);
      return true;
   }

   @GetMapping("id/{myId}")
   public JournalEntry getJournalEnrtryId(@PathVariable Long myId){
      return journalEntries.get(myId);
   }

   @DeleteMapping("id/{myId}")
   public JournalEntry deleteJournalEntryId(@PathVariable Long myId){
      return journalEntries.remove(myId);
   }

   @PutMapping("/id/{myId}")
   public JournalEntry updateJournalEntry(@PathVariable Long myId, @RequestBody JournalEntry myentry){
      return journalEntries.put(myId, myentry);
   }
}

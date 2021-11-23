package com.parlantos.guild.controller;

import com.parlantos.guild.models.GuildEntity;
import com.parlantos.guild.service.GuildService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/guild")
public class GuildController {

    private GuildService guildService;

    GuildController(GuildService guildService) {
        this.guildService = guildService;
    }

    @GetMapping
    public ResponseEntity<GuildEntity> fetchAllGuildsForUser(@RequestParam String memberId) {
        return new ResponseEntity(this.guildService.fetchAllGuildsForUser(memberId), HttpStatus.OK);
    }

}
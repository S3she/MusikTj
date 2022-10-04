package com.grupparbete.musikapp.controller;

import com.grupparbete.musikapp.model.Playlist;
import com.grupparbete.musikapp.service.PlaylistService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @PostMapping("/playlist")
    public void addPlaylist(@RequestBody Playlist playlist){
        playlistService.addPlaylist(playlist);
    }

    @DeleteMapping("/playlist/{id}")
    public void deletePlaylistById(@PathVariable("id") Integer id) {
        playlistService.deletePlaylistById(id);
    }
}

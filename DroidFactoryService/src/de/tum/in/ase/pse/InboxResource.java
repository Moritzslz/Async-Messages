package de.tum.in.ase.pse;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping(value = "/inbox/", consumes = "application/json")
public class InboxResource {

    private final DroidFactory factory = new DroidFactory();

    @PostMapping("r2")
    public ResponseEntity<String> droidReadyR2(@RequestBody Droids droid) {
        return new ResponseEntity<>(factory.produce(droid).getName(), HttpStatus.OK);
    }

    @PostMapping("3po")
    public ResponseEntity<String> droidReady3PO(@RequestBody Droids droid) {
        return new ResponseEntity<>(factory.produce(droid).getName(), HttpStatus.OK);
    }
}

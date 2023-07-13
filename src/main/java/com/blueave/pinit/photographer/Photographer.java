package com.blueave.pinit.photographer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Photographer {

    private String username;
    private String email;
}

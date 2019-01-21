package com.stackroute.musicApplicationTask1.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Tracks")
@Data
public class Track {
    @Id
    @ApiModelProperty(notes = "Track Id")
    private int trackId;
    @ApiModelProperty(notes = "Track name")
    private String trackName;
    @ApiModelProperty(notes = "Track comments")
    private String comments;
}

package goit.hw12.entity;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.Generated;

@Data
@Builder
public class Note {
    @Generated
    private long id;
    private String title;
    private String content;
}

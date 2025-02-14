package con.turaco.dto;

import java.time.LocalDateTime;
import lombok.*;

@Data
@Builder
public class BOARDDto {

    Long ID;

    String TITLE;

    String CONTENT;

    LocalDateTime CREATED_AT;

}

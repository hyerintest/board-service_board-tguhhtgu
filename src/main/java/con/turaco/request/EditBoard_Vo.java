package con.turaco.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.HashMap;
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "EditBoard_Vo DTO")
public class EditBoard_Vo {

    @Schema(description = "title")
    private String title;

    @Schema(description = "content")
    private HashMap<String, Object> content;

}
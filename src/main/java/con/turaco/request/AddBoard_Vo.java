package con.turaco.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "AddBoard_Vo DTO")
public class AddBoard_Vo {

    @Schema(description = "content")
    private String content;

    @Schema(description = "title")
    private String title;

    @Schema(description = "file")
    private String file;

}
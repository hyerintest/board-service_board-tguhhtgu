package con.turaco.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.util.Strings;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import con.turaco.annotation.AnonymousCallable;
import con.turaco.exception.InvalidParameterException;
import con.turaco.response.ResponseObject;
import java.util.HashMap;
import con.turaco.request.AddBoard_Vo;
import con.turaco.request.EditBoard_Vo;
import java.util.concurrent.Callable;

@RestController
@RequestMapping()
@MarkdownDescription(markdown = SwaggerMarkdown.MANAGE_BOARD_CNTR_TAG)
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "정상 응답", content = @Content(schema = @Schema(implementation = ResponseObject.class))),
        @ApiResponse(responseCode = "400", description = "권한 없음", content = @Content(schema = @Schema(implementation = InvalidParameterException.class))),
        @ApiResponse(responseCode = "401", description = "인증 실패", content = @Content(schema = @Schema(implementation = AuthException.class))),
        @ApiResponse(responseCode = "405", description = "허용되지 않은 메서드", content = @Content(schema = @Schema(implementation = NotAllowedMethodException.class))),
        @ApiResponse(responseCode = "500", description = "서버 오류", content = @Content(schema = @Schema(implementation = ServiceUnavailableException.class))),
        @ApiResponse(responseCode = "401", description = "권한 없음", content = @Content(schema = @Schema(implementation = PermissionDeniedException.class)))
    })
public class ManageBoardCntr {
    private Logger logger = LogManager.getLogger("con.turaco");


    @AnonymousCallable
    @RequestMapping(value = "/board", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @MarkdownDescription(markdown = SwaggerMarkdown.ADD_BOARD_OPERATION)
    public Callable<ResponseObject> AddBoard(
        @Parameter(name = "AddBoard", description = "This parameter for AddBoard", required = true, schema = @Schema(type = "AddBoardVo")) @RequestBody AddBoard_Vo AddBoard_Vo) {

        return () -> {
            ResponseObject responseObject = new ResponseObject();
            responseObject.putResult(true);
            return responseObject;
        };
    }
    @AnonymousCallable
    @RequestMapping(value = "/board/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @MarkdownDescription(markdown = SwaggerMarkdown.EDIT_BOARD_OPERATION)
    public Callable<ResponseObject> EditBoard(
        @Parameter(name = "EditBoard", description = "This parameter for EditBoard", required = true, schema = @Schema(type = "EditBoardVo")) @RequestBody EditBoard_Vo EditBoard_Vo, 
        @Parameter(name = "id", description = "This parameter for id", required = true, schema = @Schema(type = "String")) @PathVariable(value = "id", required = false) final String id) {

        return () -> {
            ResponseObject responseObject = new ResponseObject();

            if (Strings.isNullOrEmpty(id)) {
                    throw new InvalidParameterException(logger, "id cannot be null or empty.");
            }

            responseObject.putResult(true);
            return responseObject;
        };
    }
    @AnonymousCallable
    @RequestMapping(value = "/board/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    @MarkdownDescription(markdown = SwaggerMarkdown.DELETE_BOARD_OPERATION)
    public Callable<ResponseObject> DeleteBoard(
        @Parameter(name = "id", description = "This parameter for id", required = true, schema = @Schema(type = "String")) @PathVariable(value = "id", required = false) final String id) {

        return () -> {
            ResponseObject responseObject = new ResponseObject();

            if (Strings.isNullOrEmpty(id)) {
                    throw new InvalidParameterException(logger, "id cannot be null or empty.");
            }

            responseObject.putResult(true);
            return responseObject;
        };
    }
    @AnonymousCallable
    @RequestMapping(value = "/board/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @MarkdownDescription(markdown = SwaggerMarkdown.ADD_FILE_OPERATION)
    public Callable<ResponseObject> AddFile(
        @Parameter(name = "file", description = "This parameter for file", required = true, schema = @Schema(type = "String")) @RequestBody String file, 
        @Parameter(name = "id", description = "This parameter for id", required = true, schema = @Schema(type = "String")) @PathVariable(value = "id", required = false) final String id) {

        return () -> {
            ResponseObject responseObject = new ResponseObject();

            if (Strings.isNullOrEmpty(id)) {
                    throw new InvalidParameterException(logger, "id cannot be null or empty.");
            }

            responseObject.putResult(true);
            return responseObject;
        };
    }
    @AnonymousCallable
    @RequestMapping(value = "/board/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    @MarkdownDescription(markdown = SwaggerMarkdown.DELETE_FILE_OPERATION)
    public Callable<ResponseObject> DeleteFile(
        @Parameter(name = "id", description = "This parameter for id", required = true, schema = @Schema(type = "String")) @PathVariable(value = "id", required = false) final String id) {

        return () -> {
            ResponseObject responseObject = new ResponseObject();

            if (Strings.isNullOrEmpty(id)) {
                    throw new InvalidParameterException(logger, "id cannot be null or empty.");
            }

            responseObject.putResult(true);
            return responseObject;
        };
    }
}

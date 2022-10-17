package distributed.system.homework.addnoteservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    private Long noteId;
    private String noteContent;
    private Long userId;
    private Date createDate;
    private Date modifyDate;

    @Override
    public String toString() {
        return "Note Id" + noteId + "\nuserId" + userId + "\nnoteContent:" + noteContent;
    }
}
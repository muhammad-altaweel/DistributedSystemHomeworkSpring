package distributed.system.homework.decorate.DTO;


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
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
package distributed.system.homework.note.entity;



import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long noteId;
    private String noteContent;
    private Long userId;

    @CreationTimestamp
    private Date createDate;

    @UpdateTimestamp
    private Date modifyDate;
    @Override
    public String toString(){
        return "Note Id" + noteId + "\nuserId"+userId+"\nnoteContent:" + noteContent;
    }
}
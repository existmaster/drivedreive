package drive.domain;

import drive.SteamApplication;
import drive.domain.Streamed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Steam_table")
@Data
public class Steam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        Streamed streamed = new Streamed(this);
        streamed.publishAfterCommit();
    }

    public static SteamRepository repository() {
        SteamRepository steamRepository = SteamApplication.applicationContext.getBean(
            SteamRepository.class
        );
        return steamRepository;
    }

    public static void videoStreaming(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Steam steam = new Steam();
        repository().save(steam);

        Streamed streamed = new Streamed(steam);
        streamed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(steam->{
            
            steam // do something
            repository().save(steam);

            Streamed streamed = new Streamed(steam);
            streamed.publishAfterCommit();

         });
        */

    }
}

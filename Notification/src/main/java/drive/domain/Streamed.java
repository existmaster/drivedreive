package drive.domain;

import drive.domain.*;
import drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Streamed extends AbstractEvent {

    private Long id;
}

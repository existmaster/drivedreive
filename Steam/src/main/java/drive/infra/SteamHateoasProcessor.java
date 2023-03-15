package drive.infra;

import drive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SteamHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Steam>> {

    @Override
    public EntityModel<Steam> process(EntityModel<Steam> model) {
        return model;
    }
}

package drive.domain;

import drive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "steams", path = "steams")
public interface SteamRepository
    extends PagingAndSortingRepository<Steam, Long> {}

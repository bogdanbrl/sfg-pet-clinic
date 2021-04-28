package bogdanbrl.data.services;

import bogdanbrl.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}

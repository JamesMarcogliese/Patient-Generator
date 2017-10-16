package core;

import core.model.componentModel.Demographic;

public interface IPersistenceService {
    public Boolean save(Demographic options);
    //public Task<Boolean> saveAsync(Demographic options);
}

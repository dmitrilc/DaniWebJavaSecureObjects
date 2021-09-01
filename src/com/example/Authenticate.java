package com.example;

import java.util.List;
import java.util.UUID;

public class Authenticate {
    private List<UUID> uuids;

    public boolean isCorrectUUID(UUID uuid){
        return uuids.contains(uuid);
    }
}

class MaliciousAuthenticate extends Authenticate {
    @Override
    public boolean isCorrectUUID(UUID uuid){
        return true;
    }
}

//public final class Authenticate {
//    private List<UUID> uuids;
//
//    public boolean isCorrectUUID(UUID uuid){
//        return uuids.contains(uuid);
//    }
//}
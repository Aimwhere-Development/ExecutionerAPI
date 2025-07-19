package me.aimwhere.executionerapi.shit;

public enum CheckType {

    AIM("Aim"),
    ANALYSIS("Analysis"),
    BARITONE("Baritone"),
    FASTPLACE("Fast Place"),
    FASTBREAK("Fast Break"),
    INVALID_INTERACT("Invalid Interact"),
    NUKER("Nuker"),
    AURABOT("AuraBot"),
    AUTOCLICKER("Auto Clicker"),
    CRASHER("Crasher"),
    HEURISTIC("Heuristic"),
    HITBOX("Hitbox"),
    INVENTORY("Inventory"),
    REFILL("Refill"),
    THROWPOTION("Throw Pot"),
    MISC("Misc"),
    NEURAL("Neural"),
    MOVE("Move"),
    PROTOCOL("Protocol"),
    RAYTRACE("Raytrace"),
    REACH("Reach"),
    SIMULATION("Simulation"),
    TIMER("Timer"),
    VELOCITY("Velocity"),
    SCAFFOLD("Scaffold"),
    OTHER("Other");

    private final String value;

    CheckType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


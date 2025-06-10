package me.aimwhere.executionerapi.shit;

public enum CheckType {

    AIM("Aim"),
    ANALYSIS("Analysis"),
    BARITONE("Baritone"),
    FASTPLACE("FastPlace"),
    FASTBREAK("FastBreak"),
    WRONGBREAK("WrongBreak"),
    NUKER("Nuker"),
    AURABOT("AuraBot"),
    AUTOCLICKER("AutoClicker"),
    CRASHER("Crasher"),
    HEURISTIC("Heuristic"),
    HITBOX("Hitbox"),
    INVENTORY("Inventory"),
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


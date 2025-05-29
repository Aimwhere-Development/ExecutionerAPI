# AnticheatAPI
Anticheat API by Aperture Development, current use case - Executioner Anticheat.

## Events
- `AddUserEvent` - Called when a player is injected to Executioner.
- `RemoveUserEvent` - Called when a player is un-injected from Executioner.
- `GhostBlockEvent` - Called when a player interacts with a ghost-block.
- `FlagEvent` - Called when a player is flagged by Executioner.
- `PunishEvent` - Called when a player is punished by Executioner.
- `AttemptedCrashEvent` - Called when Executioner detects a player trying to crash the server.
- `MitigationEvent` - Called when a player is mitigated by Executioner (soon).
- `BlacklistEvent` - Called when Executioner detects a player in the global Blacklist (soon).
- `SpawnAurabotEvent` - Called when Executioner spawns a killaura detection bot on a player.
- `DespawnAurabotEvent` - Called when Executioner despawns a current killaura detection bot on a player.

## Installation
#### Maven:
```xml
<repository>
    <id>aimwhere</id>
    <url>https://nexus.aimwhere.net/repository/maven-releases/</url>
</repository>

<dependency>
    <groupId>me.aimwhere</groupId>
    <artifactId>ExecutionerAPI</artifactId>
    <version>2.0.0</version>
    <scope>compile</scope>
</dependency>
```




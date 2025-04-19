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

## Installation
#### Maven:
```xml
<repository>
    <id>aimwhere</id>
    <url>https://nexus.aimwhere.net/repository/maven-releases/</url>
</repository>

<dependency>
    <groupId>me.aimwhere.executionerapi</groupId>
    <artifactId>AnticheatAPI</artifactId>
    <version>whatever version is latest</version>
    <scope>compile</scope>
</dependency>
```




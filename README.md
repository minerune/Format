# Format 
⚡ Lightweight library offering pleasant message formatting for Nukkit plugins.

Installation
--------
```xml
<repositories>
    <repository>
        <id>minerune-repo</id>
        <url>https://repo.minerune.online/</url>
    </repository>
</repositories>

<dependency>
    <groupId>me.seetch.format</groupId>
    <artifactId>Format</artifactId>
    <version>1.0.0</version>
</dependency>
```

Usage
--------
```java
player.sendMessage(Format.GREEN.colorize(">", "Hey, %0.", player.getName()));
// Result: §a► §fHey, §aseetch§f.
        
player.sendMessage(Format.DARK_BLUE.lines(Arrays.asList(
    "Hey, %0.",
    "It's-a Me, %1!"
), "Steve", "Mario"));
// Result: §7Hey, §1Steve§7.\n§7It's-a Me, §1Mario§7!
        
// Format message without first character.
player.sendMessage(Format.YELLOW.clean("Goodbye, %0.", player.getName()));
// Result: §fGoodbye, §aseetch§f.
```

License
--------
[MIT License](https://github.com/seetch/Format/blob/master/LICENSE).

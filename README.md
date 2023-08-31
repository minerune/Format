# Format 
⚡ Lightweight library offering pleasant message formatting for Nukkit plugins.

Installation
--------
```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
    <groupId>com.github.seetch</groupId>
    <artifactId>Format</artifactId>
    <version>1.0.5-SNAPSHOT</version>
</dependency>
```
OR
```gradle
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
	implementation 'com.github.seetch:Format:1.0.5-SNAPSHOT'
}
```

Usage
--------
```java
// Format more lines, use on forms.
    player.sendMessage(Format.DARK_BLUE.lines(Arrays.asList(
      "Hey, %0.",
      "It's-a Me, %1!"
    ), "Steve", "Mario"));
// Result: §7Hey, §1Steve§7.\n§7It's-a Me, §1Mario§7!

// Another format more lines, use on forms.
    player.sendMessage(Format.DARK_BLUE.linesOtherwise(Arrays.asList(
    "Hey, %0.",
    "It's-a Me, %1!"
    ), "Steve", "Mario"));
// Result: §1Hey, §7Steve§1.\n§1It's-a Me, §7Mario§1!        

// Format message with first character.
    player.sendMessage(Format.GREEN.message("Hey, %0.", player.getName()));
// Result: §a► §fHey, §aseetch§f.

// Another format message with first character.
    player.sendMessage(Format.GREEN.message("Hey, %0.", player.getName()));
// Result: §f► §aHey, §fseetch§a.        

// Format message without first character.
    player.sendMessage(Format.YELLOW.clean("Goodbye, %0.", player.getName()));
// Result: §fGoodbye, §aseetch§f.

// Another format message without first character.
    player.sendMessage(Format.YELLOW.clean("Goodbye, %0.", player.getName()));
// Result: §aGoodbye, §fseetch§a.
```

Settings
--------
```java
Format.setCharacter("►");            // Set first character.
Format.setDefaultColorMessage("§f"); // Set default color message.
Format.setDefaultColorForm("§7");    // Set default color form.
```

License
--------
[MIT License](https://github.com/seetch/Format/blob/master/LICENSE).

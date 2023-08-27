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
    <version>1.0.3-SNAPSHOT</version>
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
	implementation 'com.github.seetch:Format:1.0.3-SNAPSHOT'
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

// Format message with first character.
player.sendMessage(Format.GREEN.message("Hey, %0.", player.getName()));
// Format message without first character.
player.sendMessage(Format.YELLOW.clean("Goodbye, %0.", player.getName()));
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

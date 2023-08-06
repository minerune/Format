# Format
Lightweight library offering pleasant message formatting for Nukkit plugins.

Installation
--------
Place the .jar in your plugins directory.

Usage
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
    <version>Tag</version>
</dependency>
```

Example
--------
```java
// Format more lines, use on forms.
player.sendMessage(Format.DARK_BLUE.lines(Arrays.asList(
  "Hello, %0.",
  "You use %1 :)"
), "Alex", "Format library"));

// Format message with first character.
player.sendMessage(Format.GREEN.message("Hi, %0.", player.getName()));
// Format message without first character.
player.sendMessage(Format.YELLOW.clean("Hi, %0.", player.getName()));
```

License
--------
[MIT License](https://github.com/seetch/Format/blob/master/LICENSE).

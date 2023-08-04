# Format
Lightweight library offering pleasant message formatting for Nukkit plugins.

Installation
--------
```xml
<dependency>
  <groupId>me.seetch.format</groupId>
  <artifactId>Format</artifactId>
  <version>1.0.0</version>
  <systemPath>${project.basedir}/libs/Format-1.0.0.jar</systemPath>
  <scope>system</scope>
</dependency>
```

Usage
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

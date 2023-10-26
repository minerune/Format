package me.seetch.format;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public enum Format {

    BLACK("§0"),
    DARK_BLUE("§1"),
    DARK_GREEN("§2"),
    DARK_AQUA("§3"),
    DARK_RED("§4"),
    DARK_PURPLE("§5"),
    GOLD("§6"),
    GRAY("§7"),
    DARK_GRAY("§8"),
    BLUE("§9"),
    GREEN("§a"),
    AQUA("§b"),
    RED("§c"),
    LIGHT_PURPLE("§d"),
    YELLOW("§e"),
    WHITE("§f"),
    MINECOIN_GOLD("§g"),

    MATERIAL_QUARTZ("§h"),
    MATERIAL_IRON("§i"),
    MATERIAL_NETHERITE("§j"),
    MATERIAL_REDSTONE("§m"),
    MATERIAL_COPPER("§n"),
    MATERIAL_GOLD("§p"),
    MATERIAL_EMERALD("§q"),
    MATERIAL_DIAMOND("§s"),
    MATERIAL_LAPIS("§t"),
    MATERIAL_AMETHYST("§u");

    private static final String DEFAULT = "§f";
    private static final String DEFAULT_FORM = "§7";

    private final String color;

    public String colorize(String character, String message, String... variables) {
        int i = 0;
        for (String variable : variables) {
            message = message.replace("%" + i, color + variable + DEFAULT);
            i++;
        }
        return color + character + " " + DEFAULT + message;
    }

    public String lines(List<String> lines, String... variables) {
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            int i = 0;
            for (String variable : variables) {
                line = line.replace("%" + i, color + variable + DEFAULT_FORM);
                i++;
            }
            result.append(DEFAULT_FORM).append(line).append("\n");
        }
        return String.valueOf(result.append("\n"));
    }

    public String clean(String message, String... variables) {
        int i = 0;
        for (String variable : variables) {
            message = message.replace("%" + i, color + variable + DEFAULT);
            i++;
        }
        return DEFAULT + message;
    }

    public String reverseColorize(String character, String message, String... variables) {
        int i = 0;
        for (String variable : variables) {
            message = message.replace("%" + i, DEFAULT + variable + color);
            i++;
        }
        return color + character + " " + color + message;
    }

    public String reverseLines(List<String> lines, String... variables) {
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            int i = 0;
            for (String variable : variables) {
                line = line.replace("%" + i, DEFAULT_FORM + variable + color);
                i++;
            }
            result.append(color).append(line).append("\n");
        }
        return String.valueOf(result.append("\n"));
    }

    public String reverseClean(String message, String... variables) {
        int i = 0;
        for (String variable : variables) {
            message = message.replace("%" + i, DEFAULT + variable + color);
            i++;
        }
        return color + message;
    }
}
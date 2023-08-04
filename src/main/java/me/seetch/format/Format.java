package me.seetch.format;

import java.util.List;

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

    private final String color;

    Format(String color) {
        this.color = color;
    }

    private String getColor() {
        return color;
    }

    // Format more lines, use on forms.
    public String lines(List<String> lines, String... variables) {
        StringBuilder result = new StringBuilder("");
        for (String line : lines) {
            int i = 0;
            for (String variable : variables) {
                line = line.replace("%" + i, getColor() + variable + FormatPlugin.getSettings().getDefaultColorForm());
                i++;
            }
            result.append(FormatPlugin.getSettings().getDefaultColorForm()).append(line).append("\n");
        }
        return String.valueOf(result.append("\n"));
    }

    // Format message with first character.
    public String message(String message, String... variables) {
        int i = 0;
        for (String variable : variables) {
            message = message.replace("%" + i, getColor() + variable + FormatPlugin.getSettings().getDefaultColorMessage());
            i++;
        }
        return getColor() + FormatPlugin.getSettings().getCharacter() + " " + FormatPlugin.getSettings().getDefaultColorMessage() + message;
    }

    // Format message without first character.
    public String clean(String message, String... variables) {
        int i = 0;
        for (String variable : variables) {
            message = message.replace("%" + i, getColor() + variable + FormatPlugin.getSettings().getDefaultColorMessage());
            i++;
        }
        return message;
    }

    // Some standard messages used in my projects.
    public static String console() {
        return FormatPlugin.getSettings().getMessages().getConsole();
    }

    public static String ingame() {
        return FormatPlugin.getSettings().getMessages().getIngame();
    }

    public static String permission() {
        return FormatPlugin.getSettings().getMessages().getPermission();
    }

    public static String usage(String command) {
        return YELLOW.message(FormatPlugin.getSettings().getMessages().getUsage(), command);
    }
}

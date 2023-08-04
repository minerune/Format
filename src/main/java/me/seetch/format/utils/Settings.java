package me.seetch.format.utils;

import cn.nukkit.utils.Config;
import cn.nukkit.utils.ConfigSection;
import lombok.Getter;

@Getter
public class Settings {

    private final String character;
    private final String defaultColorMessage;
    private final String defaultColorForm;

    private final Messages messages;

    public Settings(Config config) {
        this.character = config.getString("character", "►");
        this.defaultColorMessage = config.getString("default-color-message", "f");
        this.defaultColorForm = config.getString("default-color-form", "7");

        this.messages = new Messages(config.getSection("messages"));
    }

    @Getter
    public static class Messages {

        private final String console;
        private final String ingame;
        private final String permission;
        private final String usage;

        public Messages(ConfigSection section) {
            this.console = section.getString("console", "Эта команда должна быть выполнена из консоли сервера.");
            this.ingame = section.getString("ingame", "Эта команда должна быть выполнена в игре.");
            this.permission = section.getString("permissions", "У вас недостаточно прав для выполнения этой команды.");
            this.usage = section.getString("usage", "Используйте: %0");
        }
    }
}

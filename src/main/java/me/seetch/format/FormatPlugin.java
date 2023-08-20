package me.seetch.format;

import cn.nukkit.plugin.PluginBase;
import lombok.AccessLevel;
import lombok.Getter;
import me.seetch.format.utils.Settings;

public class FormatPlugin extends PluginBase {

    @Getter
    public static Settings settings;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        settings = new Settings(this.getConfig());
    }
}

package com.fullhousedev.mc.staffchat;

import com.fullhousedev.mc.staffchat.commands.AdminChat;
import com.fullhousedev.mc.staffchat.commands.HelperChat;
import com.fullhousedev.mc.staffchat.commands.ModChat;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * Created by Wuffy_ on 7/17/2015.
 */
public class Main extends Plugin {

    public static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getProxy().getPluginManager().registerCommand(this, new AdminChat());
        getProxy().getPluginManager().registerCommand(this, new ModChat());
        getProxy().getPluginManager().registerCommand(this, new HelperChat());
    }

}

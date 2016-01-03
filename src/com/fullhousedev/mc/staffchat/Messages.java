package com.fullhousedev.mc.staffchat;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;

/**
 * Created by Wuffy_ on 7/17/2015.
 */
public class Messages {
    public static BaseComponent[] NO_PERMISSION = new ComponentBuilder("You don't have permission to do that!")
            .color(ChatColor.RED).create();

}

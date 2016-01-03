package com.fullhousedev.mc.staffchat.commands;

import com.fullhousedev.mc.staffchat.Main;
import com.fullhousedev.mc.staffchat.Messages;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

/**
 * Created by Wuffy_ on 7/17/2015.
 */
public class AdminChat extends Command {

    public AdminChat() {
        super("a");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        if(!commandSender.hasPermission("staffchat.admin")) {
            commandSender.sendMessage(Messages.NO_PERMISSION);
            return;
        }

        StringBuilder sb = new StringBuilder();

        for(String string : strings) {
            sb.append(string);
            sb.append(" ");
        }

        BaseComponent[] sendMessage = new ComponentBuilder("<").color(ChatColor.WHITE).append(commandSender.getName())
                .color(ChatColor.DARK_RED).append(">").color(ChatColor.WHITE).append(sb.toString()).color(ChatColor.DARK_RED).create();

        for(ProxiedPlayer player : Main.plugin.getProxy().getPlayers()) {
            if(player.hasPermission("staffchat.admin")) {
                player.sendMessage(sendMessage);
            }
        }
    }
}

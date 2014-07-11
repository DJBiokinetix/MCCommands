package me.DJBiokinetix;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Commands extends JavaPlugin{

	@Override
     public void onEnable() {
  	   getLogger().info("Plugin enabled!");
     }
     @Override
     public void onDisable() {
  	   getLogger().info("Plugin disabled!");
     }
   
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
  		   if(cmd.getName().equalsIgnoreCase("Workbench")){
		   if (args.length != 1) {
            return false;
           }
  		   if (!(sender instanceof Player)) {
            sender.sendMessage("Solo los jugadores pueden ejecutar el comando.");
            return true;
  		   }
           Player target = Bukkit.getServer().getPlayer(args[0]);
           if (target == null) {
            sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "WorkBench" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " " + args[0] + ChatColor.GOLD + " no esta conectado en este momento.");
            return true;
           }
            target.openWorkbench(null, true);
            target.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "WorkBench" + ChatColor.DARK_GRAY + "]" + ChatColor.DARK_GREEN + " " + "Abriendo la mesa de crafteos...");
		   }if(cmd.getName().equalsIgnoreCase("Fly")){
			   if (args.length != 1) {
	            return false;
	           }
	  		   if (!(sender instanceof Player)) {
	            sender.sendMessage("Solo los jugadores pueden ejecutar el comando.");
	            return true;
	  		   }
	           Player target = Bukkit.getServer().getPlayer(args[0]);
	           if (target == null) {
	            sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Fly" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " " + args[0] + ChatColor.GOLD + " no esta conectado en este momento.");
	            return true;
	           }
	            target.setAllowFlight(true);
	            target.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Fly" + ChatColor.DARK_GRAY + "]" + ChatColor.AQUA + " " + "Activando o desactivando el modo de vuelo para" + " " + args[0] + "...");
		       }if (cmd.getName().equalsIgnoreCase("Heal")) {
		    	         if (args.length != 1) {
			             return false;
			             }
			  		     if (!(sender instanceof Player)) {
			             sender.sendMessage("Solo los jugadores pueden ejecutar el comando.");
			             return true;
			  		     }
			             Player target = Bukkit.getServer().getPlayer(args[0]);
			             if (target == null) {
			             sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Heal" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " " + args[0] + ChatColor.GOLD + " no esta conectado en este momento.");
			             return true;
			             }
			             target.setFoodLevel(20);
			             target.setHealth(20);
			             target.setFireTicks(0);
			             target.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Heal" + ChatColor.DARK_GRAY + "]" + ChatColor.AQUA + " " + "Usted ha curado a" + " " + args[0] + "...");
			             }if (cmd.getName().equalsIgnoreCase("Fire")) {
					    	   if (args.length != 1) {
						       return false;
						       }
						  	   if (!(sender instanceof Player)) {
						       sender.sendMessage("Solo los jugadores pueden ejecutar el comando.");
						       return true;
						  	   }
						       Player target = Bukkit.getServer().getPlayer(args[0]);
						       if (target == null) {
						       sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.RED + "Fire" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " " + args[0] + ChatColor.GOLD + " no esta conectado en este momento.");
						       return true;
						       }
						       target.setFireTicks(1000);
						       target.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.RED + "Fire" + ChatColor.DARK_GRAY + "]" + ChatColor.DARK_RED + " " + "Usted le ha prendido fuego a" + " " + args[0] + "...");
					           }if (cmd.getName().equalsIgnoreCase("Enchantment")) {
					    	         if (args.length != 1) {
						             return false;
						             }
						  		     if (!(sender instanceof Player)) {
						             sender.sendMessage("Solo los jugadores pueden ejecutar el comando.");
						             return true;
						  		     }
						             Player target = Bukkit.getServer().getPlayer(args[0]);
						             if (target == null) {
						             sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Enchant" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " " + args[0] + ChatColor.GOLD + " no esta conectado en este momento.");
						             return true;
						             }
						             target.openEnchanting(null, true);
						             target.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Enchant" + ChatColor.DARK_GRAY + "]" + ChatColor.GREEN + " " + "Abriendo la mesa de encantamientos para" + " " + args[0] + "...");
					                 }if (cmd.getName().equalsIgnoreCase("Arrow")) {
						    	         if (args.length != 1) {
								             return false;
								             }
								  		     if (!(sender instanceof Player)) {
								             sender.sendMessage("Solo los jugadores pueden ejecutar el comando.");
								             return true;
								  		     }
								             Player target = Bukkit.getServer().getPlayer(args[0]);
								             if (target == null) {
								             sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Arrow" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " " + args[0] + ChatColor.GOLD + " no esta conectado en este momento.");
								             return true;
								             }
								             target.shootArrow().setFireTicks(1000);
								             target.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Arrow" + ChatColor.DARK_GRAY + "]" + ChatColor.GREEN + " " + "Disparando flecha...");
					                         }if(cmd.getName().equalsIgnoreCase("Firework")){
					                 			sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Fireworks" + ChatColor.DARK_GRAY + "]" + " " + ChatColor.AQUA + "Lanzando cohetes...");
					                			shootFireworks();
					                		}
					                		return false;
					                	}

					                	private void shootFireworks(){
					                		for (Player player : Bukkit.getOnlinePlayers()) {
					                			Firework fw = (Firework) player.getWorld().spawn(player.getLocation(), Firework.class);
					                			FireworkMeta fm = fw.getFireworkMeta();
					                			Random r = new Random();
					                			int fType = r.nextInt(5) + 1;
					                			Type type = null;
					                			switch (fType) {
					                			case 1:
					                				type = Type.BALL;
					                				break;
					                			case 2:
					                				type = Type.BALL_LARGE;
					                				break;
					                			case 3:
					                				type = Type.BURST;
					                				break;
					                			case 4:
					                				type = Type.CREEPER;
					                				break;
					                			case 5:
					                				type = Type.STAR;
					                				break;
					                			}
					                			Color c11 = getColour(fType);
					                			Color c21 = getColour(fType);
					                			FireworkEffect effect = FireworkEffect.builder().flicker(r.nextBoolean()).withColor(c11).withFade(c21).with(type).trail(r.nextBoolean()).build();
					                			fm.addEffect(effect);
					                			int power = r.nextInt(2) + 1;
					                			fm.setPower(power);
					                			fw.setFireworkMeta(fm);
					                		}
					                	}

					                	public Color getColour(int c){
					                switch (c){
					                case 1:
					                	return Color.AQUA;
					                case 2:
					                	return Color.BLACK;
					                case 3:
					                	return Color.BLUE;
					                case 4:
					                	return Color.FUCHSIA;
					                case 5:
					                	return Color.GRAY;
					                case 6:
					                	return Color.GREEN;
					                case 7:
					                	return Color.LIME;
					                case 8:
					                	return Color.MAROON;
					                case 9:
					                	return Color.NAVY;
					                case 10:
					                	return Color.OLIVE;
					                case 11:
					                	return Color.ORANGE;
					                case 12:
					                	return Color.PURPLE;
					                case 13:
					                	return Color.RED;
					                case 14:
					                	return Color.SILVER;
					                case 15:
					                	return Color.TEAL;
					                case 16:
					                	return Color.WHITE;
					                case 17:
					                	return Color.YELLOW;
					                		}
					                return null;
					                }
}

package net.mcreator.pookie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class DecimatorEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<WORLD_DESTROYER> AAAAAAAGHHH FUCK YOU AUUUGHHHHHHHHHHHHHHHHHH OWWWWWWWWWWWWWW BITCHHHHHHH"), false);
	}
}

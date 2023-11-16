package net.mcreator.pookie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.pookie.init.PookieModBlocks;

public class StargrassUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))
				&& ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == PookieModBlocks.STARDIRT.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == PookieModBlocks.STARDIRT.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == PookieModBlocks.STARDIRT.get() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == PookieModBlocks.STARDIRT.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == PookieModBlocks.STARDIRT.get() || (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == PookieModBlocks.STARDIRT.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == PookieModBlocks.STARDIRT.get() || (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == PookieModBlocks.STARDIRT.get()
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == PookieModBlocks.STARDIRT.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == PookieModBlocks.STARDIRT.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == PookieModBlocks.STARDIRT.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == PookieModBlocks.STARDIRT.get())) {
			world.setBlock(BlockPos.containing(x, y, z), PookieModBlocks.STARGRASS.get().defaultBlockState(), 3);
		}
	}
}

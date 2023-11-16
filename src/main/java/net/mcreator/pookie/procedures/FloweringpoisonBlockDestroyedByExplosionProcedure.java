package net.mcreator.pookie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.pookie.init.PookieModBlocks;

public class FloweringpoisonBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), PookieModBlocks.SENTIANCE.get().defaultBlockState(), 3);
	}
}

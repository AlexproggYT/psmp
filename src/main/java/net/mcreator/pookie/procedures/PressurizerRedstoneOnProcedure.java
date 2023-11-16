package net.mcreator.pookie.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.pookie.init.PookieModBlocks;

public class PressurizerRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double fromZ = 0;
		double fromX = 0;
		double fromY = 0;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.BLUE_ICE.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.BLUE_ICE.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.MAGMA_BLOCK.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.MAGMA_BLOCK.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == PookieModBlocks.GHOSTCHEESEBLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), PookieModBlocks.AUIJKGHNJU.get().defaultBlockState(), 3);
		}
	}
}

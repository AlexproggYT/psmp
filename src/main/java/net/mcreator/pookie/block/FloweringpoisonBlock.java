
package net.mcreator.pookie.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.pookie.procedures.FloweringpoisonMobplayerCollidesBlockProcedure;
import net.mcreator.pookie.procedures.FloweringpoisonBlockDestroyedByExplosionProcedure;
import net.mcreator.pookie.init.PookieModFluids;

public class FloweringpoisonBlock extends LiquidBlock {
	public FloweringpoisonBlock() {
		super(() -> PookieModFluids.FLOWERINGPOISON.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(1f).noCollission().noLootTable());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 1;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 1000;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		FloweringpoisonMobplayerCollidesBlockProcedure.execute(entity);
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		FloweringpoisonBlockDestroyedByExplosionProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}

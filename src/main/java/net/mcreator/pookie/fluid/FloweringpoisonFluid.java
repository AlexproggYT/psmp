
package net.mcreator.pookie.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.pookie.init.PookieModItems;
import net.mcreator.pookie.init.PookieModFluids;
import net.mcreator.pookie.init.PookieModFluidTypes;
import net.mcreator.pookie.init.PookieModBlocks;

public abstract class FloweringpoisonFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PookieModFluidTypes.FLOWERINGPOISON_TYPE.get(), () -> PookieModFluids.FLOWERINGPOISON.get(), () -> PookieModFluids.FLOWING_FLOWERINGPOISON.get())
			.explosionResistance(1f).tickRate(10).slopeFindDistance(1).bucket(() -> PookieModItems.FLOWERINGPOISON_BUCKET.get()).block(() -> (LiquidBlock) PookieModBlocks.FLOWERINGPOISON.get());

	private FloweringpoisonFluid() {
		super(PROPERTIES);
	}

	public static class Source extends FloweringpoisonFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends FloweringpoisonFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

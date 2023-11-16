
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.pookie.fluid.types.FloweringpoisonFluidType;
import net.mcreator.pookie.PookieMod;

public class PookieModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, PookieMod.MODID);
	public static final RegistryObject<FluidType> FLOWERINGPOISON_TYPE = REGISTRY.register("floweringpoison", () -> new FloweringpoisonFluidType());
}


/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.pookie.fluid.FloweringpoisonFluid;
import net.mcreator.pookie.PookieMod;

public class PookieModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, PookieMod.MODID);
	public static final RegistryObject<FlowingFluid> FLOWERINGPOISON = REGISTRY.register("floweringpoison", () -> new FloweringpoisonFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_FLOWERINGPOISON = REGISTRY.register("flowing_floweringpoison", () -> new FloweringpoisonFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(FLOWERINGPOISON.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_FLOWERINGPOISON.get(), RenderType.translucent());
		}
	}
}

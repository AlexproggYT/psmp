
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.pookie.PookieMod;

public class PookieModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, PookieMod.MODID);
	public static final RegistryObject<PaintingVariant> SILLYRAT = REGISTRY.register("sillyrat", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> LIFE = REGISTRY.register("life", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> KP = REGISTRY.register("kp", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> GRAVEMISTAKE = REGISTRY.register("gravemistake", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> CAMERADAY = REGISTRY.register("cameraday", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> HONEYBADGER = REGISTRY.register("honeybadger", () -> new PaintingVariant(32, 16));
	public static final RegistryObject<PaintingVariant> BURGER = REGISTRY.register("burger", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> SCREENSHOT = REGISTRY.register("screenshot", () -> new PaintingVariant(32, 16));
}

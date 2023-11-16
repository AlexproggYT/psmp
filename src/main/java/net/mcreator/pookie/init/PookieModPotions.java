
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.pookie.PookieMod;

public class PookieModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, PookieMod.MODID);
	public static final RegistryObject<Potion> PARALYSISP = REGISTRY.register("paralysisp", () -> new Potion(new MobEffectInstance(PookieModMobEffects.PARALYSIS.get(), 1200, 0, false, true)));
}

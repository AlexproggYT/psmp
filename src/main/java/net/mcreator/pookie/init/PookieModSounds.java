
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.pookie.PookieMod;

public class PookieModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PookieMod.MODID);
	public static final RegistryObject<SoundEvent> RATHURT = REGISTRY.register("rathurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "rathurt")));
	public static final RegistryObject<SoundEvent> RATSAY = REGISTRY.register("ratsay", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "ratsay")));
	public static final RegistryObject<SoundEvent> RATSTEP = REGISTRY.register("ratstep", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "ratstep")));
	public static final RegistryObject<SoundEvent> RATDIES = REGISTRY.register("ratdies", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "ratdies")));
	public static final RegistryObject<SoundEvent> HI = REGISTRY.register("hi", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "hi")));
	public static final RegistryObject<SoundEvent> PIZZA = REGISTRY.register("pizza", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "pizza")));
	public static final RegistryObject<SoundEvent> PEDRO = REGISTRY.register("pedro", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "pedro")));
	public static final RegistryObject<SoundEvent> MMAGICHITSOUND = REGISTRY.register("mmagichitsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "mmagichitsound")));
	public static final RegistryObject<SoundEvent> LUNARABYSS = REGISTRY.register("lunarabyss", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "lunarabyss")));
	public static final RegistryObject<SoundEvent> VICTIMMUS = REGISTRY.register("victimmus", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "victimmus")));
	public static final RegistryObject<SoundEvent> CROSSTHEMEREMIXMUS = REGISTRY.register("crossthemeremixmus", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "crossthemeremixmus")));
	public static final RegistryObject<SoundEvent> DARLINGMUS = REGISTRY.register("darlingmus", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pookie", "darlingmus")));
}

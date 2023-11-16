
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.pookie.world.features.ores.TopazOreFeature;
import net.mcreator.pookie.world.features.ores.SunstoneOreFeature;
import net.mcreator.pookie.world.features.ores.SaphireOreFeature;
import net.mcreator.pookie.world.features.ores.RutilesOreFeature;
import net.mcreator.pookie.world.features.ores.RubyOreFeature;
import net.mcreator.pookie.world.features.ores.RosequartzOreFeature;
import net.mcreator.pookie.world.features.ores.RhyoliteOreFeature;
import net.mcreator.pookie.world.features.ores.PeridotOreFeature;
import net.mcreator.pookie.world.features.ores.OpalOreFeature;
import net.mcreator.pookie.world.features.ores.OnionblockFeature;
import net.mcreator.pookie.world.features.ores.NebulaOreFeature;
import net.mcreator.pookie.world.features.ores.MagmiteOreFeature;
import net.mcreator.pookie.world.features.ores.CoolantOreFeature;
import net.mcreator.pookie.world.features.ores.BlackironOreFeature;
import net.mcreator.pookie.world.features.ores.AquamarineOreFeature;
import net.mcreator.pookie.world.features.ores.AlexandriteOreFeature;
import net.mcreator.pookie.world.features.VoidlantpatchFeature;
import net.mcreator.pookie.world.features.StrawwberypatchFeature;
import net.mcreator.pookie.world.features.OnionpatcFeature;
import net.mcreator.pookie.PookieMod;

@Mod.EventBusSubscriber
public class PookieModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PookieMod.MODID);
	public static final RegistryObject<Feature<?>> ONIONBLOCK = REGISTRY.register("onionblock", OnionblockFeature::new);
	public static final RegistryObject<Feature<?>> SUNSTONE_ORE = REGISTRY.register("sunstone_ore", SunstoneOreFeature::new);
	public static final RegistryObject<Feature<?>> NEBULA_ORE = REGISTRY.register("nebula_ore", NebulaOreFeature::new);
	public static final RegistryObject<Feature<?>> TOPAZ_ORE = REGISTRY.register("topaz_ore", TopazOreFeature::new);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::new);
	public static final RegistryObject<Feature<?>> SAPHIRE_ORE = REGISTRY.register("saphire_ore", SaphireOreFeature::new);
	public static final RegistryObject<Feature<?>> ROSEQUARTZ_ORE = REGISTRY.register("rosequartz_ore", RosequartzOreFeature::new);
	public static final RegistryObject<Feature<?>> ONIONPATC = REGISTRY.register("onionpatc", OnionpatcFeature::new);
	public static final RegistryObject<Feature<?>> STRAWWBERYPATCH = REGISTRY.register("strawwberypatch", StrawwberypatchFeature::new);
	public static final RegistryObject<Feature<?>> VOIDLANTPATCH = REGISTRY.register("voidlantpatch", VoidlantpatchFeature::new);
	public static final RegistryObject<Feature<?>> PERIDOT_ORE = REGISTRY.register("peridot_ore", PeridotOreFeature::new);
	public static final RegistryObject<Feature<?>> OPAL_ORE = REGISTRY.register("opal_ore", OpalOreFeature::new);
	public static final RegistryObject<Feature<?>> ALEXANDRITE_ORE = REGISTRY.register("alexandrite_ore", AlexandriteOreFeature::new);
	public static final RegistryObject<Feature<?>> MAGMITE_ORE = REGISTRY.register("magmite_ore", MagmiteOreFeature::new);
	public static final RegistryObject<Feature<?>> COOLANT_ORE = REGISTRY.register("coolant_ore", CoolantOreFeature::new);
	public static final RegistryObject<Feature<?>> RHYOLITE_ORE = REGISTRY.register("rhyolite_ore", RhyoliteOreFeature::new);
	public static final RegistryObject<Feature<?>> RUTILES_ORE = REGISTRY.register("rutiles_ore", RutilesOreFeature::new);
	public static final RegistryObject<Feature<?>> AQUAMARINE_ORE = REGISTRY.register("aquamarine_ore", AquamarineOreFeature::new);
	public static final RegistryObject<Feature<?>> BLACKIRON_ORE = REGISTRY.register("blackiron_ore", BlackironOreFeature::new);
}

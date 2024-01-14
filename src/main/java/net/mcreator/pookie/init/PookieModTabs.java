
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pookie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PookieModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(PookieModBlocks.DIMESNIONCBLOCK.get().asItem());
			tabData.accept(PookieModBlocks.SUNSTONE_ORE.get().asItem());
			tabData.accept(PookieModBlocks.SUNSTONE_BLOCK.get().asItem());
			tabData.accept(PookieModBlocks.NEBULA_ORE.get().asItem());
			tabData.accept(PookieModBlocks.NEBULA_BLOCK.get().asItem());
			tabData.accept(PookieModBlocks.TOPAZ_ORE.get().asItem());
			tabData.accept(PookieModBlocks.TOPAZ_BLOCK.get().asItem());
			tabData.accept(PookieModBlocks.RUBY_ORE.get().asItem());
			tabData.accept(PookieModBlocks.RUBY_BLOCK.get().asItem());
			tabData.accept(PookieModBlocks.SAPHIRE_ORE.get().asItem());
			tabData.accept(PookieModBlocks.SAPHIRE_BLOCK.get().asItem());
			tabData.accept(PookieModBlocks.ROSEQUARTZ_ORE.get().asItem());
			tabData.accept(PookieModBlocks.ROSEQUARTZ_BLOCK.get().asItem());
			tabData.accept(PookieModBlocks.PURIFIEDASTRALIUM.get().asItem());
			tabData.accept(PookieModBlocks.STARSTONE.get().asItem());
			tabData.accept(PookieModBlocks.STARDIRT.get().asItem());
			tabData.accept(PookieModBlocks.STARGRASS.get().asItem());
			tabData.accept(PookieModBlocks.CHEESEBLOCK.get().asItem());
			tabData.accept(PookieModBlocks.GHOSTCHEESEBLOCK.get().asItem());
			tabData.accept(PookieModBlocks.PEDROLIUM_ORE.get().asItem());
			tabData.accept(PookieModBlocks.PEDROLIUM_BLOCK.get().asItem());
			tabData.accept(PookieModBlocks.STEELPLATEBLOCK.get().asItem());
			tabData.accept(PookieModBlocks.PRESSURIZEDMERCURY.get().asItem());
			tabData.accept(PookieModBlocks.VOIDLANTERN.get().asItem());
			tabData.accept(PookieModBlocks.SENTIANCE.get().asItem());
			tabData.accept(PookieModBlocks.STEELPLATESTAIRS.get().asItem());
			tabData.accept(PookieModBlocks.STEELVENTSTAIRS.get().asItem());
			tabData.accept(PookieModBlocks.STEELVENTBLOCK.get().asItem());
			tabData.accept(PookieModBlocks.STEELSHEETBLOCK.get().asItem());
			tabData.accept(PookieModBlocks.STEELSHEETSTAIRS.get().asItem());
			tabData.accept(PookieModBlocks.STEELBOARDBLOCK.get().asItem());
			tabData.accept(PookieModBlocks.STEELBOARDSTAIRS.get().asItem());
			tabData.accept(PookieModBlocks.STEELBOARDSLAB.get().asItem());
			tabData.accept(PookieModBlocks.STEELPLATESLAB.get().asItem());
			tabData.accept(PookieModBlocks.STEELSHEETSLAB.get().asItem());
			tabData.accept(PookieModBlocks.STEELVENTSLAB.get().asItem());
			tabData.accept(PookieModBlocks.STEELTRUSSBLOCK.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(PookieModBlocks.EXPLOSIVEDRILL.get().asItem());
			tabData.accept(PookieModBlocks.PRESSURIZER.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(PookieModItems.SUNSTONE_SWORD.get());
			tabData.accept(PookieModItems.NEBULA_SWORD.get());
			tabData.accept(PookieModItems.NEBULA_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.NEBULA_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.NEBULA_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.NEBULA_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.SUNSTONE_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.SUNSTONE_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.SUNSTONE_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.SUNSTONE_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.ENDICHITE_SWORD.get());
			tabData.accept(PookieModItems.ENDICHITE_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.ENDICHITE_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.ENDICHITE_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.ENDICHITE_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.REDSTONE_SWORD.get());
			tabData.accept(PookieModItems.REDSTONE_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.REDSTONE_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.REDSTONE_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.REDSTONE_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.LAPIS_SWORD.get());
			tabData.accept(PookieModItems.LAPIS_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.LAPIS_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.LAPIS_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.LAPIS_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.EMERELD_SWORD.get());
			tabData.accept(PookieModItems.EMERELD_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.EMERELD_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.EMERELD_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.EMERELD_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.AMETHYST_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.AMETHYST_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.AMETHYST_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.AMETHYST_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.AMETHYST_SWORD.get());
			tabData.accept(PookieModItems.COPPER_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.COPPER_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.COPPER_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.COPPER_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.COPPER_SWORD.get());
			tabData.accept(PookieModItems.TOPAZ_SWORD.get());
			tabData.accept(PookieModItems.TOPAZ_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.TOPAZ_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.TOPAZ_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.TOPAZ_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.RUBY_SWORD.get());
			tabData.accept(PookieModItems.RUBY_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.RUBY_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.RUBY_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.RUBY_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.SAPHIRE_SWORD.get());
			tabData.accept(PookieModItems.SAPHIRE_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.SAPHIRE_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.SAPHIRE_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.SAPHIRE_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.ROSEQUARTZ_SWORD.get());
			tabData.accept(PookieModItems.ROSEQUARTZ_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.ROSEQUARTZ_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.ROSEQUARTZ_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.ROSEQUARTZ_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.BREAD_SWORD.get());
			tabData.accept(PookieModItems.BREAD_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.BREAD_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.BREAD_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.BREAD_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.MAINTENANCEMAGIC.get());
			tabData.accept(PookieModItems.LIGHTNINGCANNON.get());
			tabData.accept(PookieModItems.PEDROLIUM_SWORD.get());
			tabData.accept(PookieModItems.PEDROLIUM_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.PEDROLIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.PEDROLIUM_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.PEDROLIUM_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.STEEL_SWORD.get());
			tabData.accept(PookieModItems.STEEL_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.STEEL_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.STEEL_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.STEEL_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.FATTWIG.get());
			tabData.accept(PookieModItems.ECHO_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.ECHO_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.ECHO_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.ECHO_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.HONEYCOMB_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.HONEYCOMB_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.HONEYCOMB_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.HONEYCOMB_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.PRISMARINE_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.PRISMARINE_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.PRISMARINE_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.PRISMARINE_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.ECHO_SWORD.get());
			tabData.accept(PookieModItems.HONEYCOMB_SWORD.get());
			tabData.accept(PookieModItems.PRISMARINE_SWORD.get());
			tabData.accept(PookieModItems.PERIDOT_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.PERIDOT_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.PERIDOT_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.PERIDOT_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.PERIDOT_SWORD.get());
			tabData.accept(PookieModItems.OBSIDIAN_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.OBSIDIAN_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.OBSIDIAN_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.OBSIDIAN_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.OPAL_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.OPAL_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.OPAL_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.OPAL_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.OBSIDIAN_SWORD.get());
			tabData.accept(PookieModItems.OPAL_SWORD.get());
			tabData.accept(PookieModItems.ALEXANDRITE_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.ALEXANDRITE_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.ALEXANDRITE_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.ALEXANDRITE_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.MAGMITE_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.MAGMITE_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.MAGMITE_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.MAGMITE_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.COOLANT_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.COOLANT_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.COOLANT_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.COOLANT_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.RHYOLITE_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.RHYOLITE_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.RHYOLITE_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.RHYOLITE_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.RUTILES_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.RUTILES_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.RUTILES_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.RUTILES_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.AQUAMARINE_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.AQUAMARINE_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.AQUAMARINE_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.AQUAMARINE_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.ALEXANDRITE_SWORD.get());
			tabData.accept(PookieModItems.MAGMITE_SWORD.get());
			tabData.accept(PookieModItems.COOLANT_SWORD.get());
			tabData.accept(PookieModItems.RHYOLITE_SWORD.get());
			tabData.accept(PookieModItems.RUTILES_SWORD.get());
			tabData.accept(PookieModItems.AQUAMARINE_SWORD.get());
			tabData.accept(PookieModItems.BLACKIRON_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.BLACKIRON_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.BLACKIRON_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.BLACKIRON_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.BLACKIRON_SWORD.get());
			tabData.accept(PookieModItems.QUARTZ_ARMOR_HELMET.get());
			tabData.accept(PookieModItems.QUARTZ_ARMOR_CHESTPLATE.get());
			tabData.accept(PookieModItems.QUARTZ_ARMOR_LEGGINGS.get());
			tabData.accept(PookieModItems.QUARTZ_ARMOR_BOOTS.get());
			tabData.accept(PookieModItems.QUARTZ_SWORD.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PookieModItems.WEURM_SPAWN_EGG.get());
			tabData.accept(PookieModItems.ALBINORAT_SPAWN_EGG.get());
			tabData.accept(PookieModBlocks.ANCIENTEGG.get().asItem());
			tabData.accept(PookieModItems.SUNSTONE_DUST.get());
			tabData.accept(PookieModItems.NEBULA.get());
			tabData.accept(PookieModItems.ENDERCORE.get());
			tabData.accept(PookieModItems.NETHERCORE.get());
			tabData.accept(PookieModItems.EARTHCORE.get());
			tabData.accept(PookieModItems.TOPAZ_INGOT.get());
			tabData.accept(PookieModItems.RUBY.get());
			tabData.accept(PookieModItems.SAPHIRE.get());
			tabData.accept(PookieModItems.ROSEQUARTZ.get());
			tabData.accept(PookieModItems.GALAXYDEMICORE.get());
			tabData.accept(PookieModItems.PEDROHGFD.get());
			tabData.accept(PookieModItems.DONTPLAYTHIS.get());
			tabData.accept(PookieModItems.PIZZATI.get());
			tabData.accept(PookieModItems.PEDROLIUM.get());
			tabData.accept(PookieModItems.STEELMIX.get());
			tabData.accept(PookieModItems.STEELINGOT.get());
			tabData.accept(PookieModItems.STEELPLATE.get());
			tabData.accept(PookieModItems.STEELDISC.get());
			tabData.accept(PookieModItems.ONIONCREEPER_SPAWN_EGG.get());
			tabData.accept(PookieModItems.BLUEWEURM_SPAWN_EGG.get());
			tabData.accept(PookieModItems.GREENWEURM_SPAWN_EGG.get());
			tabData.accept(PookieModItems.ALBINOWOM_SPAWN_EGG.get());
			tabData.accept(PookieModItems.PINKWOM_SPAWN_EGG.get());
			tabData.accept(PookieModItems.ECHOREMNANT_SPAWN_EGG.get());
			tabData.accept(PookieModItems.FRAGMENT_SPAWN_EGG.get());
			tabData.accept(PookieModItems.DECIMATOR_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(PookieModItems.STEELROD.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PookieModItems.DIMENSION.get());
			tabData.accept(PookieModItems.SUNSTONE_PICKAXE.get());
			tabData.accept(PookieModItems.SUNSTONE_AXE.get());
			tabData.accept(PookieModItems.SUNSTONE_SHOVEL.get());
			tabData.accept(PookieModItems.SUNSTONE_HOE.get());
			tabData.accept(PookieModItems.NEBULA_PICKAXE.get());
			tabData.accept(PookieModItems.NEBULA_AXE.get());
			tabData.accept(PookieModItems.NEBULA_SHOVEL.get());
			tabData.accept(PookieModItems.NEBULA_HOE.get());
			tabData.accept(PookieModItems.ENDICHITE_PICKAXE.get());
			tabData.accept(PookieModItems.ENDICHITE_AXE.get());
			tabData.accept(PookieModItems.ENDICHITE_SHOVEL.get());
			tabData.accept(PookieModItems.ENDICHITE_HOE.get());
			tabData.accept(PookieModItems.REDSTONE_PICKAXE.get());
			tabData.accept(PookieModItems.REDSTONE_AXE.get());
			tabData.accept(PookieModItems.REDSTONE_SHOVEL.get());
			tabData.accept(PookieModItems.REDSTONE_HOE.get());
			tabData.accept(PookieModItems.LAPIS_PICKAXE.get());
			tabData.accept(PookieModItems.LAPIS_AXE.get());
			tabData.accept(PookieModItems.LAPIS_SHOVEL.get());
			tabData.accept(PookieModItems.LAPIS_HOE.get());
			tabData.accept(PookieModItems.EMERELD_PICKAXE.get());
			tabData.accept(PookieModItems.EMERELD_AXE.get());
			tabData.accept(PookieModItems.EMERELD_SHOVEL.get());
			tabData.accept(PookieModItems.EMERELD_HOE.get());
			tabData.accept(PookieModItems.AMETHYST_PICKAXE.get());
			tabData.accept(PookieModItems.AMETHYST_AXE.get());
			tabData.accept(PookieModItems.AMETHYST_SHOVEL.get());
			tabData.accept(PookieModItems.AMETHYST_HOE.get());
			tabData.accept(PookieModItems.COPPER_PICKAXE.get());
			tabData.accept(PookieModItems.COPPER_AXE.get());
			tabData.accept(PookieModItems.COPPER_SHOVEL.get());
			tabData.accept(PookieModItems.COPPER_HOE.get());
			tabData.accept(PookieModItems.TOPAZ_PICKAXE.get());
			tabData.accept(PookieModItems.TOPAZ_AXE.get());
			tabData.accept(PookieModItems.TOPAZ_SHOVEL.get());
			tabData.accept(PookieModItems.TOPAZ_HOE.get());
			tabData.accept(PookieModItems.RUBY_PICKAXE.get());
			tabData.accept(PookieModItems.RUBY_AXE.get());
			tabData.accept(PookieModItems.RUBY_SHOVEL.get());
			tabData.accept(PookieModItems.RUBY_HOE.get());
			tabData.accept(PookieModItems.SAPHIRE_PICKAXE.get());
			tabData.accept(PookieModItems.SAPHIRE_AXE.get());
			tabData.accept(PookieModItems.SAPHIRE_SHOVEL.get());
			tabData.accept(PookieModItems.SAPHIRE_HOE.get());
			tabData.accept(PookieModItems.ROSEQUARTZ_PICKAXE.get());
			tabData.accept(PookieModItems.ROSEQUARTZ_AXE.get());
			tabData.accept(PookieModItems.ROSEQUARTZ_SHOVEL.get());
			tabData.accept(PookieModItems.ROSEQUARTZ_HOE.get());
			tabData.accept(PookieModItems.BREAD_PICKAXE.get());
			tabData.accept(PookieModItems.BREAD_AXE.get());
			tabData.accept(PookieModItems.BREAD_SHOVEL.get());
			tabData.accept(PookieModItems.BREAD_HOE.get());
			tabData.accept(PookieModItems.ASTRAL.get());
			tabData.accept(PookieModItems.PEDROLIUM_PICKAXE.get());
			tabData.accept(PookieModItems.PEDROLIUM_AXE.get());
			tabData.accept(PookieModItems.PEDROLIUM_SHOVEL.get());
			tabData.accept(PookieModItems.PEDROLIUM_HOE.get());
			tabData.accept(PookieModItems.STEEL_PICKAXE.get());
			tabData.accept(PookieModItems.STEEL_AXE.get());
			tabData.accept(PookieModItems.STEEL_SHOVEL.get());
			tabData.accept(PookieModItems.STEEL_HOE.get());
			tabData.accept(PookieModItems.NULLZONE.get());
			tabData.accept(PookieModItems.ECHO_PICKAXE.get());
			tabData.accept(PookieModItems.ECHO_AXE.get());
			tabData.accept(PookieModItems.ECHO_SHOVEL.get());
			tabData.accept(PookieModItems.ECHO_HOE.get());
			tabData.accept(PookieModItems.HONEYCOMB_PICKAXE.get());
			tabData.accept(PookieModItems.HONEYCOMB_AXE.get());
			tabData.accept(PookieModItems.HONEYCOMB_SHOVEL.get());
			tabData.accept(PookieModItems.HONEYCOMB_HOE.get());
			tabData.accept(PookieModItems.PRISMARINE_PICKAXE.get());
			tabData.accept(PookieModItems.PRISMARINE_AXE.get());
			tabData.accept(PookieModItems.PRISMARINE_SHOVEL.get());
			tabData.accept(PookieModItems.PRISMARINE_HOE.get());
			tabData.accept(PookieModItems.PERIDOT_PICKAXE.get());
			tabData.accept(PookieModItems.PERIDOT_AXE.get());
			tabData.accept(PookieModItems.PERIDOT_SHOVEL.get());
			tabData.accept(PookieModItems.PERIDOT_HOE.get());
			tabData.accept(PookieModItems.OBSIDIAN_PICKAXE.get());
			tabData.accept(PookieModItems.OBSIDIAN_AXE.get());
			tabData.accept(PookieModItems.OBSIDIAN_SHOVEL.get());
			tabData.accept(PookieModItems.OBSIDIAN_HOE.get());
			tabData.accept(PookieModItems.OPAL_PICKAXE.get());
			tabData.accept(PookieModItems.OPAL_AXE.get());
			tabData.accept(PookieModItems.OPAL_SHOVEL.get());
			tabData.accept(PookieModItems.OPAL_HOE.get());
			tabData.accept(PookieModItems.ALEXANDRITE_PICKAXE.get());
			tabData.accept(PookieModItems.ALEXANDRITE_AXE.get());
			tabData.accept(PookieModItems.ALEXANDRITE_SHOVEL.get());
			tabData.accept(PookieModItems.ALEXANDRITE_HOE.get());
			tabData.accept(PookieModItems.MAGMITE_PICKAXE.get());
			tabData.accept(PookieModItems.MAGMITE_AXE.get());
			tabData.accept(PookieModItems.MAGMITE_SHOVEL.get());
			tabData.accept(PookieModItems.MAGMITE_HOE.get());
			tabData.accept(PookieModItems.COOLANT_PICKAXE.get());
			tabData.accept(PookieModItems.COOLANT_AXE.get());
			tabData.accept(PookieModItems.COOLANT_SHOVEL.get());
			tabData.accept(PookieModItems.COOLANT_HOE.get());
			tabData.accept(PookieModItems.RHYOLITE_PICKAXE.get());
			tabData.accept(PookieModItems.RHYOLITE_AXE.get());
			tabData.accept(PookieModItems.RHYOLITE_SHOVEL.get());
			tabData.accept(PookieModItems.RHYOLITE_HOE.get());
			tabData.accept(PookieModItems.RUTILES_PICKAXE.get());
			tabData.accept(PookieModItems.RUTILES_AXE.get());
			tabData.accept(PookieModItems.RUTILES_SHOVEL.get());
			tabData.accept(PookieModItems.RUTILES_HOE.get());
			tabData.accept(PookieModItems.AQUAMARINE_PICKAXE.get());
			tabData.accept(PookieModItems.AQUAMARINE_AXE.get());
			tabData.accept(PookieModItems.AQUAMARINE_SHOVEL.get());
			tabData.accept(PookieModItems.AQUAMARINE_HOE.get());
			tabData.accept(PookieModItems.BLACKIRON_PICKAXE.get());
			tabData.accept(PookieModItems.BLACKIRON_AXE.get());
			tabData.accept(PookieModItems.BLACKIRON_SHOVEL.get());
			tabData.accept(PookieModItems.BLACKIRON_HOE.get());
			tabData.accept(PookieModItems.DARLING.get());
			tabData.accept(PookieModItems.REVEX.get());
			tabData.accept(PookieModItems.VICTIM.get());
			tabData.accept(PookieModItems.QUARTZ_PICKAXE.get());
			tabData.accept(PookieModItems.QUARTZ_AXE.get());
			tabData.accept(PookieModItems.QUARTZ_SHOVEL.get());
			tabData.accept(PookieModItems.QUARTZ_HOE.get());
		}

		if (tabData.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(PookieModItems.STRAWBERRYCHUNK.get());
			tabData.accept(PookieModBlocks.GIANTSTRAWBERRY.get().asItem());
			tabData.accept(PookieModItems.ONION.get());
			tabData.accept(PookieModBlocks.ONIONBLOCK.get().asItem());
			tabData.accept(PookieModItems.BAGUETTE.get());
			tabData.accept(PookieModItems.COOKIECAT.get());
			tabData.accept(PookieModItems.CHEESE.get());
			tabData.accept(PookieModItems.GHOSTCHEESE.get());
		}
	}
}
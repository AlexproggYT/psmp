package net.mcreator.pookie.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.pookie.network.PookieModVariables;
import net.mcreator.pookie.PookieMod;

public class CheesemoonactiveProcedure {
	public static void execute(LevelAccessor world) {
		PookieModVariables.MapVariables.get(world).cheesemooncooldown = true;
		PookieModVariables.MapVariables.get(world).syncData(world);
		PookieModVariables.WorldVariables.get(world).ischeesemoon = true;
		PookieModVariables.WorldVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _level)
			_level.setDayTime(18000);
		PookieMod.queueServerWork(40, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.MASTER, (float) 0.1, (float) 0.8);
				} else {
					_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.MASTER, (float) 0.1, (float) 0.8, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fox.screech")), SoundSource.MASTER, 7, (float) 0.5);
				} else {
					_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fox.screech")), SoundSource.MASTER, 7, (float) 0.5, false);
				}
			}
			PookieMod.queueServerWork(6000, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pookie:ratdies")), SoundSource.MASTER, 4, (float) 0.5);
					} else {
						_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pookie:ratdies")), SoundSource.MASTER, 4, (float) 0.5, false);
					}
				}
				PookieModVariables.WorldVariables.get(world).ischeesemoon = false;
				PookieModVariables.WorldVariables.get(world).syncData(world);
				PookieModVariables.MapVariables.get(world).cheesemooncooldown = false;
				PookieModVariables.MapVariables.get(world).syncData(world);
			});
		});
	}
}

package net.mcreator.pookie.procedures;

import net.minecraft.world.entity.Entity;

public class StarProjectileHitsBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
	}
}

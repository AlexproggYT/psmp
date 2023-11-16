package net.mcreator.pookie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class ParalysisOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < 5; index0++) {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			entity.setDeltaMovement(new Vec3(0, 0, 0));
		}
	}
}
